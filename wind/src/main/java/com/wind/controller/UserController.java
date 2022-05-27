package com.wind.controller;

import com.wind.entity.User;
import com.wind.service.UserService;
import com.wind.utils.RespMsg;
import com.wind.utils.RespStatus;
import com.wind.utils.Tokens;
import com.wind.utils.UAndMParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    // 用户注册
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    @ResponseBody
    public RespMsg addUser(@Valid User user, BindingResult result) {
        // 参数错误
        if (user.getuName() == null || user.getuPwd() == null) {
            return RespMsg.result(RespStatus.MISS_USER_INFO.getStatus(), RespStatus.MISS_USER_INFO.getMessage()).add("params", user);
        }

        // 参数错误
        if (result.hasErrors()) {
            return UAndMParams.getErrorsMsg(result);
        }

        // 错误 存在用户
        if (userService.isExist(user.getuName())) {
            return RespMsg.result(RespStatus.USER_ALREADY_EXISTS.getStatus(), RespStatus.USER_ALREADY_EXISTS.getMessage());
        }

        // 注册
        if (!userService.addUser(user)) {
            return RespMsg.result(RespStatus.NEW_USER_EXCEPTION.getStatus(), RespStatus.NEW_USER_EXCEPTION.getMessage());
        }
        return RespMsg.result(RespStatus.NEW_USER_SUCCESS.getStatus(), RespStatus.NEW_USER_SUCCESS.getMessage()).add("name", user.getuName());
    }

    // 用户登录
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public RespMsg login(User user) {
        // 参数错误
        if (user.getuName() == null || user.getuPwd() == null) {
            return RespMsg.result(RespStatus.MISS_USER_INFO.getStatus(), RespStatus.MISS_USER_INFO.getMessage()).add("params", user);
        }
        String regExp = "[0-9A-Za-z]{6,18}";
        if (!user.getuName().matches(regExp)) {
            return RespMsg.result(RespStatus.ILLEGAL_PARAMS.getStatus(), RespStatus.ILLEGAL_PARAMS.getMessage()).add("params", user);
        }

        // 存在检验
        if (!userService.isExist(user.getuName())) {
            // 失败 用户不存在
            return RespMsg.result(RespStatus.USER_NOT_EXISTS.getStatus(), RespStatus.USER_NOT_EXISTS.getMessage()).add("error", "用户不存在");
        }

        // 登录校验
        User uLogin = userService.login(user);

        // 登陆失败
        if (uLogin == null) {
            return RespMsg.result(RespStatus.PASSWORD_ERROR.getStatus(), RespStatus.PASSWORD_ERROR.getMessage());
        }

        // 登录成功
        String token = Tokens.createToken(uLogin);
        return RespMsg
                .result(RespStatus.USER_LOGIN_SUCCESS.getStatus(), RespStatus.USER_LOGIN_SUCCESS.getMessage())
                .add("token", token)
                .add("nickname", uLogin.getuNickname())
                .add("img", uLogin.getuImg());
    }
}
