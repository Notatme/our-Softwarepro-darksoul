package com.darksoul.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Personal_introduceman {
// 个人人才引进相关材料表
    private String PersonalUserid;//个人用户ID
    private String PersonalreviewID;//个人评审总表ID
    private String materialsname;//材料名称
    private String materialsadjunct;//材料附件

   public Personal_introduceman(){}

    public Personal_introduceman(String personalUserid, String personalreviewID, String materialsname, String materialsadjunct) {
        PersonalUserid = personalUserid;
        PersonalreviewID = personalreviewID;
        this.materialsname = materialsname;
        this.materialsadjunct = materialsadjunct;
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

    public String getMaterialsname() {
        return materialsname;
    }

    public void setMaterialsname(String materialsname) {
        this.materialsname = materialsname;
    }

    public String getMaterialsadjunct() {
        return materialsadjunct;
    }

    public void setMaterialsadjunct(String materialsadjunct) {
        this.materialsadjunct = materialsadjunct;
    }

    @Override
    public String toString() {
        return "Personal_introduceman{" +
                "PersonalUserid='" + PersonalUserid + '\'' +
                ", PersonalreviewID='" + PersonalreviewID + '\'' +
                ", materialsname='" + materialsname + '\'' +
                ", materialsadjunct='" + materialsadjunct + '\'' +
                '}';
    }
}
