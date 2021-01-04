package com.darksoul.service.impl;

import com.darksoul.Entity.Unituser;
import com.darksoul.mapper.UnituserMapper;
import com.darksoul.service.Unituser_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Unituser_service_impl implements Unituser_Service {

    @Autowired
    private UnituserMapper unituserMapper;

    @Override
    public Unituser findUniuserid_service(String userid) {
        return unituserMapper.findUniuserid(userid);
    }

    @Override
    public int Unituser_add_serviceimpl(Unituser unituser) {
        return unituserMapper.Unituser_add(unituser);
    }

    @Override
    public int Unituser_Update_service(Unituser unituser) {
        return unituserMapper.Unituser_Update(unituser);
    }

    //登录验证
    @Override
    public boolean userlogin(String phonenumber, String password) {
        if (unituserMapper.GetUserpwdbyphonenumber(phonenumber).equals(password)) {
            return true;
        }
        return false;
    }
}
