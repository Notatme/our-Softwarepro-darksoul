package com.darksoul.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;


public class Personal_basic_message {
//    个人基本信息表
private String PersonalUserid;//个人用户ID
    private String PersonalreviewID;//个人评审总表ID
    private String unit;//单位
    private String unitlevel;//单位级别
    private String personalidentitynature;//个人身份性质
    private int reviewyear;//评审年度
    private String name;//姓名
    private String nameformer;//姓名(曾用名)
    private String sex;//性别
    private String nation;//民族
    private String idnumber;//证件号码

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;//出生年月

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date fillingtime;//填表时间

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")

    private Date startworktime;//参加工作时间
    private int workingyears;//专业技术工作年限
    private String reviewmeeting;//参加评审会
    private String wantprofessionseries;//拟评职称系列
    private String wantmajor;//拟评专业
    private String wantmajorstatus;//拟评专业技术资格
    private String executivefunction;//行政职务

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date executivefunctiontime;//行政职务任命时间
    private String executivefunctionexplatin;//行政职务说明
    private String phone;//联系电话
    private String email;//电子邮箱
    private String fileorganizationname;//档案所在地机构名称
    private String politicsstatus;//政治面貌
    private String nativeplace;//籍贯
    private String address;//联系地址
    private String idcardfront;//身份证正面照片
    private String idcardcontrary;//身份证反面照片
    private String manphoto;//近期免冠二寸照片

    public Personal_basic_message(){}

