package com.darksoul.controller;

import com.darksoul.Entity.Personal_performance_achievement;
import com.darksoul.Entity.Personal_reviewall;
import com.darksoul.service.PersonalReviewallservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reviewall")
public class PersonalreviewallHandler {
    @Autowired
    private PersonalReviewallservice personalReviewallservice;
//http://localhost:8081/person/personaluserlogin?userphonenumber=12345678901&userpassword=123456

//    通过id查询评审总表
    @RequestMapping("/findreviewallbyid/{userid}")
    @ResponseBody
    public Personal_reviewall getpersonal_reviewallbyid(@PathVariable("userid")Integer id){
        return personalReviewallservice.querypersonalReviewallbyid(id);
    }

//    通过登录的手机号查询评审总表
    @RequestMapping("/findreviewallbyphone/{Phonenumber}")
    @ResponseBody
    public Personal_reviewall getpersonal_reviewallbyPhonenumber(@PathVariable("Phonenumber")String Phonenumber){
        return personalReviewallservice.querypersonalReviewallbyPhonenumber(Phonenumber);
    }
    //在评审总表界面将其中一条评审表删除。
    @RequestMapping("/deletereviewallbyid")
    public void DeletePersonal_reviewall(@RequestParam("PersonalUserid") String PersonalUserid, @RequestParam("PersonalreviewID") String PersonalreviewID){
         personalReviewallservice.DeletePersonal_reviewall(PersonalUserid,PersonalreviewID);

    }
}
