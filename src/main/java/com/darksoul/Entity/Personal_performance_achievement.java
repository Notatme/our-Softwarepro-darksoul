package com.darksoul.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;


public class Personal_performance_achievement {
//    个人业绩成果表
    private String PersonalUserid;//个人用户ID
    private String PersonalreviewID;//个人评审总表ID
    private String performancename;//业绩名称（如项目，专利，标准，课题等）

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date starttime;//开始时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date stoptime;//截止时间

    private String projectlevel;//项目级别
    private String projectcontent;//项目内容(最多70字)
    private String personaleffect;//本人起何作用(独立、主持、主要参加、参加或协助)
    private String achievementeffect;//完成情况及效果、效益、获何种奖励、专利(最多250字)
    private String projectscan;//项目材料扫描件
    private String personalprojectscan;//个人项目任职证明扫描件
    private String projectawardsscan;//项目获奖扫描件

    public Personal_performance_achievement() {
    }

    public Personal_performance_achievement(String personalUserid, String personalreviewID, String performancename, Date starttime, Date stoptime, String projectlevel, String projectcontent, String personaleffect, String achievementeffect, String projectscan, String personalprojectscan, String projectawardsscan) {
        PersonalUserid = personalUserid;
        PersonalreviewID = personalreviewID;
        this.performancename = performancename;
        this.starttime = starttime;
        this.stoptime = stoptime;
        this.projectlevel = projectlevel;
        this.projectcontent = projectcontent;
        this.personaleffect = personaleffect;
        this.achievementeffect = achievementeffect;
        this.projectscan = projectscan;
        this.personalprojectscan = personalprojectscan;
        this.projectawardsscan = projectawardsscan;
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

    public String getPerformancename() {
        return performancename;
    }

    public void setPerformancename(String performancename) {
        this.performancename = performancename;
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

    public String getProjectlevel() {
        return projectlevel;
    }

    public void setProjectlevel(String projectlevel) {
        this.projectlevel = projectlevel;
    }

    public String getProjectcontent() {
        return projectcontent;
    }

    public void setProjectcontent(String projectcontent) {
        this.projectcontent = projectcontent;
    }

    public String getPersonaleffect() {
        return personaleffect;
    }

    public void setPersonaleffect(String personaleffect) {
        this.personaleffect = personaleffect;
    }

    public String getAchievementeffect() {
        return achievementeffect;
    }

    public void setAchievementeffect(String achievementeffect) {
        this.achievementeffect = achievementeffect;
    }

    public String getProjectscan() {
        return projectscan;
    }

    public void setProjectscan(String projectscan) {
        this.projectscan = projectscan;
    }

    public String getPersonalprojectscan() {
        return personalprojectscan;
    }

    public void setPersonalprojectscan(String personalprojectscan) {
        this.personalprojectscan = personalprojectscan;
    }

    public String getProjectawardsscan() {
        return projectawardsscan;
    }

    public void setProjectawardsscan(String projectawardsscan) {
        this.projectawardsscan = projectawardsscan;
    }

    @Override
    public String toString() {
        return "Personal_performance_achievement{" +
                "PersonalUserid='" + PersonalUserid + '\'' +
                ", PersonalreviewID='" + PersonalreviewID + '\'' +
                ", performancename='" + performancename + '\'' +
                ", starttime=" + starttime +
                ", stoptime=" + stoptime +
                ", projectlevel='" + projectlevel + '\'' +
                ", projectcontent='" + projectcontent + '\'' +
                ", personaleffect='" + personaleffect + '\'' +
                ", achievementeffect='" + achievementeffect + '\'' +
                ", projectscan='" + projectscan + '\'' +
                ", personalprojectscan='" + personalprojectscan + '\'' +
                ", projectawardsscan='" + projectawardsscan + '\'' +
                '}';
    }
}
