package com.darksoul.controller;

import com.darksoul.Entity.personal_reviewall;
import com.darksoul.service.personalReviewallservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reviewall")
public class personalreviewallHandler {
    @Autowired
    private personalReviewallservice personalReviewallservice;
//http://localhost:8081/person/personaluserlogin?userphonenumber=12345678901&userpassword=123456

//    通过id查询评审总表
    @RequestMapping("/findreviewallbyid/{userid}")
    @ResponseBody
    public personal_reviewall getpersonal_reviewallbyid(@PathVariable("userid")Integer id){
        return personalReviewallservice.querypersonalReviewallbyid(id);
    }

//    通过登录的手机号查询评审总表
    @RequestMapping("/findreviewallbyphone/{Phonenumber}")
    @ResponseBody
    public  personal_reviewall getpersonal_reviewallbyPhonenumber(@PathVariable("Phonenumber")String Phonenumber){
        return personalReviewallservice.querypersonalReviewallbyPhonenumber(Phonenumber);
    }
}
