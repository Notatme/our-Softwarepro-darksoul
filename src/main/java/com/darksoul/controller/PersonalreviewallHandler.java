package com.darksoul.controller;

import com.darksoul.Entity.Personal_performance_achievement;
import com.darksoul.Entity.Personal_reviewall;
import com.darksoul.service.PersonalReviewallservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
//    评审总表显示表内详情
    @RequestMapping("/selectreviewallbyid")
    public Personal_reviewall Getselectreviewall(@RequestParam("PersonalUserid") String PersonalUserid, @RequestParam("PersonalreviewID") String PersonalreviewID){
      return  personalReviewallservice.Getselectreviewall(PersonalUserid,PersonalreviewID);
    }

//   评审总表中如果使用子表查询
//    @RequestMapping("/selectreviewall")
//    public Personal_reviewall Getselectreviewalltest(@RequestParam("PersonalUserid") String PersonalUserid, @RequestParam("PersonalreviewID") String PersonalreviewID){
//        return  personalReviewallservice.Getselectreviewalltest(PersonalUserid,PersonalreviewID);
//    }
//
////    根据用户名查询找到的

//    单位用户通过模糊查询，输入个人用户名字查找总表信息
    @RequestMapping("/selectreviewallbyname")
    public List<Personal_reviewall> Getselectreviewallbyname(@RequestParam("PersonalUsername") String PersonalUsername){
        System.out.println(personalReviewallservice.Getselectreviewallbyname(PersonalUsername));
        return personalReviewallservice.Getselectreviewallbyname(PersonalUsername);

    }

}
