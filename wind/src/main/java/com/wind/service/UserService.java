package com.wind.service;

import com.wind.dao.UserMapper;
import com.wind.entity.User;
import com.wind.entity.UserExample;
import com.wind.utils.Tokens;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;
import java.util.List;
  
@Service
@Transactional
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
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUNameEqualTo(uName);
        List<User> users = userMapper.selectByExample(userExample);
        return users != null;
    }

    public boolean isExist(int uId) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUIdEqualTo(uId);
        List<User> users = userMapper.selectByExample(userExample);
        return users.size() > 0;
    }

    public User login(String uName, String uPwd) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUNameEqualTo(uName).andUPwdEqualTo(DigestUtils.md5DigestAsHex(uPwd.getBytes()));
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

    // 修改昵称
    public boolean editNickname(String newNickname, Integer uId) {
        User user = new User();
        user.setuNickname(newNickname);
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUIdEqualTo(uId);
        try {
            userMapper.updateByExampleSelective(user, userExample);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // 绑定邮箱
    public boolean bindMail(Integer uId, String mail){
        User user = userMapper.selectByPrimaryKey(uId);
        user.setuEmail(mail);
        return changeMail(uId, user);
    }

    // 取消绑定邮箱
    public boolean unbindMail(Integer uId){
        User user = userMapper.selectByPrimaryKey(uId);
        user.setuEmail(null);
        return changeMail(uId, user);
    }

    // 改变邮箱状态
    private boolean changeMail(Integer uId, User user) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUIdEqualTo(uId);
        try{
            userMapper.updateByPrimaryKey(user);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    // 修改密码
    public boolean resetPwd(String uName, String uPwd, String newPwd){
        if (login(uName, uPwd) == null){
            return false;
        }
        User user = new User();
        user.setuPwd(DigestUtils.md5DigestAsHex(newPwd.getBytes()));
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUNameEqualTo(uName);
        try{
            userMapper.updateByExampleSelective(user, userExample);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
