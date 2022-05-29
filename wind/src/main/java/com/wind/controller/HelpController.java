package com.wind.controller;

import com.github.pagehelper.PageInfo;
import com.wind.entity.Help;
import com.wind.service.HelpService;
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

import javax.validation.Valid;

@Controller
public class HelpController {
    @Autowired
    HelpService helpService;

    // 新增帮助
    @RequestMapping(value = "/help", method = RequestMethod.POST)
    @ResponseBody
    public RespMsg addHelp(@RequestParam(value = "mId", defaultValue = "") Integer mId,
                           @RequestParam(value = "mToken", defaultValue = "") String mToken,
                           @Valid Help help,
                           BindingResult result) {
        // 校验身份 参数
        if (result.hasErrors()) {
            return ParamsErrors.getErrorsMsg(result);
        }
        if ("".equals(mToken) || mId == null || !Tokens.isMatched(mToken, mId)) {
            return RespMsg.result(RespStatus.ILLEGAL_PARAMS.getStatus(), RespStatus.ILLEGAL_PARAMS.getMessage());
        }

        // 添加帮助
        if (helpService.addHelp(help)) {
            return RespMsg.result(RespStatus.SUCCESS_ADD_HELP.getStatus(), RespStatus.SUCCESS_ADD_HELP.getMessage());
        }
        return RespMsg.result(RespStatus.FAIL_ADD_HELP.getStatus(), RespStatus.FAIL_ADD_HELP.getMessage());
    }

    // 查询帮助
    @RequestMapping(value = "/help", method = RequestMethod.GET)
    @ResponseBody
    public RespMsg getHelp(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
                           @RequestParam(value = "pSize", defaultValue = "10") Integer pSize) {
        // 添加帮助
        PageInfo<Help> help = helpService.getHelp(pn, pSize);
        if (help == null || help.getSize() <= 0) {
            return RespMsg.result(RespStatus.FAIL_ADD_HELP.getStatus(), RespStatus.FAIL_ADD_HELP.getMessage());
        }
        return RespMsg.result(RespStatus.SUCCESS_ADD_HELP.getStatus(), RespStatus.SUCCESS_ADD_HELP.getMessage()).add("data", help);
    }

    // 修改帮助
    @RequestMapping(value = "/help", method = RequestMethod.PUT)
    @ResponseBody
    public RespMsg editHelp(@RequestParam(value = "mId", defaultValue = "") Integer mId,
                            @RequestParam(value = "mToken", defaultValue = "") String mToken,
                            @Valid Help help,
                            BindingResult result) {
        // 检验参数
        if (result.hasErrors()) {
            return ParamsErrors.getErrorsMsg(result);
        }
        if ("".equals(mToken) || mId == null || !Tokens.isMatched(mToken, mId)) {
            return RespMsg.result(RespStatus.ILLEGAL_PARAMS.getStatus(), RespStatus.ILLEGAL_PARAMS.getMessage());
        }

        // 添加帮助
        if (helpService.editHelp(help)) {
            return RespMsg.result(RespStatus.SUCCESS_EDIT_HELP.getStatus(), RespStatus.SUCCESS_EDIT_HELP.getMessage());
        }
        return RespMsg.result(RespStatus.FAIL_EDIT_HELP.getStatus(), RespStatus.FAIL_EDIT_HELP.getMessage()).add("data", help);
    }

    // 删除帮助
    @RequestMapping(value = "/help", method = RequestMethod.DELETE)
    @ResponseBody
    public RespMsg deleteHelp(@RequestParam(value = "mId", defaultValue = "") Integer mId,
                              @RequestParam(value = "hId", defaultValue = "") Integer hId,
                              @RequestParam(value = "mToken", defaultValue = "") String mToken) {
        // 检验参数
        if ("".equals(mToken) || hId == null || mId == null || !Tokens.isMatched(mToken, mId)) {
            return RespMsg.result(RespStatus.ILLEGAL_PARAMS.getStatus(), RespStatus.ILLEGAL_PARAMS.getMessage());
        }

        // 添加帮助
        if (helpService.deleteHelp(hId)) {
            return RespMsg.result(RespStatus.SUCCESS_DELETE_HELP.getStatus(), RespStatus.SUCCESS_DELETE_HELP.getMessage());
        }
        return RespMsg.result(RespStatus.FAIL_EDIT_HELP.getStatus(), RespStatus.FAIL_EDIT_HELP.getMessage()).add("data", hId);
    }
}
