package com.wind.entity;

public class Helper {
    private Integer hId;

    private String hContent;

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
        this.hContent = hContent == null ? null : hContent.trim();
    }

    public String gethMethod() {
        return hMethod;
    }

    public void sethMethod(String hMethod) {
        this.hMethod = hMethod == null ? null : hMethod.trim();
    }
}