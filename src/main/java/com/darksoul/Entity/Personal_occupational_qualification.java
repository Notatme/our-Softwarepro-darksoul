package com.darksoul.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;


public class Personal_occupational_qualification {
//   个人从业或执业（职业）资格表
    private String PersonalUserid;//个人用户ID
    private String PersonalreviewID;//个人评审总表ID
    private String qualificationname;//资格名称
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date gettime;//取得时间

    private String ratifyoffice;//批准机关
    private String majorname;//专业名称
    private String credentialnumber;//证书编号
    private String assistcertify;//辅助证明材料

    public Personal_occupational_qualification() {
    }

    public Personal_occupational_qualification(String personalUserid, String personalreviewID, String qualificationname, Date gettime, String ratifyoffice, String majorname, String credentialnumber, String assistcertify) {
        PersonalUserid = personalUserid;
        PersonalreviewID = personalreviewID;
        this.qualificationname = qualificationname;
        this.gettime = gettime;
        this.ratifyoffice = ratifyoffice;
        this.majorname = majorname;
        this.credentialnumber = credentialnumber;
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

    public String getQualificationname() {
        return qualificationname;
    }

    public void setQualificationname(String qualificationname) {
        this.qualificationname = qualificationname;
    }

    public Date getGettime() {
        return gettime;
    }

    public void setGettime(Date gettime) {
        this.gettime = gettime;
    }

    public String getRatifyoffice() {
        return ratifyoffice;
    }

    public void setRatifyoffice(String ratifyoffice) {
        this.ratifyoffice = ratifyoffice;
    }

    public String getMajorname() {
        return majorname;
    }

    public void setMajorname(String majorname) {
        this.majorname = majorname;
    }

    public String getCredentialnumber() {
        return credentialnumber;
    }

    public void setCredentialnumber(String credentialnumber) {
        this.credentialnumber = credentialnumber;
    }

    public String getAssistcertify() {
        return assistcertify;
    }

    public void setAssistcertify(String assistcertify) {
        this.assistcertify = assistcertify;
    }

    @Override
    public String toString() {
        return "Personal_occupational_qualification{" +
                "PersonalUserid='" + PersonalUserid + '\'' +
                ", PersonalreviewID='" + PersonalreviewID + '\'' +
                ", qualificationname='" + qualificationname + '\'' +
                ", gettime=" + gettime +
                ", ratifyoffice='" + ratifyoffice + '\'' +
                ", majorname='" + majorname + '\'' +
                ", credentialnumber='" + credentialnumber + '\'' +
                ", assistcertify='" + assistcertify + '\'' +
                '}';
    }
}
