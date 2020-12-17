package com.darksoul.service.impl;

import com.darksoul.Entity.personaluser;
import com.darksoul.mapper.personaluserMapper;
import com.darksoul.service.personalUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class personalUserServiceimpl implements personalUserService {

    @Autowired
    private personaluserMapper personaluserMapper1;

    //用户信息查询
    @Override
    public List<personaluser> query() {
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
    public personaluser querypersonbyid(Integer id){
        return personaluserMapper1.QueryAllUserbyid(id);
    }
}
