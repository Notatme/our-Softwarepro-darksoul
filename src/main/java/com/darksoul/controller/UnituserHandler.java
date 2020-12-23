package com.darksoul.controller;

import com.darksoul.Entity.Unituser;
import com.darksoul.service.Unituser_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Unituser")
public class UnituserHandler {

    @Autowired
    private Unituser_Service unituser_service;
    //增加用户Unituser表的信息，实现单位用户注册
    @RequestMapping(value="/Unituser_add",method={RequestMethod.POST})
    @ResponseBody
    public int AddUnituser(@RequestBody Unituser unituser){

        if((unituser_service.Unituser_add_serviceimpl(unituser))==1) {

            return 1;
        }

        System.out.println(unituser);
        return 0;

    }

    //更新Unituser表的信息，实现忘记密码或者修改单位用户的信息
    @RequestMapping(value="/Unituser_Update",method={RequestMethod.POST})
    @ResponseBody
    public int UpdateUniuser(@RequestBody Unituser unituser){

        if((unituser_service.Unituser_Update_service(unituser))==1) {

            return 1;
        }

        System.out.println(unituser);
        return 0;

    }

}
