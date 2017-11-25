package com.test.entity;

public class PayEntity {
    private Integer id;

    private String tripNo;

    private String requestPayNo;

    private String responsePayNo;

    private Integer payTime;

    private Double payAmount;

    private String buyerId;

    private String payAccount;

    private Boolean isPay;

    private String payChannel;

    private String type;

    private Integer addTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTripNo() {
        return tripNo;
    }

    public void setTripNo(String tripNo) {
        this.tripNo = tripNo == null ? null : tripNo.trim();
    }

    public String getRequestPayNo() {
        return requestPayNo;
    }

    public void setRequestPayNo(String requestPayNo) {
        this.requestPayNo = requestPayNo == null ? null : requestPayNo.trim();
    }

    public String getResponsePayNo() {
        return responsePayNo;
    }

    public void setResponsePayNo(String responsePayNo) {
        this.responsePayNo = responsePayNo == null ? null : responsePayNo.trim();
    }

    public Integer getPayTime() {
        return payTime;
    }

    public void setPayTime(Integer payTime) {
        this.payTime = payTime;
    }

    public Double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Double payAmount) {
        this.payAmount = payAmount;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId == null ? null : buyerId.trim();
    }

    public String getPayAccount() {
        return payAccount;
    }

    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount == null ? null : payAccount.trim();
    }

    public Boolean getIsPay() {
        return isPay;
    }

    public void setIsPay(Boolean isPay) {
        this.isPay = isPay;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel == null ? null : payChannel.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }
}