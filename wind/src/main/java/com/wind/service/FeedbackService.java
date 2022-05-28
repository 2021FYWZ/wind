package com.wind.service;

import com.wind.dao.FeedbackMapper;
import com.wind.entity.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService {

    @Autowired
    FeedbackMapper feedbackMapper;
    public boolean addFeedback(Feedback feedback){
        try{
            feedbackMapper.insert(feedback);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
