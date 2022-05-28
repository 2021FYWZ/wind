package com.wind.controller;

import com.wind.entity.Feedback;
import com.wind.service.FeedbackService;
import com.wind.service.UserService;
import com.wind.utils.ParamsErrors;
import com.wind.utils.RespMsg;
import com.wind.utils.RespStatus;
import com.wind.utils.Tokens;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
public class FeedBackController {
    @Autowired
    FeedbackService feedbackService;
    @Autowired
    UserService userService;

    @RequestMapping(value = "/feedback", method = RequestMethod.POST)
    @ResponseBody
    public RespMsg feedback(@Valid Feedback feedback,
                            BindingResult result,
                            @RequestParam(value = "token", defaultValue = "")String token) {

        // 检查参数
        if (result.hasErrors()) {
            return ParamsErrors.getErrorsMsg(result);
        }
        // 检查用户
        if (Tokens.isMatched(token, feedback.getuId())) {
            return RespMsg.result(RespStatus.ILLEGAL_PARAMS.getStatus(), RespStatus.ILLEGAL_PARAMS.getMessage());
        }
        // 添加反馈
        try{
            boolean b = feedbackService.addFeedback(feedback);
            if (!b) {
                // 添加失败
                return RespMsg.result(RespStatus.FAIL_ADD_FEEDBACK.getStatus(), RespStatus.FAIL_ADD_FEEDBACK.getMessage());
            }
            return RespMsg.result(RespStatus.SUCCESS_ADD_FEEDBACK.getStatus(), RespStatus.SUCCESS_ADD_FEEDBACK.getMessage()).add("data", feedback);
        }catch (Exception e){
            e.printStackTrace();
            // 添加失败
            return RespMsg.result(RespStatus.FAIL_ADD_FEEDBACK.getStatus(), RespStatus.FAIL_ADD_FEEDBACK.getMessage());
        }
    }
}
