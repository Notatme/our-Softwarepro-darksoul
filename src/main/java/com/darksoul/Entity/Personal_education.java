package com.darksoul.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;


public class Personal_education {
//    个人学历情况表
    private String PersonalUserid;//个人用户ID
    private String PersonalreviewID;//个人评审总表ID

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date  graduationtime;//毕业时间

    private String graduationschool;//毕业学校
    private String educationproject;//学历项目
    private String major;//专业
    private String education;//学历
    private String degree;//学位
    private Float  lengthofschooling;//学制
    private String educationid;//毕业证编号
    private String educationdegreecredential;//学历学位证书材料

    public Personal_education() {
    }

    public Personal_education(String personalUserid, String personalreviewID, Date graduationtime, String graduationschool, String educationproject, String major, String education, String degree, Float lengthofschooling, String educationid, String educationdegreecredential) {
        PersonalUserid = personalUserid;
        PersonalreviewID = personalreviewID;
        this.graduationtime = graduationtime;
        this.graduationschool = graduationschool;
        this.educationproject = educationproject;
        this.major = major;
        this.education = education;
        this.degree = degree;
        this.lengthofschooling = lengthofschooling;
        this.educationid = educationid;
        this.educationdegreecredential = educationdegreecredential;
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

    public Date getGraduationtime() {
        return graduationtime;
    }

    public void setGraduationtime(Date graduationtime) {
        this.graduationtime = graduationtime;
    }

    public String getGraduationschool() {
        return graduationschool;
    }

    public void setGraduationschool(String graduationschool) {
        this.graduationschool = graduationschool;
    }

    public String getEducationproject() {
        return educationproject;
    }

    public void setEducationproject(String educationproject) {
        this.educationproject = educationproject;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Float getLengthofschooling() {
        return lengthofschooling;
    }

    public void setLengthofschooling(Float lengthofschooling) {
        this.lengthofschooling = lengthofschooling;
    }

    public String getEducationid() {
        return educationid;
    }

    public void setEducationid(String educationid) {
        this.educationid = educationid;
    }

    public String getEducationdegreecredential() {
        return educationdegreecredential;
    }

    public void setEducationdegreecredential(String educationdegreecredential) {
        this.educationdegreecredential = educationdegreecredential;
    }


    @Override
    public String toString() {
        return "Personal_education{" +
                "PersonalUserid='" + PersonalUserid + '\'' +
                ", PersonalreviewID='" + PersonalreviewID + '\'' +
                ", graduationtime=" + graduationtime +
                ", graduationschool='" + graduationschool + '\'' +
                ", educationproject='" + educationproject + '\'' +
                ", major='" + major + '\'' +
                ", education='" + education + '\'' +
                ", degree='" + degree + '\'' +
                ", lengthofschooling=" + lengthofschooling +
                ", educationid='" + educationid + '\'' +
                ", educationdegreecredential='" + educationdegreecredential + '\'' +
                '}';
    }
}
