package com.wind.entity;

public class User {
    private Integer uId;

    private String uName;

    private String uPwd;

    private String uNickname;

    private String uImg;

    private String uPhone;

    private String uEmail;

    private String uState;

    private String uOpenid;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd == null ? null : uPwd.trim();
    }

    public String getuNickname() {
        return uNickname;
    }

    public void setuNickname(String uNickname) {
        this.uNickname = uNickname == null ? null : uNickname.trim();
    }

    public String getuImg() {
        return uImg;
    }

    public void setuImg(String uImg) {
        this.uImg = uImg == null ? null : uImg.trim();
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone == null ? null : uPhone.trim();
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail == null ? null : uEmail.trim();
    }

    public String getuState() {
        return uState;
    }

    public void setuState(String uState) {
        this.uState = uState == null ? null : uState.trim();
    }

    public String getuOpenid() {
        return uOpenid;
    }

    public void setuOpenid(String uOpenid) {
        this.uOpenid = uOpenid == null ? null : uOpenid.trim();
    }
}