package com.darksoul.service;

import com.darksoul.Entity.personaluser;

import java.util.List;

public interface personalUserService{

    List<personaluser> query();

    //用户密码验证
    Boolean userlogin(String userphone,String userpassword);
}
