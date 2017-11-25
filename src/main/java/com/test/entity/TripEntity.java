package com.test.entity;

public class TripEntity {
    private Integer id;

    private String tripNo;

    private String inviteid;

    private Integer tripperUid;

    private String status;

    private String childStatus;

    private Double guiderAmount;

    private Double tripAmount;

    private Double insuranceAmount;

    private Double refundAmount;

    private Double conponAmount;

    private Double profitAmount;

    private Double compensationAmount;

    private Double penaltyAmount;

    private Double yyydAmount;

    private Integer refundTime;

    private Integer payTime;

    private String payChannel;

    private String balanceCount;

    private Integer tripTime;

    private Boolean isDel;

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

    public String getInviteid() {
        return inviteid;
    }

    public void setInviteid(String inviteid) {
        this.inviteid = inviteid == null ? null : inviteid.trim();
    }

    public Integer getTripperUid() {
        return tripperUid;
    }

    public void setTripperUid(Integer tripperUid) {
        this.tripperUid = tripperUid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getChildStatus() {
        return childStatus;
    }

    public void setChildStatus(String childStatus) {
        this.childStatus = childStatus == null ? null : childStatus.trim();
    }

    public Double getGuiderAmount() {
        return guiderAmount;
    }

    public void setGuiderAmount(Double guiderAmount) {
        this.guiderAmount = guiderAmount;
    }

    public Double getTripAmount() {
        return tripAmount;
    }

    public void setTripAmount(Double tripAmount) {
        this.tripAmount = tripAmount;
    }

    public Double getInsuranceAmount() {
        return insuranceAmount;
    }

    public void setInsuranceAmount(Double insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    public Double getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Double refundAmount) {
        this.refundAmount = refundAmount;
    }

    public Double getConponAmount() {
        return conponAmount;
    }

    public void setConponAmount(Double conponAmount) {
        this.conponAmount = conponAmount;
    }

    public Double getProfitAmount() {
        return profitAmount;
    }

    public void setProfitAmount(Double profitAmount) {
        this.profitAmount = profitAmount;
    }

    public Double getCompensationAmount() {
        return compensationAmount;
    }

    public void setCompensationAmount(Double compensationAmount) {
        this.compensationAmount = compensationAmount;
    }

    public Double getPenaltyAmount() {
        return penaltyAmount;
    }

    public void setPenaltyAmount(Double penaltyAmount) {
        this.penaltyAmount = penaltyAmount;
    }

    public Double getYyydAmount() {
        return yyydAmount;
    }

    public void setYyydAmount(Double yyydAmount) {
        this.yyydAmount = yyydAmount;
    }

    public Integer getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(Integer refundTime) {
        this.refundTime = refundTime;
    }

    public Integer getPayTime() {
        return payTime;
    }

    public void setPayTime(Integer payTime) {
        this.payTime = payTime;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel == null ? null : payChannel.trim();
    }

    public String getBalanceCount() {
        return balanceCount;
    }

    public void setBalanceCount(String balanceCount) {
        this.balanceCount = balanceCount == null ? null : balanceCount.trim();
    }

    public Integer getTripTime() {
        return tripTime;
    }

    public void setTripTime(Integer tripTime) {
        this.tripTime = tripTime;
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }
}