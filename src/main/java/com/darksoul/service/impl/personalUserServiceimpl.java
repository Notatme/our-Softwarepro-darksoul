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

@Override
    public List<personaluser> query(){
        return personaluserMapper1.QueryAllUser();
    }

}
