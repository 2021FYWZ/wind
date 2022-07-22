package com.wind.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wind.entity.Order;
import com.wind.service.OrderService;
import com.wind.utils.ParamsErrors;
import com.wind.utils.RespMsg;
import com.wind.utils.RespStatus;
import com.wind.utils.Tokens;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class OrderController {
    @Autowired
    OrderService orderService;

    /**
     * 发布订单
     * @param order 订单信息
     * @param result 校验结果
     * @param token 令牌
     * @return 处理信息
     */
    @RequestMapping(value = "/order", method = RequestMethod.POST)
    @ResponseBody
    public RespMsg addOrder(@Valid Order order, BindingResult result,
                            @RequestParam(defaultValue = "") String token) {
        // token校验
        if ("".equals(token)) {
            return RespMsg.result(RespStatus.MISS_TOKEN.getStatus(), RespStatus.MISS_TOKEN.getMessage());
        }
        if (Tokens.isMatched(token, order.getuId())) {
            return RespMsg.result(RespStatus.ILLEGAL_PARAMS.getStatus(), RespStatus.ILLEGAL_PARAMS.getMessage());
        }

        // 参数校验
        if (result.hasErrors()) {
            return ParamsErrors.getErrorsMsg(result);
        }

        // 新增订单
        order.setoState(0);// 发布
        if (!orderService.addOrder(order)) {// 失败
            return RespMsg.result(RespStatus.FAIL_ADD_ORDER.getStatus(), RespStatus.FAIL_ADD_ORDER.getMessage());
        }
        return RespMsg.result(RespStatus.SUCCESS_ADD_ORDER.getStatus(), RespStatus.SUCCESS_ADD_ORDER.getMessage());
    }

    /**
     * 查询首页订单(未接单)
     * @param pn 页码
     * @param pSize 页长
     * @return 订单信息
     */
    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    @ResponseBody
    public RespMsg getOrder(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
                            @RequestParam(value = "pSize", defaultValue = "10") Integer pSize) {
        // 查询数据
        List<Order> orderList = orderService.getOrderByStatus(pn, pSize);
        return RespMsg.result(RespStatus.SUCCESS_GET_ORDER.getStatus(), RespStatus.SUCCESS_GET_ORDER.getMessage()).add("data", orderList);
    }

    /**
     * 查询用户订单（分页）
     * @param status 要查询的状态
     * @param pn 页码
     * @param pSize 页长
     * @param token 令牌
     * @param uId 用户id
     * @return 订单信息
     */
    @RequestMapping(value = "/orders/{uId}", method = RequestMethod.GET)
    @ResponseBody
    public RespMsg getOrderByStatus(@RequestParam(value = "status", defaultValue = "0") Integer status,
                                    @RequestParam(value = "pn", defaultValue = "1") Integer pn,
                                    @RequestParam(value = "pSize", defaultValue = "10") Integer pSize,
                                    @RequestParam(value = "token", defaultValue = "") String token,
                                    @PathVariable(value = "uId") Integer uId) {
        // 验证token
        if ("".equals(token)) {
            return RespMsg.result(RespStatus.MISS_TOKEN.getStatus(), RespStatus.MISS_TOKEN.getMessage());
        }
        // 验证用户身份
        if (Tokens.isMatched(token, uId)) {
            // 查询数据
            List<Order> orderList = orderService.getOrderByStatusAndUId(status, pn, pSize, uId);
            return RespMsg.result(RespStatus.SUCCESS_GET_ORDER.getStatus(), RespStatus.SUCCESS_GET_ORDER.getMessage()).add("data", orderList);
        } else {
            return RespMsg.result(RespStatus.FAIL_GET_ORDER.getStatus(), RespStatus.FAIL_GET_ORDER.getMessage());
        }
    }

    /**
     * 查看用户订单详情（单条）
     * @param token 令牌
     * @param uId 发布者id
     * @param oId 接单者id
     * @return 包含接单者信息的订单的详细信息
     */
    @RequestMapping(value = "/order/{uId}/{oId}", method = RequestMethod.GET)
    @ResponseBody
    public RespMsg getOrderByStatus(@RequestParam(value = "token", defaultValue = "") String token,
                                    @PathVariable(value = "uId") Integer uId,
                                    @PathVariable(value = "oId") Integer oId) {
        // 验证token
        if ("".equals(token)) {
            return RespMsg.result(RespStatus.MISS_TOKEN.getStatus(), RespStatus.MISS_TOKEN.getMessage());
        }
        if (Tokens.isMatched(token, uId)) {// 验证用户身份 id与token匹配
            // 查询数据
            Order order = orderService.getOrderByOId(oId);
            if (order != null) {
                return RespMsg.result(RespStatus.SUCCESS_GET_ORDER.getStatus(), RespStatus.SUCCESS_GET_ORDER.getMessage()).add("data", order);
            } else {
                return RespMsg.result(RespStatus.ORDER_NOT_EXIST.getStatus(), RespStatus.ORDER_NOT_EXIST.getMessage());
            }
        }
        // 查询失败(验证不通过不查询)
        return RespMsg.result(RespStatus.ILLEGAL_PARAMS.getStatus(), RespStatus.ILLEGAL_PARAMS.getMessage());
    }

    /**
     * 接受用户订单
     * @param oId 订单id
     * @param uId 用户id
     * @param token 令牌
     * @return 处理结果
     */
    @RequestMapping(value = "/order/accept", method = RequestMethod.POST)
    @ResponseBody
    public RespMsg acceptOrder(@RequestParam(value = "oId", defaultValue = "")Integer oId,
                               @RequestParam(value = "uId", defaultValue = "")Integer uId,
                               @RequestParam(value = "token", defaultValue = "")String token){

        // 参数检验
        if (oId == null || uId == null || token == null || !Tokens.isMatched(token, uId)){
            return RespMsg.result(RespStatus.ILLEGAL_PARAMS.getStatus(), RespStatus.ILLEGAL_PARAMS.getMessage());
        }

        // 修改订单状态
        if (orderService.acceptOrder(oId, uId)) {
            return RespMsg.result(RespStatus.SUCCESS_ACCEPT_ORDER.getStatus(), RespStatus.SUCCESS_ACCEPT_ORDER.getMessage());
        }
        return RespMsg.result(RespStatus.FAIL_ACCEPT_ORDER.getStatus(), RespStatus.FAIL_ACCEPT_ORDER.getMessage());

    }

    /**
     * 派送用户订单
     * @param oId 订单id
     * @param uId 接单者id
     * @param token 令牌
     * @return 处理结果
     */
    @RequestMapping(value = "/order/dispatched", method = RequestMethod.POST)
    @ResponseBody
    public RespMsg dispatchedOrder(@RequestParam(value = "oId", defaultValue = "")Integer oId,
                                   @RequestParam(value = "uId", defaultValue = "")Integer uId,
                                   @RequestParam(value = "token", defaultValue = "")String token){
        // 参数检验
        if (oId == null || uId == null || token == null || !Tokens.isMatched(token, uId)){
            return RespMsg.result(RespStatus.ILLEGAL_PARAMS.getStatus(), RespStatus.ILLEGAL_PARAMS.getMessage());
        }
        // 派送订单
        if(orderService.dispatchedOrder(oId, uId)){
            return RespMsg.result(RespStatus.SUCCESS_DISPATCHED_ORDER.getStatus(), RespStatus.SUCCESS_DISPATCHED_ORDER.getMessage());
        }
        return RespMsg.result(RespStatus.FAIL_DISPATCHED_ORDER.getStatus(), RespStatus.FAIL_DISPATCHED_ORDER.getMessage());
    }
    /**
     * 支付订单
     * @param oId 订单id
     * @param uId 支付者id
     * @param token 令牌
     * @return 处理结果
     */
    @RequestMapping(value = "/order/pay", method = RequestMethod.POST)
    @ResponseBody
    public RespMsg payOrder(@RequestParam(value = "oId", defaultValue = "")Integer oId,
                            @RequestParam(value = "uId", defaultValue = "")Integer uId,
                            @RequestParam(value = "token", defaultValue = "")String token){
        // 检验
        if (!Tokens.isMatched(token, uId)){
            return RespMsg.result(RespStatus.ILLEGAL_PARAMS.getStatus(), RespStatus.ILLEGAL_PARAMS.getMessage());
        }
        // 支付
        if (orderService.payOrder(oId, uId)){
            return RespMsg.result(RespStatus.SUCCESS_PAY_ORDER.getStatus(), RespStatus.SUCCESS_PAY_ORDER.getMessage());
        }
        return RespMsg.result(RespStatus.FAIL_PAY_ORDER.getStatus(), RespStatus.FAIL_PAY_ORDER.getMessage());
    }

    /**
     * 模糊查询订单 联系人 地址 描述
     * @param pn 页码
     * @param pSize 页长度
     * @param keyword 关键字
     * @return 处理结果
     */
    @RequestMapping(value = "/order/search", method = RequestMethod.GET)
    @ResponseBody
    public RespMsg searchOrder(@RequestParam(value = "pn", defaultValue = "1")Integer pn,
                            @RequestParam(value = "pSize", defaultValue = "10")Integer pSize,
                            @RequestParam(value = "keyword", defaultValue = "")String keyword){
        if ("".equals(keyword)){
            return RespMsg.result(RespStatus.NO_KEYWORD.getStatus(), RespStatus.NO_KEYWORD.getMessage());
        }
        List<Order> orderList = orderService.searchOrder(keyword, pn, pSize);
        if (orderList.size() > 0){
            return RespMsg.result(RespStatus.SUCCESS_GET_ORDER.getStatus(), RespStatus.SUCCESS_GET_ORDER.getMessage()).add("data", orderList);
        }
        return RespMsg.result(RespStatus.NO_ORDER_FOUND.getStatus(), RespStatus.NO_ORDER_FOUND.getMessage()).add("data", orderList);
    }
}
