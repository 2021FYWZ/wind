package com.wind.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Feedback {
    private Integer fId;

    @NotNull(message = "id不能为空")
    private Integer uId;

    private String fDate;

    private String fIp;

    @Size(min = 3, message = "内容长度最小为3")
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

    public String getfDate() {
        return fDate;
    }

    public void setfDate(String fDate) {
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