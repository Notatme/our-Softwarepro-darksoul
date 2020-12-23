package com.darksoul.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;


public class Unituser {
//    单位用户表
    private String UnitUserid;//单位用户ID
    private String UnitUsername;//单位用户名
    private String password;//密码
    private String email;//邮箱
    private String phonenumber;//电话号码
    private String headphoto;//头像

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createdate;//注册时间

    public Unituser() {
    }

    public Unituser(String unitUserid, String unitUsername, String password, String email, String phonenumber, String headphoto, Date createdate) {
        UnitUserid = unitUserid;
        UnitUsername = unitUsername;
        this.password = password;
        this.email = email;
        this.phonenumber = phonenumber;
        this.headphoto = headphoto;
        this.createdate = createdate;
    }

    public String getUnitUserid() {
        return UnitUserid;
    }
    @JsonProperty(value = "UnitUserid")
    public void setUnitUserid(String unitUserid) {
        UnitUserid = unitUserid;
    }

    public String getUnitUsername() {
        return UnitUsername;
    }

    @JsonProperty(value = "UnitUsername")
    public void setUnitUsername(String unitUsername) {
        UnitUsername = unitUsername;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        return "Unituser{" +
                "UnitUserid='" + UnitUserid + '\'' +
                ", UnitUsername='" + UnitUsername + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", headphoto='" + headphoto + '\'' +
                ", createdate=" + createdate +
                '}';
    }
}
