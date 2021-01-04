package com.darksoul.service;

import com.darksoul.Entity.Unituser;

public interface Unituser_Service {

    Unituser findUniuserid_service(String userid);

    int Unituser_add_serviceimpl(Unituser unituser);

    int Unituser_Update_service(Unituser unituser);

    boolean userlogin(String phonenumber, String password);
}
