package com.darksoul.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;


public class Personal_major_experience {
//    个人主要经历表
    private String PersonalUserid;//个人用户ID
    private String PersonalreviewID;//个人评审总表ID
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date starttime;//开始时间

    private String whereschoolwork;//何地,何学校,何单位学习或从事何种专业技术工作
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date endtime;//截止时间

    private String post;//任何职
    private String workunit;//工作单位
    private String certifyman;//证明人
    private String helpcertify;//辅助证明材料

    public Personal_major_experience() {
    }

    public Personal_major_experience(String personalUserid, String personalreviewID, Date starttime, String whereschoolwork, Date endtime, String post, String workunit, String certifyman, String helpcertify) {
        PersonalUserid = personalUserid;
        PersonalreviewID = personalreviewID;
        this.starttime = starttime;
        this.whereschoolwork = whereschoolwork;
        this.endtime = endtime;
        this.post = post;
        this.workunit = workunit;
        this.certifyman = certifyman;
        this.helpcertify = helpcertify;
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

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public String getWhereschoolwork() {
        return whereschoolwork;
    }

    public void setWhereschoolwork(String whereschoolwork) {
        this.whereschoolwork = whereschoolwork;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getWorkunit() {
        return workunit;
    }

    public void setWorkunit(String workunit) {
        this.workunit = workunit;
    }

    public String getCertifyman() {
        return certifyman;
    }

    public void setCertifyman(String certifyman) {
        this.certifyman = certifyman;
    }

    public String getHelpcertify() {
        return helpcertify;
    }

    public void setHelpcertify(String helpcertify) {
        this.helpcertify = helpcertify;
    }

    @Override
    public String toString() {
        return "Personal_major_experience{" +
                "PersonalUserid='" + PersonalUserid + '\'' +
                ", PersonalreviewID='" + PersonalreviewID + '\'' +
                ", starttime=" + starttime +
                ", whereschoolwork='" + whereschoolwork + '\'' +
                ", endtime=" + endtime +
                ", post='" + post + '\'' +
                ", workunit='" + workunit + '\'' +
                ", certifyman='" + certifyman + '\'' +
                ", helpcertify='" + helpcertify + '\'' +
                '}';
    }
}
