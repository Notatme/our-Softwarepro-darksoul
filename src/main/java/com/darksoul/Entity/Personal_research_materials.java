package com.darksoul.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

public class Personal_research_materials {
//   个人国（境）外工作或研究材料表
    private String PersonalUserid;//个人用户ID
    private String PersonalreviewID;//个人评审总表ID
    private Date starttime;//开始时间
    private Date stoptime;//截止时间
    private String workunit;//工作单位
    private String job;//职务岗位
    private String jobcontent;//工作内容
    private String assistcertify;//辅助证明材料

    public Personal_research_materials(){}
    public Personal_research_materials(String personalUserid, String personalreviewID, Date starttime, Date stoptime, String workunit, String job, String jobcontent, String assistcertify) {
        PersonalUserid = personalUserid;
        PersonalreviewID = personalreviewID;
        this.starttime = starttime;
        this.stoptime = stoptime;
        this.workunit = workunit;
        this.job = job;
        this.jobcontent = jobcontent;
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

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getStoptime() {
        return stoptime;
    }

    public void setStoptime(Date stoptime) {
        this.stoptime = stoptime;
    }

    public String getWorkunit() {
        return workunit;
    }

    public void setWorkunit(String workunit) {
        this.workunit = workunit;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getJobcontent() {
        return jobcontent;
    }

    public void setJobcontent(String jobcontent) {
        this.jobcontent = jobcontent;
    }

    public String getAssistcertify() {
        return assistcertify;
    }

    public void setAssistcertify(String assistcertify) {
        this.assistcertify = assistcertify;
    }

    @Override
    public String toString() {
        return "Personal_research_materials{" +
                "PersonalUserid='" + PersonalUserid + '\'' +
                ", PersonalreviewID='" + PersonalreviewID + '\'' +
                ", starttime=" + starttime +
                ", stoptime=" + stoptime +
                ", workunit='" + workunit + '\'' +
                ", job='" + job + '\'' +
                ", jobcontent='" + jobcontent + '\'' +
                ", assistcertify='" + assistcertify + '\'' +
                '}';
    }
}
