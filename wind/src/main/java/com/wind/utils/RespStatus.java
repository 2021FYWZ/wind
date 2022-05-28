package com.wind.utils;

public enum RespStatus {


    // 成功
    NEW_USER_SUCCESS(100,"用户注册成功"),
    USER_LOGIN_SUCCESS(101,"用户登录成功"),
    NEW_MANAGER_SUCCESS(102,"管理员注册成功"),
    MANAGER_LOGIN_SUCCESS(103,"管理员登录成功"),
    SUCCESS_ADD_FEEDBACK(104, "添加反馈成功"),
    // 失败
    USER_ALREADY_EXISTS(200, "用户已存在"),
    MANAGER_ALREADY_EXISTS(201, "管理员已存在"),
    USER_NOT_EXISTS(202, "用户不存在"),
    MANAGER_NOT_EXISTS(203, "管理员不存在"),
    FAIL_ADD_FEEDBACK(204, "添加反馈失败"),
    // 错误
    MISS_USER_INFO(300, "缺少用户信息"),
    MISS_MANAGER_INFO(301, "缺少管理员信息"),
    ILLEGAL_PARAMS(302, "参数不合法"),
    PASSWORD_ERROR(303, "密码错误"),
    // 异常
    NEW_USER_EXCEPTION(400, "添加用户异常"),
    NEW_MANAGER_EXCEPTION(401, "添加管理员异常");


    // 服务器错误

    // 自定义


    RespStatus() {
    }

    RespStatus(int status, String message) {
        this.status = status;
        this.message = message;
    }

    private int status;
    private String message;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "{" +
                    "status: " + status +
                    "message: " + message +
                "}";
    }
}
