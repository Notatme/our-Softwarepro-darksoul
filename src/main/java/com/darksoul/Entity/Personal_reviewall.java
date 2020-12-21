package com.darksoul.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;


public class Personal_reviewall {
//    个人评审汇总表
    private String PersonalUserid;//个人用户ID
    private String PersonalreviewID;//个人评审总表ID

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date reviewdate;//申报年度
    private String review;//评委会所属职改办
    private String reviewstatusname;//拟申报资格名称
    private String reviewname;//评审会名称
    private String reviewlevel;//评审等级

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createdate;//创建时间
    private String reviewhandintime;//材料报送时间段

    public Personal_reviewall() {
    }

    public Personal_reviewall(String personalUserid, String personalreviewID, Date reviewdate, String review, String reviewstatusname, String reviewname, String reviewlevel, Date createdate, String reviewhandintime) {
        PersonalUserid = personalUserid;
        PersonalreviewID = personalreviewID;
        this.reviewdate = reviewdate;
        this.review = review;
        this.reviewstatusname = reviewstatusname;
        this.reviewname = reviewname;
        this.reviewlevel = reviewlevel;
        this.createdate = createdate;
        this.reviewhandintime = reviewhandintime;
    }

    public String getPersonalUserid() {
        return PersonalUserid;
    }
    @JsonProperty(value = "PersonalUserid")
    public void setPersonalUserid(String personalUserid) {
        PersonalUserid = personalUserid;
    }

    public String getPersonalreviewID() {
        return PersonalreviewID;
    }
    @JsonProperty(value = "PersonalreviewID")
    public void setPersonalreviewID(String personalreviewID) {
        PersonalreviewID = personalreviewID;
    }

    public Date getReviewdate() {
        return reviewdate;
    }

    public void setReviewdate(Date reviewdate) {
        this.reviewdate = reviewdate;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getReviewstatusname() {
        return reviewstatusname;
    }

    public void setReviewstatusname(String reviewstatusname) {
        this.reviewstatusname = reviewstatusname;
    }

    public String getReviewname() {
        return reviewname;
    }

    public void setReviewname(String reviewname) {
        this.reviewname = reviewname;
    }

    public String getReviewlevel() {
        return reviewlevel;
    }

    public void setReviewlevel(String reviewlevel) {
        this.reviewlevel = reviewlevel;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getReviewhandintime() {
        return reviewhandintime;
    }

    public void setReviewhandintime(String reviewhandintime) {
        this.reviewhandintime = reviewhandintime;
    }

    @Override
    public String toString() {
        return "Personal_reviewall{" +
                "PersonalUserid='" + PersonalUserid + '\'' +
                ", PersonalreviewID='" + PersonalreviewID + '\'' +
                ", reviewdate=" + reviewdate +
                ", review='" + review + '\'' +
                ", reviewstatusname='" + reviewstatusname + '\'' +
                ", reviewname='" + reviewname + '\'' +
                ", reviewlevel='" + reviewlevel + '\'' +
                ", createdate=" + createdate +
                ", reviewhandintime='" + reviewhandintime + '\'' +
                '}';
    }
}
