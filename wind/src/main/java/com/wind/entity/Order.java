package com.wind.entity;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Order {
    private Integer oId;

    @NotNull(message = "id不能为空")
    private Integer uId;

    private Integer aId;

    @NotNull(message = "联系人不能为空")
    private String oContatcts;

    @NotNull(message = "手机号不能为空")
    private String oPhone;

    @NotNull(message = "地址不能为空")
    private String oAddress;

    @NotNull(message = "价格不能为空")
    private BigDecimal oPrice;

    // 0 1 2 大中小
    @NotNull(message = "包裹大小不能为空")
    private Integer oPackage;

    private String oDate = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now());

    // -1 取消 ，0 未接单(已发布)，1 派送中，2 待支付，3 已完成
    private Integer oState = 0;

    @NotNull(message = "描述信息不能为空")
    private String oRemark;

    // 这里携带接单者信息
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getoContatcts() {
        return oContatcts;
    }

    public void setoContatcts(String oContatcts) {
        this.oContatcts = oContatcts;
    }

    public String getoPhone() {
        return oPhone;
    }

    public void setoPhone(String oPhone) {
        this.oPhone = oPhone;
    }

    public String getoAddress() {
        return oAddress;
    }

    public void setoAddress(String oAddress) {
        this.oAddress = oAddress;
    }

    public BigDecimal getoPrice() {
        return oPrice;
    }

    public void setoPrice(BigDecimal oPrice) {
        this.oPrice = oPrice;
    }

    public Integer getoPackage() {
        return oPackage;
    }

    public void setoPackage(Integer oPackage) {
        this.oPackage = oPackage;
    }

    public String getoDate() {
        return oDate;
    }

    public void setoDate(String oDate) {
        this.oDate = oDate;
    }

    public Integer getoState() {
        return oState;
    }

    public void setoState(Integer oState) {
        this.oState = oState;
    }

    public String getoRemark() {
        return oRemark;
    }

    public void setoRemark(String oRemark) {
        this.oRemark = oRemark;
    }
}