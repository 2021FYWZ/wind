package com.wind.controller;

import com.github.pagehelper.PageInfo;
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
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@Controller
public class FeedBackController {
    @Autowired
    FeedbackService feedbackService;

    @RequestMapping(value = "/feedback", method = RequestMethod.POST)
    @ResponseBody
    public RespMsg feedback(@Valid Feedback feedback,
                            BindingResult result,
                            @RequestParam(value = "token", defaultValue = "") String token) {

        // 检查参数
        if (result.hasErrors()) {
            return ParamsErrors.getErrorsMsg(result);
        }
        // 检查用户
        if (Tokens.isMatched(token, feedback.getuId())) {
            return RespMsg.result(RespStatus.ILLEGAL_PARAMS.getStatus(), RespStatus.ILLEGAL_PARAMS.getMessage());
        }
        // 添加反馈
        try {
            boolean b = feedbackService.addFeedback(feedback);
            if (!b) {
                // 添加失败
                return RespMsg.result(RespStatus.FAIL_ADD_FEEDBACK.getStatus(), RespStatus.FAIL_ADD_FEEDBACK.getMessage());
            }
            return RespMsg.result(RespStatus.SUCCESS_ADD_FEEDBACK.getStatus(), RespStatus.SUCCESS_ADD_FEEDBACK.getMessage()).add("data", feedback);
        } catch (Exception e) {
            e.printStackTrace();
            // 添加失败
            return RespMsg.result(RespStatus.FAIL_ADD_FEEDBACK.getStatus(), RespStatus.FAIL_ADD_FEEDBACK.getMessage());
        }
    }

    @RequestMapping(value = "/feedback", method = RequestMethod.GET)
    @ResponseBody
    public RespMsg getFeedback(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
                               @RequestParam(value = "pSize", defaultValue = "10") Integer pSize) {
        PageInfo<Feedback> feedback = feedbackService.getFeedback(pn, pSize);

        if (feedback == null) {
            return RespMsg.result(RespStatus.FAIL_GET_FEEDBACK.getStatus(), RespStatus.FAIL_GET_FEEDBACK.getMessage()).add("data", null);
        }
        return RespMsg.result(RespStatus.SUCCESS_GET_FEEDBACK.getStatus(), RespStatus.SUCCESS_GET_FEEDBACK.getMessage()).add("data", feedback);
    }

    @RequestMapping(value = "/feedback", method = RequestMethod.DELETE)
    @ResponseBody
    public RespMsg deleteFeedback(@RequestParam(value = "fId", defaultValue = "") Integer fId,
                                  @RequestParam(value = "mId", defaultValue = "") Integer mId,
                                  @RequestParam(value = "token", defaultValue = "10") String token) {

        // 校验
        if (fId == null || "".equals(token) || !Tokens.isMatched(token, mId)) {
            return RespMsg.result(RespStatus.ILLEGAL_PARAMS.getStatus(), RespStatus.ILLEGAL_PARAMS.getMessage());
        }
        if (!feedbackService.deleteFeedback(fId)) {
            return RespMsg.result(RespStatus.FAIL_DELETE_FEEDBACK.getStatus(), RespStatus.FAIL_DELETE_FEEDBACK.getMessage()).add("data", null);
        }
        return RespMsg.result(RespStatus.SUCCESS_DELETE_FEEDBACK.getStatus(), RespStatus.SUCCESS_DELETE_FEEDBACK.getMessage()).add("data", fId);
    }
}
