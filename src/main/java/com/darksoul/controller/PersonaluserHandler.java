package com.darksoul.controller;

import com.darksoul.Entity.Personaluser;
import com.darksoul.service.PersonalUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/person")
public class PersonaluserHandler {
    @Autowired
    private PersonalUserService personalUserService1;

    @RequestMapping("/finduser")
    @ResponseBody
    public List<Personaluser> getuser(){
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

    //通过id查询用户登录信息表
    @RequestMapping("/finduserbyid/{userid}")
    @ResponseBody
    public Personaluser getuserbyid(@PathVariable ("userid") Integer id){
        return personalUserService1.querypersonbyid(id);
    }

//    通过phone查找用户id
    @RequestMapping("/getuseridbyphonenumber/{phonenumber}")
    @ResponseBody
    public Personaluser getuseridbyphonenumber(@PathVariable("phonenumber") String phonenumber){
        return personalUserService1.getUseridbyphonenumber(phonenumber);
    }
}