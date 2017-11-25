package com.test.dto;

import java.io.Serializable;

public class RefundCodeDto {
    private Integer id;

    private String tripNo;

    private String payNo;

    private String requestRefundNo;

    private String responseRefundNo;

    private Double refundMoney;

    private String type;

    private Integer isRefund;

    private String refundChannel;

    private String reason;

    private Integer refundTime;

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

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo == null ? null : payNo.trim();
    }

    public String getRequestRefundNo() {
        return requestRefundNo;
    }

    public void setRequestRefundNo(String requestRefundNo) {
        this.requestRefundNo = requestRefundNo == null ? null : requestRefundNo.trim();
    }

    public String getResponseRefundNo() {
        return responseRefundNo;
    }

    public void setResponseRefundNo(String responseRefundNo) {
        this.responseRefundNo = responseRefundNo == null ? null : responseRefundNo.trim();
    }

    public Double getRefundMoney() {
        return refundMoney;
    }

    public void setRefundMoney(Double refundMoney) {
        this.refundMoney = refundMoney;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getIsRefund() {
        return isRefund;
    }

    public void setIsRefund(Integer isRefund) {
        this.isRefund = isRefund;
    }

    public String getRefundChannel() {
        return refundChannel;
    }

    public void setRefundChannel(String refundChannel) {
        this.refundChannel = refundChannel == null ? null : refundChannel.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Integer getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(Integer refundTime) {
        this.refundTime = refundTime;
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public static class RefundCode implements Serializable {
        private Integer id;

        private String tripNo;

        private String payNo;

        private String requestRefundNo;

        private String responseRefundNo;

        private Double refundMoney;

        private String type;

        private Integer isRefund;

        private String refundChannel;

        private String reason;

        private Integer refundTime;

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

        public String getPayNo() {
            return payNo;
        }

        public void setPayNo(String payNo) {
            this.payNo = payNo == null ? null : payNo.trim();
        }

        public String getRequestRefundNo() {
            return requestRefundNo;
        }

        public void setRequestRefundNo(String requestRefundNo) {
            this.requestRefundNo = requestRefundNo == null ? null : requestRefundNo.trim();
        }

        public String getResponseRefundNo() {
            return responseRefundNo;
        }

        public void setResponseRefundNo(String responseRefundNo) {
            this.responseRefundNo = responseRefundNo == null ? null : responseRefundNo.trim();
        }

        public Double getRefundMoney() {
            return refundMoney;
        }

        public void setRefundMoney(Double refundMoney) {
            this.refundMoney = refundMoney;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type == null ? null : type.trim();
        }

        public Integer getIsRefund() {
            return isRefund;
        }

        public void setIsRefund(Integer isRefund) {
            this.isRefund = isRefund;
        }

        public String getRefundChannel() {
            return refundChannel;
        }

        public void setRefundChannel(String refundChannel) {
            this.refundChannel = refundChannel == null ? null : refundChannel.trim();
        }

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason == null ? null : reason.trim();
        }

        public Integer getRefundTime() {
            return refundTime;
        }

        public void setRefundTime(Integer refundTime) {
            this.refundTime = refundTime;
        }

        public Integer getAddTime() {
            return addTime;
        }

        public void setAddTime(Integer addTime) {
            this.addTime = addTime;
        }
    }
}