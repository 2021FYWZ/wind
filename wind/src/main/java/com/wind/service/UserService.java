package com.wind.service;

import com.wind.dao.UserMapper;
import com.wind.entity.User;
import com.wind.entity.UserExample;
import com.wind.utils.RespMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public boolean addUser(User user){
        try{
            // md5加密
            user.setuPwd(DigestUtils.md5DigestAsHex(user.getuPwd().getBytes()));
            userMapper.insert(user);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean isExist(String uName){
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUNameEqualTo(uName);
        return userMapper.selectByExample(userExample).size() > 0;
    }
}
