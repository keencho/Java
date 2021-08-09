package com.java.pattern.command;

public class Order {
    private String toName;
    private String toNumber;
    private String driverName;
    private OrderStatus orderStatus;

    public Order() { }

    public Order(String toName, String toNumber, OrderStatus orderStatus) {
        this.toName = toName;
        this.toNumber = toNumber;
        this.orderStatus = orderStatus;
    }

    public String getToName() {
        return toName;
    }

    public void setToName(String toName) {
        this.toName = toName;
    }

    public String getToNumber() {
        return toNumber;
    }

    public void setToNumber(String toNumber) {
        this.toNumber = toNumber;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
