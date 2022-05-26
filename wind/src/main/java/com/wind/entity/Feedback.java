package com.wind.entity;

import java.util.Date;

public class Feedback {
    private Integer fId;

    private Integer uId;

    private Date fDate;

    private String fIp;

    private String fContent;

    private String fInfo;

    private String fVersion;

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Date getfDate() {
        return fDate;
    }

    public void setfDate(Date fDate) {
        this.fDate = fDate;
    }

    public String getfIp() {
        return fIp;
    }

    public void setfIp(String fIp) {
        this.fIp = fIp;
    }

    public String getfContent() {
        return fContent;
    }

    public void setfContent(String fContent) {
        this.fContent = fContent;
    }

    public String getfInfo() {
        return fInfo;
    }

    public void setfInfo(String fInfo) {
        this.fInfo = fInfo;
    }

    public String getfVersion() {
        return fVersion;
    }

    public void setfVersion(String fVersion) {
        this.fVersion = fVersion;
    }
}