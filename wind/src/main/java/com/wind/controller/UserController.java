package com.wind.controller;

import com.wind.entity.User;
import com.wind.service.UserService;
import com.wind.utils.RespMsg;
import com.wind.utils.RespStatus;
import com.wind.utils.Tokens;
import com.wind.utils.ParamsErrors;
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
            return ParamsErrors.getErrorsMsg(result);
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
    public RespMsg login(@RequestParam(value = "uName", defaultValue = "")String uName,
                         @RequestParam(value = "uPwd", defaultValue = "")String uPwd) {
        // 参数错误
        if (uName == null || uPwd == null) {
            return RespMsg.result(RespStatus.MISS_USER_INFO.getStatus(), RespStatus.MISS_USER_INFO.getMessage());
        }
        String regx = "[0-9A-Za-z]{6,18}";
        if (!uName.matches(regx)) {
            return RespMsg.result(RespStatus.ILLEGAL_PARAMS.getStatus(), RespStatus.ILLEGAL_PARAMS.getMessage());
        }

        // 存在检验
        if (!userService.isExist(uName)) {
            // 失败 用户不存在
            return RespMsg.result(RespStatus.USER_NOT_EXISTS.getStatus(), RespStatus.USER_NOT_EXISTS.getMessage()).add("error", "用户不存在");
        }

        // 登录校验
        User uLogin = userService.login(uName, uPwd);

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
                .add("id", uLogin.getuId())
                .add("img", uLogin.getuImg());
    }

    // 修改昵称
    @RequestMapping(value = "/user/nickname", method = RequestMethod.POST)
    @ResponseBody
    public RespMsg editNickname(@RequestParam(value = "uId", defaultValue = "")Integer uId,
                                @RequestParam(value = "newNickname", defaultValue = "")String newNickname,
                                @RequestParam(value = "token", defaultValue = "")String token){
        if (newNickname != null && newNickname.length() >= 2 && newNickname.length() <= 12 && uId != null && token != null){
            if (Tokens.isMatched(token, uId)){
                boolean b = userService.editNickname(newNickname, uId);
                if (b){
                    return RespMsg.result(RespStatus.SUCCESS_EDIT_NICKNAME.getStatus(), RespStatus.SUCCESS_EDIT_NICKNAME.getMessage());
                }
                return RespMsg.result(RespStatus.FAIL_EDIT_NICKNAME.getStatus(), RespStatus.FAIL_EDIT_NICKNAME.getMessage());
            }
        }
        return RespMsg.result(RespStatus.ILLEGAL_PARAMS.getStatus(), RespStatus.ILLEGAL_PARAMS.getMessage());
    }

    // 绑定/解绑邮箱
    @RequestMapping(value = "/user/mail", method = RequestMethod.POST)
    @ResponseBody
        public RespMsg nail(@RequestParam(value = "uId", defaultValue = "")Integer uId,
                                @RequestParam(value = "mail", defaultValue = "")String mail,
                                @RequestParam(value = "bind", defaultValue = "")Integer bind,
                                @RequestParam(value = "token", defaultValue = "")String token){
        // 验证参数
        if (bind == null || uId == null || token == null || !Tokens.isMatched(token, uId)){
            return RespMsg.result(RespStatus.ILLEGAL_PARAMS.getStatus(), RespStatus.ILLEGAL_PARAMS.getMessage());
        }

        if (bind == 1){// 绑定邮箱
            if (mail == null)
                return RespMsg.result(RespStatus.ILLEGAL_PARAMS.getStatus(), RespStatus.ILLEGAL_PARAMS.getMessage());
            if (userService.bindMail(uId, mail))
                return RespMsg.result(RespStatus.SUCCESS_BIND_MAIL.getStatus(), RespStatus.SUCCESS_BIND_MAIL.getMessage());
            return RespMsg.result(RespStatus.FAIL_BIND_MAIL.getStatus(), RespStatus.FAIL_BIND_MAIL.getMessage());
        }
        if (bind == 0){// 解绑邮箱
            if (userService.unbindMail(uId))
                return RespMsg.result(RespStatus.SUCCESS_UNBIND_MAIL.getStatus(), RespStatus.SUCCESS_UNBIND_MAIL.getMessage());
            return RespMsg.result(RespStatus.FAIL_UNBIND_MAIL.getStatus(), RespStatus.FAIL_UNBIND_MAIL.getMessage());
        }
        return RespMsg.result(RespStatus.ILLEGAL_PARAMS.getStatus(), RespStatus.ILLEGAL_PARAMS.getMessage());
    }

    // 修改密码
    @RequestMapping(value = "/user/pwd", method = RequestMethod.POST)
    @ResponseBody
    public RespMsg resetPwd(@RequestParam(value = "uId", defaultValue = "")Integer uId,
                            @RequestParam(value = "uName", defaultValue = "")String uName,
                            @RequestParam(value = "uPwd", defaultValue = "")String uPwd,
                            @RequestParam(value = "newPwd", defaultValue = "")String newPwd,
                            @RequestParam(value = "token", defaultValue = "")String token){
        // 验证参数
        String regx = "[A-Za-z0-9]{6,18}";
        if (!uName.matches(regx) || !uPwd.matches(regx) || !Tokens.isMatched(token, uId)){
            return RespMsg.result(RespStatus.ILLEGAL_PARAMS.getStatus(), RespStatus.ILLEGAL_PARAMS.getMessage());
        }

        if (userService.resetPwd(uName, uPwd, newPwd)){
            return RespMsg.result(RespStatus.SUCCESS_RESET_PASSWORD.getStatus(), RespStatus.SUCCESS_RESET_PASSWORD.getMessage());
        }
        return RespMsg.result(RespStatus.FAIL_RESET_PASSWORD.getStatus(), RespStatus.FAIL_RESET_PASSWORD.getMessage());
    }
}
