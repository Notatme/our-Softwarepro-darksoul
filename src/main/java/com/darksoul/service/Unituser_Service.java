package com.darksoul.service;

import com.darksoul.Entity.Personal_reviewall;
import com.darksoul.Entity.Unituser;

import java.util.List;

public interface Unituser_Service {

    Unituser findUniuserid_service(String userid);

    int Unituser_add_serviceimpl(Unituser unituser);

    int Unituser_Update_service(Unituser unituser);

    boolean userlogin(String phonenumber, String password);

    List<Personal_reviewall> Getselectreviewallbyphonenumber(String phonenumber);

    Unituser GetselectUnitusermessage(String phonenumber);
}