    public Personal_basic_message(String personalUserid, String personalreviewID, String unit, String unitlevel, String personalidentitynature, int reviewyear, String name, String nameformer, String sex, String nation, String idnumber, Date birthday, Date fillingtime, Date startworktime, int workingyears, String reviewmeeting, String wantprofessionseries, String wantmajor, String wantmajorstatus, String executivefunction, Date executivefunctiontime, String executivefunctionexplatin, String phone, String email, String fileorganizationname, String politicsstatus, String nativeplace, String address, String idcardfront, String idcardcontrary, String manphoto) {
        PersonalUserid = personalUserid;
        PersonalreviewID = personalreviewID;
        this.unit = unit;
        this.unitlevel = unitlevel;
        this.personalidentitynature = personalidentitynature;
        this.reviewyear = reviewyear;
        this.name = name;
        this.nameformer = nameformer;
        this.sex = sex;
        this.nation = nation;
        this.idnumber = idnumber;
        this.birthday = birthday;
        this.fillingtime = fillingtime;
        this.startworktime = startworktime;
        this.workingyears = workingyears;
        this.reviewmeeting = reviewmeeting;
        this.wantprofessionseries = wantprofessionseries;
        this.wantmajor = wantmajor;
        this.wantmajorstatus = wantmajorstatus;
        this.executivefunction = executivefunction;
        this.executivefunctiontime = executivefunctiontime;
        this.executivefunctionexplatin = executivefunctionexplatin;
        this.phone = phone;
        this.email = email;
        this.fileorganizationname = fileorganizationname;
        this.politicsstatus = politicsstatus;
        this.nativeplace = nativeplace;
        this.address = address;
        this.idcardfront = idcardfront;
        this.idcardcontrary = idcardcontrary;
        this.manphoto = manphoto;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUnitlevel() {
        return unitlevel;
    }

    public void setUnitlevel(String unitlevel) {
        this.unitlevel = unitlevel;
    }

    public String getPersonalidentitynature() {
        return personalidentitynature;
    }

    public void setPersonalidentitynature(String personalidentitynature) {
        this.personalidentitynature = personalidentitynature;
    }

    public int getReviewyear() {
        return reviewyear;
    }

    public void setReviewyear(int reviewyear) {
        this.reviewyear = reviewyear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameformer() {
        return nameformer;
    }

    public void setNameformer(String nameformer) {
        this.nameformer = nameformer;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getFillingtime() {
        return fillingtime;
    }

    public void setFillingtime(Date fillingtime) {
        this.fillingtime = fillingtime;
    }

    public Date getStartworktime() {
        return startworktime;
    }

    public void setStartworktime(Date startworktime) {
        this.startworktime = startworktime;
    }

    public int getWorkingyears() {
        return workingyears;
    }

    public void setWorkingyears(int workingyears) {
        this.workingyears = workingyears;
    }

    public String getReviewmeeting() {
        return reviewmeeting;
    }

    public void setReviewmeeting(String reviewmeeting) {
        this.reviewmeeting = reviewmeeting;
    }

    public String getWantprofessionseries() {
        return wantprofessionseries;
    }

    public void setWantprofessionseries(String wantprofessionseries) {
        this.wantprofessionseries = wantprofessionseries;
    }

    public String getWantmajor() {
        return wantmajor;
    }

    public void setWantmajor(String wantmajor) {
        this.wantmajor = wantmajor;
    }

    public String getWantmajorstatus() {
        return wantmajorstatus;
    }

    public void setWantmajorstatus(String wantmajorstatus) {
        this.wantmajorstatus = wantmajorstatus;
    }

    public String getExecutivefunction() {
        return executivefunction;
    }

    public void setExecutivefunction(String executivefunction) {
        this.executivefunction = executivefunction;
    }

    public Date getExecutivefunctiontime() {
        return executivefunctiontime;
    }

    public void setExecutivefunctiontime(Date executivefunctiontime) {
        this.executivefunctiontime = executivefunctiontime;
    }

    public String getExecutivefunctionexplatin() {
        return executivefunctionexplatin;
    }

    public void setExecutivefunctionexplatin(String executivefunctionexplatin) {
        this.executivefunctionexplatin = executivefunctionexplatin;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFileorganizationname() {
        return fileorganizationname;
    }

    public void setFileorganizationname(String fileorganizationname) {
        this.fileorganizationname = fileorganizationname;
    }

    public String getPoliticsstatus() {
        return politicsstatus;
    }

    public void setPoliticsstatus(String politicsstatus) {
        this.politicsstatus = politicsstatus;
    }

    public String getNativeplace() {
        return nativeplace;
    }

    public void setNativeplace(String nativeplace) {
        this.nativeplace = nativeplace;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdcardfront() {
        return idcardfront;
    }

    public void setIdcardfront(String idcardfront) {
        this.idcardfront = idcardfront;
    }

    public String getIdcardcontrary() {
        return idcardcontrary;
    }

    public void setIdcardcontrary(String idcardcontrary) {
        this.idcardcontrary = idcardcontrary;
    }

    public String getManphoto() {
        return manphoto;
    }

    public void setManphoto(String manphoto) {
        this.manphoto = manphoto;
    }

    @Override
    public String toString() {
        return "Personal_basic_message{" +
                "PersonalUserid='" + PersonalUserid + '\'' +
                ", PersonalreviewID='" + PersonalreviewID + '\'' +
                ", unit='" + unit + '\'' +
                ", unitlevel='" + unitlevel + '\'' +
                ", personalidentitynature='" + personalidentitynature + '\'' +
                ", reviewyear=" + reviewyear +
                ", name='" + name + '\'' +
                ", nameformer='" + nameformer + '\'' +
                ", sex='" + sex + '\'' +
                ", nation='" + nation + '\'' +
                ", idnumber='" + idnumber + '\'' +
                ", birthday=" + birthday +
                ", fillingtime=" + fillingtime +
                ", startworktime=" + startworktime +
                ", workingyears=" + workingyears +
                ", reviewmeeting='" + reviewmeeting + '\'' +
                ", wantprofessionseries='" + wantprofessionseries + '\'' +
                ", wantmajor='" + wantmajor + '\'' +
                ", wantmajorstatus='" + wantmajorstatus + '\'' +
                ", executivefunction='" + executivefunction + '\'' +
                ", executivefunctiontime=" + executivefunctiontime +
                ", executivefunctionexplatin='" + executivefunctionexplatin + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", fileorganizationname='" + fileorganizationname + '\'' +
                ", politicsstatus='" + politicsstatus + '\'' +
                ", nativeplace='" + nativeplace + '\'' +
                ", address='" + address + '\'' +
                ", idcardfront='" + idcardfront + '\'' +
                ", idcardcontrary='" + idcardcontrary + '\'' +
                ", manphoto='" + manphoto + '\'' +
                '}';
    }

}
