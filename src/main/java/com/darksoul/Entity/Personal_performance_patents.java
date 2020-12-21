package com.darksoul.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;


public class Personal_performance_patents {
    //个人业绩专利表
    private String PersonalUserid;//个人用户ID
    private String PersonalreviewID;//个人评审总表ID
    private String patentsname;//专利名称
    private String patentstype;//专利类型

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date gettime;//取得时间

    private String patentsintroduce;//专利介绍
    private String assistcertify;//辅助证明材料

    public Personal_performance_patents() {
    }

    public Personal_performance_patents(String personalUserid, String personalreviewID, String patentsname, String patentstype, Date gettime, String patentsintroduce, String assistcertify) {
        PersonalUserid = personalUserid;
        PersonalreviewID = personalreviewID;
        this.patentsname = patentsname;
        this.patentstype = patentstype;
        this.gettime = gettime;
        this.patentsintroduce = patentsintroduce;
        this.assistcertify = assistcertify;
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

    public String getPatentsname() {
        return patentsname;
    }

    public void setPatentsname(String patentsname) {
        this.patentsname = patentsname;
    }

    public String getPatentstype() {
        return patentstype;
    }

    public void setPatentstype(String patentstype) {
        this.patentstype = patentstype;
    }

    public Date getGettime() {
        return gettime;
    }

    public void setGettime(Date gettime) {
        this.gettime = gettime;
    }

    public String getPatentsintroduce() {
        return patentsintroduce;
    }

    public void setPatentsintroduce(String patentsintroduce) {
        this.patentsintroduce = patentsintroduce;
    }

    public String getAssistcertify() {
        return assistcertify;
    }

    public void setAssistcertify(String assistcertify) {
        this.assistcertify = assistcertify;
    }

    @Override
    public String toString() {
        return "Personal_performance_patents{" +
                "PersonalUserid='" + PersonalUserid + '\'' +
                ", PersonalreviewID='" + PersonalreviewID + '\'' +
                ", patentsname='" + patentsname + '\'' +
                ", patentstype='" + patentstype + '\'' +
                ", gettime=" + gettime +
                ", patentsintroduce='" + patentsintroduce + '\'' +
                ", assistcertify='" + assistcertify + '\'' +
                '}';
    }
}
