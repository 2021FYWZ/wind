package com.wind.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wind.dao.HelpMapper;
import com.wind.entity.Help;
import com.wind.entity.HelpExample;
import com.wind.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelpService {
    @Autowired
    HelpMapper helpMapper;
    // 添加反馈
    public boolean addHelp(Help help){
        try {
            helpMapper.insert(help);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // 删除反馈
    public boolean deleteHelp(Integer hId){
        try {
            helpMapper.deleteByPrimaryKey(hId);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // 删除反馈
    public boolean editHelp(Help help){
        HelpExample helpExample = new HelpExample();
        HelpExample.Criteria criteria = helpExample.createCriteria();
        try {
            criteria.andHIdEqualTo(help.gethId());
            helpMapper.updateByExampleSelective(help, helpExample);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // 查询反馈
    public PageInfo<Help> getHelp(Integer pn, Integer pSize){


        PageHelper.startPage(pn, pSize);
        HelpExample helpExample = new HelpExample();
        HelpExample.Criteria criteria = helpExample.createCriteria();
        criteria.andHIdIsNotNull();
        try {
            List<Help> helps = helpMapper.selectByExample(helpExample);
            return new PageInfo<>(helps, pSize);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }



}
