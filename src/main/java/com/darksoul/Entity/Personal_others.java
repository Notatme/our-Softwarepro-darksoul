package com.darksoul.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Personal_others {
//    个人其他材料表
    private String PersonalUserid;//个人用户ID
    private String PersonalreviewID;//个人评审总表ID
    private String title;//标题
    private String projectscan;//项目扫描件

    public  Personal_others(){}

    public Personal_others(String personalUserid, String personalreviewID, String title, String projectscan) {
        PersonalUserid = personalUserid;
        PersonalreviewID = personalreviewID;
        this.title = title;
        this.projectscan = projectscan;
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

    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public String getProjectscan() {
        return projectscan;
    }


    public void setProjectscan(String projectscan) {
        this.projectscan = projectscan;
    }

    @Override
    public String toString() {
        return "Personal_others{" +
                "PersonalUserid='" + PersonalUserid + '\'' +
                ", PersonalreviewID='" + PersonalreviewID + '\'' +
                ", title='" + title + '\'' +
                ", projectscan='" + projectscan + '\'' +
                '}';
    }
}
