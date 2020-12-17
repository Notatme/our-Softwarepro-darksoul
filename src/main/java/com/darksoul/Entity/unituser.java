package com.darksoul.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class unituser {
//    单位用户表
    private String UnitUserid;//单位用户ID
    private String UnitUsername;//单位用户名
    private String Password;//密码
    private String Email;//邮箱
    private String Phonenumber;//电话号码
    private String Headphoto;//头像
    private Date Createdate;//注册时间

}
