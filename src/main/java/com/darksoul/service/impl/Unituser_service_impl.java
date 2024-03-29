package com.darksoul.service.impl;

import com.darksoul.Entity.Personal_reviewall;
import com.darksoul.Entity.Unituser;
import com.darksoul.mapper.UnituserMapper;
import com.darksoul.service.Unituser_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<Personal_reviewall> Getselectreviewallbyphonenumber(String phonenumber) {
        return unituserMapper.Getselectreviewallbyphonenumber(phonenumber);
    }

    @Override
    public Unituser GetselectUnitusermessage(String phonenumber) {
        return unituserMapper.GetselectUnitusermessage(phonenumber);
    }

    @Override
    public String GetselectUnitid(String phonenumber) {
        return unituserMapper.GetselectUnitid(phonenumber);
    }

    @Override
    public Unituser findUniusernumberexit_service(String phonenumber) {
        return unituserMapper.findUniusernumberexit(phonenumber);
    }

    @Override
    public int changeuserstate_service(String personalUserid, String personalreviewID, String reviewstate) {
        return unituserMapper.changeuserstate(personalUserid,personalreviewID,reviewstate);
    }

    @Override
    public int changeheadpicture_service(String unitUserid, String headphoto) {
        return unituserMapper.changeheadpicture(unitUserid,headphoto);
    }

}
