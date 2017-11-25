package com.test.dto;

import java.io.Serializable;

public class VerifyCodeDto {
    private Integer id;

    private Integer verifyCode;

    private String mobile;

    private Boolean valid;

    private Integer checkNum;

    private Integer type;

    private Integer sendTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(Integer verifyCode) {
        this.verifyCode = verifyCode;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public Integer getCheckNum() {
        return checkNum;
    }

    public void setCheckNum(Integer checkNum) {
        this.checkNum = checkNum;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSendTime() {
        return sendTime;
    }

    public void setSendTime(Integer sendTime) {
        this.sendTime = sendTime;
    }

    public static class VerifyCode implements Serializable {
        private Integer id;

        private Integer verifyCode;

        private String mobile;

        private Boolean valid;

        private Integer checkNum;

        private Integer type;

        private Integer sendTime;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getVerifyCode() {
            return verifyCode;
        }

        public void setVerifyCode(Integer verifyCode) {
            this.verifyCode = verifyCode;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile == null ? null : mobile.trim();
        }

        public Boolean getValid() {
            return valid;
        }

        public void setValid(Boolean valid) {
            this.valid = valid;
        }

        public Integer getCheckNum() {
            return checkNum;
        }

        public void setCheckNum(Integer checkNum) {
            this.checkNum = checkNum;
        }

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        public Integer getSendTime() {
            return sendTime;
        }

        public void setSendTime(Integer sendTime) {
            this.sendTime = sendTime;
        }
    }
}