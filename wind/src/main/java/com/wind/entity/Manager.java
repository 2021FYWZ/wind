package com.wind.entity;

import javax.validation.constraints.Pattern;

public class Manager {
    private Integer mId;

    @Pattern(regexp = "[0-9A-Za-z]{6,18}",
            message = "账号不合法")
    private String mAccount;

    @Pattern(regexp = "[0-9A-Za-z]{6,18}",
            message = "密码不合法")
    private String mPwd;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmAccount() {
        return mAccount;
    }

    public void setmAccount(String mAccount) {
        this.mAccount = mAccount;
    }

    public String getmPwd() {
        return mPwd;
    }

    public void setmPwd(String mPwd) {
        this.mPwd = mPwd;
    }
}