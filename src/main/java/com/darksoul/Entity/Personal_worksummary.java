package com.darksoul.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Personal_worksummary {
//    个人工作总结表
    private String PersonalUserid;//个人用户ID
    private String PersonalreviewID;//个人评审总表ID
    private String worksummary;//工作总结

    public Personal_worksummary() {
    }

    public Personal_worksummary(String personalUserid, String personalreviewID, String worksummary) {
        PersonalUserid = personalUserid;
        PersonalreviewID = personalreviewID;
        this.worksummary = worksummary;
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

    public String getWorksummary() {
        return worksummary;
    }

    public void setWorksummary(String worksummary) {
        this.worksummary = worksummary;
    }

    @Override
    public String toString() {
        return "Personal_worksummary{" +
                "PersonalUserid='" + PersonalUserid + '\'' +
                ", PersonalreviewID='" + PersonalreviewID + '\'' +
                ", worksummary='" + worksummary + '\'' +
                '}';
    }
}
