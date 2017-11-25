package com.test.dto;

import java.io.Serializable;

public class tripCommentCodeDto {
    private Integer id;

    private String tripNo;

    private String guideCode;

    private Integer uid;

    private String comment;

    private String commentTag;

    private String commentStar;

    private String status;

    private Boolean isDel;

    private Integer time;

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

    public String getGuideCode() {
        return guideCode;
    }

    public void setGuideCode(String guideCode) {
        this.guideCode = guideCode == null ? null : guideCode.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getCommentTag() {
        return commentTag;
    }

    public void setCommentTag(String commentTag) {
        this.commentTag = commentTag == null ? null : commentTag.trim();
    }

    public String getCommentStar() {
        return commentStar;
    }

    public void setCommentStar(String commentStar) {
        this.commentStar = commentStar == null ? null : commentStar.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public static class tripCommentCode implements Serializable {
        private Integer id;

        private String tripNo;

        private String guideCode;

        private Integer uid;

        private String comment;

        private String commentTag;

        private String commentStar;

        private String status;

        private Boolean isDel;

        private Integer time;

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

        public String getGuideCode() {
            return guideCode;
        }

        public void setGuideCode(String guideCode) {
            this.guideCode = guideCode == null ? null : guideCode.trim();
        }

        public Integer getUid() {
            return uid;
        }

        public void setUid(Integer uid) {
            this.uid = uid;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment == null ? null : comment.trim();
        }

        public String getCommentTag() {
            return commentTag;
        }

        public void setCommentTag(String commentTag) {
            this.commentTag = commentTag == null ? null : commentTag.trim();
        }

        public String getCommentStar() {
            return commentStar;
        }

        public void setCommentStar(String commentStar) {
            this.commentStar = commentStar == null ? null : commentStar.trim();
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status == null ? null : status.trim();
        }

        public Boolean getIsDel() {
            return isDel;
        }

        public void setIsDel(Boolean isDel) {
            this.isDel = isDel;
        }

        public Integer getTime() {
            return time;
        }

        public void setTime(Integer time) {
            this.time = time;
        }
    }
}