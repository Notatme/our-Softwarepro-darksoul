package com.darksoul.service.impl;

import com.darksoul.Entity.Personaluser;
import com.darksoul.mapper.PersonaluserMapper;
import com.darksoul.service.PersonalUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalUserServiceimpl implements PersonalUserService {

    @Autowired
    private PersonaluserMapper personaluserMapper1;

    //用户信息查询
    @Override
    public List<Personaluser> query() {
        return personaluserMapper1.QueryAllUser();
    }

    //个人用户登录验证
    @Override
    public Boolean userlogin(String userphone, String userpassword) {
        if (personaluserMapper1.GetUserpwdbyphonenumber(userphone).equals(userpassword)) {
            return true;
        }
        return false;
    }

    //通过id查询
    @Override
    public Personaluser querypersonbyid(String PersonalUserid){
        return personaluserMapper1.QueryAllUserbyid(PersonalUserid);
    }

//    通过phonenumber查询到用户id
    @Override
    public String getUseridbyphonenumber(String phonenumber){
        return personaluserMapper1.GetUseridbyphonenumber(phonenumber);
    }

    @Override
    public int personaluserchangepassword_service(String PersonalUserid, String password) {
        return personaluserMapper1.personaluserchangepassword(PersonalUserid,password);
    }


}
