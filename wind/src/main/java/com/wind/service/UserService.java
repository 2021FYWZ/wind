package com.wind.service;

import com.wind.dao.UserMapper;
import com.wind.entity.User;
import com.wind.entity.UserExample;
import com.wind.utils.Tokens;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public boolean addUser(User user) {
        try {
            // md5加密
            user.setuPwd(DigestUtils.md5DigestAsHex(user.getuPwd().getBytes()));
            userMapper.insert(user);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isExist(String uName) {
        if (uName != null) {
            UserExample userExample = new UserExample();
            UserExample.Criteria criteria = userExample.createCriteria();
            criteria.andUNameEqualTo(uName);
            return userMapper.selectByExample(userExample).size() > 0;
        }
        return false;
    }

    public User login(User user) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUNameEqualTo(user.getuName()).andUPwdEqualTo(DigestUtils.md5DigestAsHex(user.getuPwd().getBytes()));
        List<User> users = userMapper.selectByExample(userExample);
        // 判断是否登录成功
        if (users.size() > 0) {
            return users.get(0);
        } else {
            return null;// 登录失败
        }
    }

    public boolean isLogin(String token) {
        return Tokens.isExpiration(token);
    }
}
