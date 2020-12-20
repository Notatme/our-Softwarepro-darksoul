package com.darksoul.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Personal_introduceman {
// 个人人才引进相关材料表
    private String PersonalUserid;//个人用户ID
    private String PersonalreviewID;//个人评审总表ID
    private String MaterialsName;//材料名称
    private String MaterialsAdjunct;//材料附件

   public Personal_introduceman(){}

    public Personal_introduceman(String personalUserid, String personalreviewID, String materialsName, String materialsAdjunct) {
        PersonalUserid = personalUserid;
        PersonalreviewID = personalreviewID;
        MaterialsName = materialsName;
        MaterialsAdjunct = materialsAdjunct;
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

    public String getMaterialsName() {
        return MaterialsName;
    }

    @JsonProperty(value = "MaterialsName")
    public void setMaterialsName(String materialsName) {
        MaterialsName = materialsName;
    }

    public String getMaterialsAdjunct() {
        return MaterialsAdjunct;
    }

    @JsonProperty(value = "MaterialsAdjunct")
    public void setMaterialsAdjunct(String materialsAdjunct) {
        MaterialsAdjunct = materialsAdjunct;
    }

    @Override
    public String toString() {
        return "Personal_introduceman{" +
                "PersonalUserid='" + PersonalUserid + '\'' +
                ", PersonalreviewID='" + PersonalreviewID + '\'' +
                ", MaterialsName='" + MaterialsName + '\'' +
                ", MaterialsAdjunct='" + MaterialsAdjunct + '\'' +
                '}';
    }
}
