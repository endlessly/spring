package com.test.dto;

import java.io.Serializable;

public class tripInfoCodeDto {
    private Integer id;

    private String tripNo;

    private String contacterName;

    private String contacterMobile;

    private Integer iqty;

    private Integer bgndate;

    private Integer enddate;

    private String language;

    private String cancelReson;

    private Integer cancelTime;

    private String city;

    private String memo;

    private String guiderName;

    private Boolean guiderSex;

    private String guiderAge;

    private String guiderCode;

    private String guiderImg;

    private String guiderMobile;

    private String faceAddr;

    private String balancetype;

    private String members;

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

    public String getContacterName() {
        return contacterName;
    }

    public void setContacterName(String contacterName) {
        this.contacterName = contacterName == null ? null : contacterName.trim();
    }

    public String getContacterMobile() {
        return contacterMobile;
    }

    public void setContacterMobile(String contacterMobile) {
        this.contacterMobile = contacterMobile == null ? null : contacterMobile.trim();
    }

    public Integer getIqty() {
        return iqty;
    }

    public void setIqty(Integer iqty) {
        this.iqty = iqty;
    }

    public Integer getBgndate() {
        return bgndate;
    }

    public void setBgndate(Integer bgndate) {
        this.bgndate = bgndate;
    }

    public Integer getEnddate() {
        return enddate;
    }

    public void setEnddate(Integer enddate) {
        this.enddate = enddate;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getCancelReson() {
        return cancelReson;
    }

    public void setCancelReson(String cancelReson) {
        this.cancelReson = cancelReson == null ? null : cancelReson.trim();
    }

    public Integer getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Integer cancelTime) {
        this.cancelTime = cancelTime;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getGuiderName() {
        return guiderName;
    }

    public void setGuiderName(String guiderName) {
        this.guiderName = guiderName == null ? null : guiderName.trim();
    }

    public Boolean getGuiderSex() {
        return guiderSex;
    }

    public void setGuiderSex(Boolean guiderSex) {
        this.guiderSex = guiderSex;
    }

    public String getGuiderAge() {
        return guiderAge;
    }

    public void setGuiderAge(String guiderAge) {
        this.guiderAge = guiderAge == null ? null : guiderAge.trim();
    }

    public String getGuiderCode() {
        return guiderCode;
    }

    public void setGuiderCode(String guiderCode) {
        this.guiderCode = guiderCode == null ? null : guiderCode.trim();
    }

    public String getGuiderImg() {
        return guiderImg;
    }

    public void setGuiderImg(String guiderImg) {
        this.guiderImg = guiderImg == null ? null : guiderImg.trim();
    }

    public String getGuiderMobile() {
        return guiderMobile;
    }

    public void setGuiderMobile(String guiderMobile) {
        this.guiderMobile = guiderMobile == null ? null : guiderMobile.trim();
    }

    public String getFaceAddr() {
        return faceAddr;
    }

    public void setFaceAddr(String faceAddr) {
        this.faceAddr = faceAddr == null ? null : faceAddr.trim();
    }

    public String getBalancetype() {
        return balancetype;
    }

    public void setBalancetype(String balancetype) {
        this.balancetype = balancetype == null ? null : balancetype.trim();
    }

    public String getMembers() {
        return members;
    }

    public void setMembers(String members) {
        this.members = members == null ? null : members.trim();
    }

    public static class tripInfoCode implements Serializable {
        private Integer id;

        private String tripNo;

        private String contacterName;

        private String contacterMobile;

        private Integer iqty;

        private Integer bgndate;

        private Integer enddate;

        private String language;

        private String cancelReson;

        private Integer cancelTime;

        private String city;

        private String memo;

        private String guiderName;

        private Boolean guiderSex;

        private String guiderAge;

        private String guiderCode;

        private String guiderImg;

        private String guiderMobile;

        private String faceAddr;

        private String balancetype;

        private String members;

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

        public String getContacterName() {
            return contacterName;
        }

        public void setContacterName(String contacterName) {
            this.contacterName = contacterName == null ? null : contacterName.trim();
        }

        public String getContacterMobile() {
            return contacterMobile;
        }

        public void setContacterMobile(String contacterMobile) {
            this.contacterMobile = contacterMobile == null ? null : contacterMobile.trim();
        }

        public Integer getIqty() {
            return iqty;
        }

        public void setIqty(Integer iqty) {
            this.iqty = iqty;
        }

        public Integer getBgndate() {
            return bgndate;
        }

        public void setBgndate(Integer bgndate) {
            this.bgndate = bgndate;
        }

        public Integer getEnddate() {
            return enddate;
        }

        public void setEnddate(Integer enddate) {
            this.enddate = enddate;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language == null ? null : language.trim();
        }

        public String getCancelReson() {
            return cancelReson;
        }

        public void setCancelReson(String cancelReson) {
            this.cancelReson = cancelReson == null ? null : cancelReson.trim();
        }

        public Integer getCancelTime() {
            return cancelTime;
        }

        public void setCancelTime(Integer cancelTime) {
            this.cancelTime = cancelTime;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city == null ? null : city.trim();
        }

        public String getMemo() {
            return memo;
        }

        public void setMemo(String memo) {
            this.memo = memo == null ? null : memo.trim();
        }

        public String getGuiderName() {
            return guiderName;
        }

        public void setGuiderName(String guiderName) {
            this.guiderName = guiderName == null ? null : guiderName.trim();
        }

        public Boolean getGuiderSex() {
            return guiderSex;
        }

        public void setGuiderSex(Boolean guiderSex) {
            this.guiderSex = guiderSex;
        }

        public String getGuiderAge() {
            return guiderAge;
        }

        public void setGuiderAge(String guiderAge) {
            this.guiderAge = guiderAge == null ? null : guiderAge.trim();
        }

        public String getGuiderCode() {
            return guiderCode;
        }

        public void setGuiderCode(String guiderCode) {
            this.guiderCode = guiderCode == null ? null : guiderCode.trim();
        }

        public String getGuiderImg() {
            return guiderImg;
        }

        public void setGuiderImg(String guiderImg) {
            this.guiderImg = guiderImg == null ? null : guiderImg.trim();
        }

        public String getGuiderMobile() {
            return guiderMobile;
        }

        public void setGuiderMobile(String guiderMobile) {
            this.guiderMobile = guiderMobile == null ? null : guiderMobile.trim();
        }

        public String getFaceAddr() {
            return faceAddr;
        }

        public void setFaceAddr(String faceAddr) {
            this.faceAddr = faceAddr == null ? null : faceAddr.trim();
        }

        public String getBalancetype() {
            return balancetype;
        }

        public void setBalancetype(String balancetype) {
            this.balancetype = balancetype == null ? null : balancetype.trim();
        }

        public String getMembers() {
            return members;
        }

        public void setMembers(String members) {
            this.members = members == null ? null : members.trim();
        }
    }
}