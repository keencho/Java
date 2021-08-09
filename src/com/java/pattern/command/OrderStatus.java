package com.java.pattern.command;

public enum OrderStatus {
    RECEIPT("접수"),
    DISPATCH("배차"),
    START("배송 시작"),
    COMPLETE("완료");

    private String description;

    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
