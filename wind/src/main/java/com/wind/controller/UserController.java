package com.wind.controller;

import com.wind.entity.User;
import com.wind.service.UserService;
import com.wind.utils.RespMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    // 用户注册
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    @ResponseBody
    public RespMsg addUser(@Valid User user, BindingResult result) {
        //参数异常
        if (result.hasErrors()) {
            Map<String, Object> map = new HashMap<>();
            List<FieldError> fieldErrors = result.getFieldErrors();
            for (FieldError fieldError : fieldErrors) {
                map.put(fieldError.getField(), fieldError.getDefaultMessage());
            }
            return RespMsg.fail().add("error",map);
        }

        // 存在用户
        if (userService.isExist(user.getuName())){
            return RespMsg.fail().add("error","用户已存在");
        }

        // 注册
        if (!userService.addUser(user)){
            return RespMsg.fail().add("error","新增用户异常");
        }
        return RespMsg.success().add("result", user.getuName());
    }
}
