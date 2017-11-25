package com.test.dto;

import java.io.Serializable;

public class ContactUserDto {
    private Integer id;

    private Integer uid;

    private String name;

    private String mobile;

    private Boolean isDel;

    private Integer sort;

    private Integer addTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public static class ContactUser implements Serializable {
        private Integer id;

        private Integer uid;

        private String name;

        private String mobile;

        private Boolean isDel;

        private Integer sort;

        private Integer addTime;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getUid() {
            return uid;
        }

        public void setUid(Integer uid) {
            this.uid = uid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name == null ? null : name.trim();
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile == null ? null : mobile.trim();
        }

        public Boolean getIsDel() {
            return isDel;
        }

        public void setIsDel(Boolean isDel) {
            this.isDel = isDel;
        }

        public Integer getSort() {
            return sort;
        }

        public void setSort(Integer sort) {
            this.sort = sort;
        }

        public Integer getAddTime() {
            return addTime;
        }

        public void setAddTime(Integer addTime) {
            this.addTime = addTime;
        }
    }
}