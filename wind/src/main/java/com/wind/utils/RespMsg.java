package com.wind.utils;

import java.util.HashMap;
import java.util.Map;


/**
 * 响应工具类
 * 响应处理结果、信息、结果数据Map
 */
public class RespMsg {
    // 响应状态
    private int status;

    // 响应信息
    private String Msg;

    // 响应数据
    private Map<String, Object> data = new HashMap<>();

    public static RespMsg result(int status, String message){
        RespMsg respMsg = new RespMsg();
        respMsg.setStatus(status);
        respMsg.setMsg(message);
        return respMsg;
    }

    public RespMsg add(String key, Object value){
        this.getData().put(key, value);
        return this;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String msg) {
        Msg = msg;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
