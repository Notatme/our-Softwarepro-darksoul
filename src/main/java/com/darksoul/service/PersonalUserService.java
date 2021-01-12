package com.darksoul.service;

import com.darksoul.Entity.Personaluser;

import java.util.List;

public interface PersonalUserService {

    List<Personaluser> query();

    //用户密码验证
    Boolean userlogin(String userphone,String userpassword);

    //通过id查询用户登录信息
    Personaluser querypersonbyid(String PersonalUserid);

    //    通过phonenumber查询到用户id
    public String getUseridbyphonenumber(String phonenumber);

    int personaluserchangepassword_service(String PersonalUserid, String password);

    int changeheadpicture_service(String personalUserid, String headphoto);
}
