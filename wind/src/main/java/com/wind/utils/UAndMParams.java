package com.wind.utils;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UAndMParams {
    public static RespMsg getErrorsMsg(BindingResult result){
        Map<String, Object> map = new HashMap<>();
        List<FieldError> fieldErrors = result.getFieldErrors();
        for (FieldError fieldError : fieldErrors) {
            map.put(fieldError.getField(), fieldError.getDefaultMessage());
        }
        return RespMsg.result(RespStatus.ILLEGAL_PARAMS.getStatus(), RespStatus.ILLEGAL_PARAMS.getMessage()).add("description", map);
    }
}
