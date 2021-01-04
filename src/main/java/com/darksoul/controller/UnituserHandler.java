package com.darksoul.controller;

import com.darksoul.Entity.Personal_reviewall;
import com.darksoul.Entity.Unituser;
import com.darksoul.service.Unituser_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/Unituser")
public class UnituserHandler {

    @Autowired
    private Unituser_Service unituser_service;
    //增加用户Unituser表的信息，实现单位用户注册
    @RequestMapping(value="/Unituser_add",method={RequestMethod.POST})
    @ResponseBody
    public String AddUnituser(@RequestBody Unituser unituser){

       // unituser.setUnitUserid();
        //System.out.println(getAccountIdByUUId());
        String userid=null;
        Boolean flag=true;
        Boolean flag1=true;
        Unituser u =null;
        String u1=null;
        while (flag1){
            System.out.println(unituser);
            u1=unituser_service.GetselectUnitid(unituser.getPhonenumber());
            if(StringUtils.isEmpty(u1)){
                break;
            }

            else {return "200";}
        }
        while(flag) {
            userid = UUID.randomUUID().toString().replace("-", "").substring(0, 6).toUpperCase();          //生成6位不重复的id
          u= unituser_service.findUniuserid_service(userid);

          if(StringUtils.isEmpty(u)){
              unituser.setUnitUserid(userid);
              break;
            }
        }

        System.out.println(unituser);
        if((unituser_service.Unituser_add_serviceimpl(unituser))==1) {

            return "1";
        }

       // System.out.println(unituser);
        return "0";

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


    @RequestMapping("/unituserlogin")
    @ResponseBody
    public Boolean personaluserlogin(@RequestParam(required = true) String phonenumber, @RequestParam(required = true) String password){
        if( unituser_service.userlogin(phonenumber,password)==true)
        {
            System.out.println("验证成功辣！");
            return true;

        }
        return false;
    }

    public static String getAccountIdByUUId() {
        int machineId = 1;//最大支持1-9个集群机器部署
        int hashCodeV = UUID.randomUUID().toString().hashCode();
        if(hashCodeV < 0) {//有可能是负数
            hashCodeV = - hashCodeV;
        }
        return machineId + String.format("%015d", hashCodeV);
    }


    @RequestMapping("/selectreviewallbyphonenumber")
    @ResponseBody
    public List<Personal_reviewall> Getselectreviewallbyphonenumber(@RequestParam("phonenumber") String phonenumber){
        return unituser_service.Getselectreviewallbyphonenumber(phonenumber);
    }

    //   通过手机号查询用户个人信息
    @RequestMapping("/selectUnitusermessage")
    @ResponseBody
    public Unituser GetselectUnitusermessage(@RequestParam("phonenumber") String phonenumber){
        return unituser_service.GetselectUnitusermessage(phonenumber);
    }

    //通过手机号码查询单位用户的id
    @RequestMapping("/selectUnituserid")
    @ResponseBody
    public String GetselectUnituserid(@RequestParam("phonenumber") String phonenumber){
        return unituser_service.GetselectUnitid(phonenumber);
    }

}
