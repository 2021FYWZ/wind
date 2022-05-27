package com.wind.service;

import com.wind.dao.ManagerMapper;
import com.wind.entity.Manager;
import com.wind.entity.ManagerExample;
import com.wind.utils.Tokens;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.List;

@Service
public class ManagerService {
    @Autowired
    ManagerMapper managerMapper;

    public boolean isExist(String mAccount){
        if (mAccount != null) {
            ManagerExample managerExample = new ManagerExample();
            ManagerExample.Criteria criteria = managerExample.createCriteria();
            criteria.andMAccountEqualTo(mAccount);
            return managerMapper.selectByExample(managerExample).size() > 0;
        }
        return false;
    }

    public boolean addManager(Manager manager) {
        try {
            // md5加密
            manager.setmPwd(DigestUtils.md5DigestAsHex(manager.getmPwd().getBytes()));
            managerMapper.insert(manager);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    public Manager login(Manager manager) {
        ManagerExample managerExample = new ManagerExample();
        ManagerExample.Criteria criteria = managerExample.createCriteria();
        criteria.andMAccountEqualTo(manager.getmAccount()).andMPwdEqualTo(DigestUtils.md5DigestAsHex(manager.getmPwd().getBytes()));
        List<Manager> managers = managerMapper.selectByExample(managerExample);
        // 判断是否登录成功
        if (managers.size() > 0) {
            return managers.get(0);
        } else {
            return null;// 登录失败
        }
    }

    public boolean isLogin(String token) {
        return Tokens.isExpiration(token);
    }
}
