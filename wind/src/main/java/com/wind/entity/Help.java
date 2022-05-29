package com.wind.entity;

import javax.validation.constraints.Size;

public class Help {
    private Integer hId;

    @Size(min = 3, max = 225)
    private String hContent;

    @Size(min = 3, max = 225)
    private String hMethod;

    public Integer gethId() {
        return hId;
    }

    public void sethId(Integer hId) {
        this.hId = hId;
    }

    public String gethContent() {
        return hContent;
    }

    public void sethContent(String hContent) {
        this.hContent = hContent;
    }

    public String gethMethod() {
        return hMethod;
    }

    public void sethMethod(String hMethod) {
        this.hMethod = hMethod;
    }
}