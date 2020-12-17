package com.darksoul.controller;

import com.darksoul.Entity.personaluser;
import com.darksoul.service.personalUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/person")
public class personaluserHandler {
    @Autowired
    private personalUserService personalUserService1;

    @RequestMapping("/finduser")
    @ResponseBody
    public List<personaluser> getuser(){
        return personalUserService1.query();
    }

    //用户登录的接口

    //http://localhost:8081/person/personaluserlogin?userphonenumber=12345678901&userpassword=123456
    @RequestMapping("/personaluserlogin")
    public Boolean personaluserlogin(@RequestParam("userphonenumber") String phone, @RequestParam("userpassword") String password){
       if( personalUserService1.userlogin(phone,password)==true)
       {
           System.out.println("验证成功辣！");
           return true;

       }
    return false;
    }

}
