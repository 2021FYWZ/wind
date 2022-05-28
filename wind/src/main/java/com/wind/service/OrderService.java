package com.wind.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wind.dao.OrderMapper;
import com.wind.entity.Order;
import com.wind.entity.OrderExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrderService {
    @Autowired
    OrderMapper orderMapper;

    // 添加订单
    public boolean addOrder(Order order) {
        try {
            orderMapper.insert(order);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // 查询首页未接单的订单数据
    public List<Order> getOrderByStatus(int pn, int pSize) {
        PageHelper.startPage(pn, pSize);
        OrderExample orderExample = new OrderExample();
        OrderExample.Criteria criteria = orderExample.createCriteria();
        List<Order> orderList = orderMapper.selectByExample(orderExample);
        criteria.andOStateEqualTo(0);
        PageInfo<Order> pageInfo = new PageInfo<>(orderList, pSize);
        return pageInfo.getList();
    }

    // 查询用户对应状态的订单信息(分页)
    public List<Order> getOrderByStatusAndUId(int status, int pn, int pSize, int uId) {
        PageHelper.startPage(pn, pSize);
        OrderExample orderExample = new OrderExample();
        OrderExample.Criteria criteria = orderExample.createCriteria();
        criteria.andOStateEqualTo(status).andUIdEqualTo(uId);
        List<Order> orderList = orderMapper.selectByExample(orderExample);
        PageInfo<Order> pageInfo = new PageInfo<>(orderList, pSize);
        return pageInfo.getList();
    }

    // 查询用户订单详情
    public Order getOrderByOId(int oId) {
        return orderMapper.selectByPrimaryKeyWithUser(oId);
    }
    // 接受订单

    /**
     * 接受订单
     *
     * @param oId 订单
     * @param uId 接单者
     */
    public boolean acceptOrder(int oId, int uId) {
        Order oldOrder = orderMapper.selectByPrimaryKey(oId);
        if (oldOrder.getaId() != null || oldOrder.getoState() != 0 || oldOrder.getoId() == uId) {// 已被接单、不能接受自己的订单
            return false;
        }
        OrderExample orderExample = new OrderExample();
        OrderExample.Criteria criteria = orderExample.createCriteria();
        criteria.andOIdEqualTo(oId);
        Order order = new Order();
        order.setaId(uId);
        order.setoState(1);
        try {
            orderMapper.updateByExampleSelective(order, orderExample);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    // 派送订单
    public boolean dispatchedOrder(int oId, int uId) {
        Order oldOrder = orderMapper.selectByPrimaryKey(oId);
        if (oldOrder.getaId() == null
                || oldOrder.getaId() != uId
                || oldOrder.getoState() == null
                || oldOrder.getoState() != 1
                || oldOrder.getuId() == null
                || oldOrder.getuId() == uId) {// 不能处理的状态
            return false;
        }
        OrderExample orderExample = new OrderExample();
        OrderExample.Criteria criteria = orderExample.createCriteria();
        criteria.andOIdEqualTo(oId);
        Order order = new Order();
        order.setoState(2);
        try {
            orderMapper.updateByExampleSelective(order, orderExample);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // 支付订单
    public boolean payOrder(int oId, int uId) {
        Order oldOrder = orderMapper.selectByPrimaryKey(oId);
        if (oldOrder.getuId() == null
                || oldOrder.getuId() == uId
                || oldOrder.getaId() == null
                || oldOrder.getaId() != uId
                || oldOrder.getoState() != 2){
            return false;
        }
        Order order = new Order();
        order.setoState(3);
        OrderExample orderExample = new OrderExample();
        OrderExample.Criteria criteria = orderExample.createCriteria();
        criteria.andOIdEqualTo(oId);
        try{
            orderMapper.updateByExampleSelective(order, orderExample);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    // 搜索订单
    public List<Order> searchOrder(String keyword, int pn, int pSize){
        PageHelper.startPage(pn, pSize);
        List<Order> orderList = orderMapper.selectByKeyword(keyword);
        PageInfo<Order> pageInfo = new PageInfo<>(orderList, pSize);
        return pageInfo.getList();
    }
}
