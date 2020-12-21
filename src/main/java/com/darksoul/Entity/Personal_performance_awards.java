package com.darksoul.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Personal_performance_awards {
//    个人业绩奖项表
    private String PersonalUserid;//个人用户ID
    private String PersonalreviewID;//个人评审总表ID
    private String projectname;//项目名称
    private String awardslevel;//奖励等级
    private String awardtime;//授予时间
    private String awardorganization;//授予机构
    private String content;//内容提要
    private String assistcertify;//辅助证明材料

    public Personal_performance_awards() {
    }

    public Personal_performance_awards(String personalUserid, String personalreviewID, String projectname, String awardslevel, String awardtime, String awardorganization, String content, String assistcertify) {
        PersonalUserid = personalUserid;
        PersonalreviewID = personalreviewID;
        this.projectname = projectname;
        this.awardslevel = awardslevel;
        this.awardtime = awardtime;
        this.awardorganization = awardorganization;
        this.content = content;
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

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getAwardslevel() {
        return awardslevel;
    }

    public void setAwardslevel(String awardslevel) {
        this.awardslevel = awardslevel;
    }

    public String getAwardtime() {
        return awardtime;
    }

    public void setAwardtime(String awardtime) {
        this.awardtime = awardtime;
    }

    public String getAwardorganization() {
        return awardorganization;
    }

    public void setAwardorganization(String awardorganization) {
        this.awardorganization = awardorganization;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAssistcertify() {
        return assistcertify;
    }

    public void setAssistcertify(String assistcertify) {
        this.assistcertify = assistcertify;
    }

    @Override
    public String toString() {
        return "Personal_performance_awards{" +
                "PersonalUserid='" + PersonalUserid + '\'' +
                ", PersonalreviewID='" + PersonalreviewID + '\'' +
                ", projectname='" + projectname + '\'' +
                ", awardslevel='" + awardslevel + '\'' +
                ", awardtime='" + awardtime + '\'' +
                ", awardorganization='" + awardorganization + '\'' +
                ", content='" + content + '\'' +
                ", assistcertify='" + assistcertify + '\'' +
                '}';
    }
}
