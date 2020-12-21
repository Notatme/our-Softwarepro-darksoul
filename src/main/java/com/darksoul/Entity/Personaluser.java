package com.darksoul.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personaluser {
//    个人用户表
    private String PersonalUserid;//个人用户ID
    private String PersonalUsername;//个人用户名
    private String password;//密码
    private String unitusername;//单位用户名
    private String email;//邮箱
    private String phonenumber;//手机号码
    private String headphoto;//头像
    private Date createdate;//注册时间

}
