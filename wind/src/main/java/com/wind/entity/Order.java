package com.wind.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private Integer oId;

    private Integer uId;

    private String oContatcts;

    private String oPhone;

    private String oAddress;

    private BigDecimal oPrice;

    private String oPacksge;

    private Date oDate;

    private Integer oState;

    private String oRemark;

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

    public String getoPacksge() {
        return oPacksge;
    }

    public void setoPacksge(String oPacksge) {
        this.oPacksge = oPacksge;
    }

    public Date getoDate() {
        return oDate;
    }

    public void setoDate(Date oDate) {
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