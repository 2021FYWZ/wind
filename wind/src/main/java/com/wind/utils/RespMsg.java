package com.wind.utils;

import java.util.HashMap;
import java.util.Map;


/**
 * 响应工具类
 * 响应处理结果、信息、结果数据Map
 */
public class RespMsg {
    // 响应代码
    private int code;

    // 响应信息
    private String Msg;

    // 响应数据
    private Map<String, Object> data = new HashMap<>();

    public static RespMsg success(){
        RespMsg respMsg = new RespMsg();
        respMsg.setCode(1);
        respMsg.setMsg("处理成功");
        return respMsg;
    }

    public static RespMsg fail(){
        RespMsg respMsg = new RespMsg();
        respMsg.setCode(0);
        respMsg.setMsg("处理失败");
        return respMsg;
    }

    public RespMsg add(String key, Object value){
        this.getData().put(key, value);
        return this;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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
