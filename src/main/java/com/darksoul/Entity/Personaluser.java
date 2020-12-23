package com.darksoul.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;


public class Personaluser {
//    个人用户表
    private String PersonalUserid;//个人用户ID
    private String PersonalUsername;//个人用户名
    private String password;//密码
    private String unitusername;//单位用户名
    private String email;//邮箱
    private String phonenumber;//手机号码
    private String headphoto;//头像
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createdate;//注册时间

    public Personaluser() {
    }

    public Personaluser(String personalUserid, String personalUsername, String password, String unitusername, String email, String phonenumber, String headphoto, Date createdate) {
        PersonalUserid = personalUserid;
        PersonalUsername = personalUsername;
        this.password = password;
        this.unitusername = unitusername;
        this.email = email;
        this.phonenumber = phonenumber;
        this.headphoto = headphoto;
        this.createdate = createdate;
    }

    public String getPersonalUserid() {
        return PersonalUserid;
    }
    @JsonProperty(value = "PersonalUserid")
    public void setPersonalUserid(String personalUserid) {
        PersonalUserid = personalUserid;
    }

    public String getPersonalUsername() {
        return PersonalUsername;
    }
    @JsonProperty(value = "PersonalUsername")
    public void setPersonalUsername(String personalUsername) {
        PersonalUsername = personalUsername;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUnitusername() {
        return unitusername;
    }

    public void setUnitusername(String unitusername) {
        this.unitusername = unitusername;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getHeadphoto() {
        return headphoto;
    }

    public void setHeadphoto(String headphoto) {
        this.headphoto = headphoto;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    @Override
    public String toString() {
        return "Personaluser{" +
                "PersonalUserid='" + PersonalUserid + '\'' +
                ", PersonalUsername='" + PersonalUsername + '\'' +
                ", password='" + password + '\'' +
                ", unitusername='" + unitusername + '\'' +
                ", email='" + email + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", headphoto='" + headphoto + '\'' +
                ", createdate=" + createdate +
                '}';
    }
}
