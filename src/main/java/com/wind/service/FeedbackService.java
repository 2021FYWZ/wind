package com.wind.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wind.dao.FeedbackMapper;
import com.wind.entity.Feedback;
import com.wind.entity.FeedbackExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {

    @Autowired
    FeedbackMapper feedbackMapper;

    public boolean addFeedback(Feedback feedback) {
        try {
            feedbackMapper.insert(feedback);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // 查询
    public PageInfo<Feedback> getFeedback(Integer pn, Integer pSize) {
        PageHelper.startPage(pn, pSize);
        FeedbackExample feedbackExample = new FeedbackExample();
        FeedbackExample.Criteria criteria = feedbackExample.createCriteria();
        criteria.andFIdIsNotNull();
        try {
            List<Feedback> feedbackList = feedbackMapper.selectByExample(feedbackExample);
            return new PageInfo<>(feedbackList, pSize);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 删除
    public boolean deleteFeedback(Integer fId){
        try{
            feedbackMapper.deleteByPrimaryKey(fId);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
