package com.wind.controller;

import com.wind.entity.Manager;
import com.wind.service.ManagerService;
import com.wind.utils.RespMsg;
import com.wind.utils.RespStatus;
import com.wind.utils.Tokens;
import com.wind.utils.ParamsErrors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;


@Controller
public class ManagerController {
    @Autowired
    ManagerService managerService;

    // 管理员注册
    @RequestMapping(value = "/wAdmin", method = RequestMethod.POST)
    @ResponseBody
    public RespMsg addManager(@Valid Manager manager, BindingResult result) {
        // 参数错误
        if (manager.getmAccount() == null || manager.getmPwd() == null) {
            return RespMsg.result(RespStatus.MISS_MANAGER_INFO.getStatus(), RespStatus.MISS_MANAGER_INFO.getMessage()).add("params", manager);
        }

        // 参数错误
        if (result.hasErrors()) {
            return ParamsErrors.getErrorsMsg(result);
        }

        // 错误 存在管理员
        if (managerService.isExist(manager.getmAccount())) {
            return RespMsg.result(RespStatus.MANAGER_ALREADY_EXISTS.getStatus(), RespStatus.MANAGER_ALREADY_EXISTS.getMessage()).add("data", manager);
        }

        // 注册
        if (!managerService.addManager(manager)) {
            return RespMsg.result(RespStatus.NEW_MANAGER_EXCEPTION.getStatus(), RespStatus.NEW_MANAGER_EXCEPTION.getMessage());
        }
        return RespMsg.result(RespStatus.NEW_MANAGER_SUCCESS.getStatus(), RespStatus.NEW_MANAGER_SUCCESS.getMessage()).add("account", manager.getmAccount());
    }


    // 管理员登录后台接口
    @RequestMapping(value = "/enter", method = RequestMethod.POST)
    @ResponseBody
    public RespMsg login(Manager manager){
        // 参数错误
        if (manager.getmPwd() == null || manager.getmAccount() == null) {
            return RespMsg.result(RespStatus.MISS_MANAGER_INFO.getStatus(), RespStatus.MISS_MANAGER_INFO.getMessage()).add("params", manager);
        }

        // 参数错误
        String regExp = "[0-9A-Za-z]{6,18}";
        if (!manager.getmAccount().matches(regExp)) {
            return RespMsg.result(RespStatus.ILLEGAL_PARAMS.getStatus(), RespStatus.ILLEGAL_PARAMS.getMessage()).add("params", manager);
        }

        // 存在检验
        if (!managerService.isExist(manager.getmAccount())) {
            // 失败 管理员不存在
            return RespMsg.result(RespStatus.MANAGER_NOT_EXISTS.getStatus(), RespStatus.MANAGER_NOT_EXISTS.getMessage());
        }

        // 登录校验
        Manager mLogin = managerService.login(manager);

        // 登录失败
        if (mLogin == null) {
            return RespMsg.result(RespStatus.PASSWORD_ERROR.getStatus(), RespStatus.PASSWORD_ERROR.getMessage());
        }

        // 登录成功
        String token = Tokens.createToken(mLogin);
        return RespMsg
                .result(RespStatus.MANAGER_LOGIN_SUCCESS.getStatus(), RespStatus.MANAGER_LOGIN_SUCCESS.getMessage())
                .add("token", token)
                .add("account", mLogin.getmAccount());
    }

}
