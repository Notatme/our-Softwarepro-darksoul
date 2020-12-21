package com.darksoul.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Unituser {
//    单位用户表
    private String UnitUserid;//单位用户ID
    private String UnitUsername;//单位用户名
    private String password;//密码
    private String email;//邮箱
    private String phonenumber;//电话号码
    private String headphoto;//头像
    private Date createdate;//注册时间

}
