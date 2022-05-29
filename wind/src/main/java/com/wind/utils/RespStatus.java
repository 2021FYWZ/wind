package com.wind.utils;

public enum RespStatus {

    // 成功
    NEW_USER_SUCCESS(100,"用户注册成功"),
    USER_LOGIN_SUCCESS(101,"用户登录成功"),
    NEW_MANAGER_SUCCESS(102,"管理员注册成功"),
    MANAGER_LOGIN_SUCCESS(103,"管理员登录成功"),
    SUCCESS_ADD_FEEDBACK(104, "添加反馈成功"),
    SUCCESS_ADD_ORDER(105, "发布订单成功"),
    SUCCESS_GET_ORDER(106, "查询订单成功"),
    SUCCESS_ACCEPT_ORDER(107, "接单成功"),
    SUCCESS_DISPATCHED_ORDER(108, "派送成功"),
    SUCCESS_PAY_ORDER(109, "支付成功"),
    NO_ORDER_FOUND(110, "没有搜索到相关订单"),
    SUCCESS_EDIT_NICKNAME(111, "修改昵称成功"),
    SUCCESS_BIND_MAIL(112, "绑定邮箱成功"),
    SUCCESS_UNBIND_MAIL(113, "取消绑定邮箱成功"),
    SUCCESS_RESET_PASSWORD(114, "修改密码成功"),
    SUCCESS_ADD_HELP(115, "添加反馈成功"),
    SUCCESS_GET_HELP(116, "查询反馈成功"),
    SUCCESS_EDIT_HELP(117, "修改反馈成功"),
    SUCCESS_DELETE_HELP(118, "删除反馈成功"),
    SUCCESS_GET_FEEDBACK(119, "查询反馈成功"),
    SUCCESS_DELETE_FEEDBACK(120, "删除反馈成功"),
    // 失败
    USER_ALREADY_EXISTS(200, "用户已存在"),
    MANAGER_ALREADY_EXISTS(201, "管理员已存在"),
    USER_NOT_EXISTS(202, "用户不存在"),
    MANAGER_NOT_EXISTS(203, "管理员不存在"),
    FAIL_ADD_FEEDBACK(204, "添加反馈失败"),
    FAIL_ADD_ORDER(205, "发布订单失败"),
    FAIL_GET_ORDER(206, "查询订单失败"),
    ORDER_NOT_EXIST(207, "订单不存在"),
    FAIL_ACCEPT_ORDER(208, "接单失败"),
    FAIL_DISPATCHED_ORDER(108, "派送失败"),
    FAIL_PAY_ORDER(108, "支付失败"),
    FAIL_EDIT_NICKNAME(109, "修改昵称失败"),
    FAIL_BIND_MAIL(110, "绑定邮箱失败"),
    FAIL_UNBIND_MAIL(111, "解除绑定邮箱失败"),
    FAIL_RESET_PASSWORD(112, "重置密码失败"),
    FAIL_ADD_HELP(113, "添加反馈失败"),
    FAIL_GET_HELP(114, "查询反馈失败"),
    FAIL_EDIT_HELP(115, "修改反馈失败"),
    FAIL_DELETE_HELP(116, "删除反馈失败"),
    FAIL_GET_FEEDBACK(117, "查询反馈失败"),
    FAIL_DELETE_FEEDBACK(118, "删除反馈失败"),
    // 错误
    MISS_USER_INFO(300, "缺少用户信息"),
    MISS_MANAGER_INFO(301, "缺少管理员信息"),
    ILLEGAL_PARAMS(302, "参数不合法"),
    PASSWORD_ERROR(303, "密码错误"),
    MISS_TOKEN(304, "无法识别用户"),
    EXPIRATION_TOKEN(305, "用户身份过期"),
    NO_KEYWORD(306, "没有任何关键字"),

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
