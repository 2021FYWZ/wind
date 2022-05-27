package com.wind.entity;
import org.hibernate.validator.constraints.Email;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User {
    @Null(message = "id必须为空!")
    private Integer uId;

    @Pattern(regexp = "[0-9A-Za-z]{6,18}",
            message = "用户名不合法")
    private String uName;

    @Pattern(regexp = "[0-9A-Za-z]{6,18}",
            message = "密码不合法")
    private String uPwd;

    @Size(min = 2,max = 12,
            message = "昵称长度2-12")
    private String uNickname;

    private String uImg;

    @Pattern(regexp = "[0-9]{11}",
            message = "手机号不合法")
    private String uPhone;

    @Email(message = "邮箱不合法")
    private String uEmail;

    private String uState = "1";

    private String uOpenid = "0";

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
        this.uName = uName;
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd;
    }

    public String getuNickname() {
        return uNickname;
    }

    public void setuNickname(String uNickname) {
        this.uNickname = uNickname;
    }

    public String getuImg() {
        return uImg;
    }

    public void setuImg(String uImg) {
        this.uImg = uImg;
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public String getuState() {
        return uState;
    }

    public void setuState(String uState) {
        this.uState = uState;
    }

    public String getuOpenid() {
        return uOpenid;
    }

    public void setuOpenid(String uOpenid) {
        this.uOpenid = uOpenid;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                ", uPwd='" + uPwd + '\'' +
                ", uNickname='" + uNickname + '\'' +
                ", uImg='" + uImg + '\'' +
                ", uPhone='" + uPhone + '\'' +
                ", uEmail='" + uEmail + '\'' +
                ", uState='" + uState + '\'' +
                ", uOpenid='" + uOpenid + '\'' +
                '}';
    }
}