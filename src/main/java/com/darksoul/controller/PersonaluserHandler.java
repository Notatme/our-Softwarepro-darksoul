package com.darksoul.controller;

import com.darksoul.Entity.Personal_introduceman;
import com.darksoul.Entity.Personaluser;
//import com.darksoul.Entity.personal_introduceman;
//import com.darksoul.Entity.personaluser;
import com.darksoul.service.PersonalUserService;
//import com.darksoul.service.personalUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/person")
public class PersonaluserHandler {
    @Autowired
    private PersonalUserService personalUserService1;

    @RequestMapping("/finduser")
    @ResponseBody
    public List<Personaluser> getuser(){
        return personalUserService1.query();
    }

    //用户登录的接口，仅仅通过url传递数值，实现用户的登录验证
    //http://localhost:8081/person/personaluserlogin?userphonenumber=12345678901&userpassword=123456

    @RequestMapping("/personaluserlogin")
    @ResponseBody
    public Boolean personaluserlogin(@RequestParam(required = true) String userphonenumber, @RequestParam(required = true) String userpassword){
       if( personalUserService1.userlogin(userphonenumber,userpassword)==true)
       {
           System.out.println("验证成功辣！");
           return true;

       }
    return false;
    }


    @RequestMapping("/personaluserchangepassword")
    @ResponseBody
    public int personaluserchangepassword(@RequestParam(required = true) String PersonalUserid, @RequestParam(required = true) String password){
        if( personalUserService1.personaluserchangepassword_service(PersonalUserid,password)==1)
        {
            System.out.println("验证成功辣！");
            return 1;

        }
        return 0;
    }

//    通过手机号查询用户表内的评审id
    @RequestMapping("/personalusergetuseridbyphonenumber")
    @ResponseBody
     public String  Getuseridbyphonenumber(@RequestParam("phonenumber")String phonenumber){
        return personalUserService1.getUseridbyphonenumber(phonenumber);
    }



    //通过id查询用户登录信息表
    @RequestMapping("/finduserbyid")
    @ResponseBody
    public Personaluser getuserbyid(@RequestParam("PersonalUserid") String PersonalUserid){
        return personalUserService1.querypersonbyid(PersonalUserid);
    }

}
