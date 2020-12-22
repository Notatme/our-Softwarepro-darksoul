package com.darksoul.controller;

import com.darksoul.Entity.Personal_basic_message;
import com.darksoul.Entity.Personal_introduceman;
//import com.darksoul.Entity.personal_introduceman;
import com.darksoul.Entity.Personal_others;
import com.darksoul.Entity.Personal_research_materials;
import com.darksoul.mapper.PersonalusermessageAddMapper;
import com.darksoul.service.personalUsermessageAddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/personAdd")
public class personaluserAddHandler {

    @Autowired
    private personalUsermessageAddService personalUsermessageAddService1;


    //个人用户信息personal_introduceman表增加
    @RequestMapping(value="/personalAdd_introduceman",method={RequestMethod.POST})
    @ResponseBody
    public int Addpersonal_introduceman(@RequestBody Personal_introduceman personal_introduceman1){


        personalUsermessageAddService1.PersonalusermessageAddMassage(personal_introduceman1);
        System.out.println(personal_introduceman1);
        return 1;
    }


    //增加用户其他表信息
    @RequestMapping(value="/personalAdd_others",method={RequestMethod.POST})
    @ResponseBody
    public int Addpersonal_others(@RequestBody Personal_others personal_others){

        if((personalUsermessageAddService1.PerPersonalusermessageAddothers(personal_others))==1) {

           // return personalUsermessageAddService1.PerPersonalusermessageAddothers(personal_others);
            return 1;
        }
        return 0;

    }


    //增加用户Personal_research_materials表的信息
    @RequestMapping(value="/personalAdd_research_materials_add",method={RequestMethod.POST})
    @ResponseBody
    public int Addpersonal_others(@RequestBody Personal_research_materials personal_research_materials){

        if((personalUsermessageAddService1.PerPersonalusermessageAdd_research_materials(personal_research_materials))==1) {

        return 1;
       }





        //System.out.println(personal_research_materials);
        return 0;

    }


    /*
测试使用json:
{
    "PersonalUserid":"22",
    "PersonalreviewID":"33",
    "unit":"4444",
    "unitlevel":"2323",
    "personalidentitynature":"2323",
    "reviewyear":111,
    "name":"xiaowea",
    "nameformer":"sdsd",
    "sex":"M",
    "nation":"china",
    "idnumber":"22",
    "birthday":"2020-12-23 22:00:59",
    "fillingtime":"2020-12-23 22:00:59",
    "startworktime":"2020-12-23 22:00:59",
    "workingyears":3,
    "reviewmeeting":"dsdsdsd",
    "wantprofessionseries":"dsdsd",
    "wantmajor":"dsdsdsd",
    "wantmajorstatus":"dsdsd",
    "executivefunction":"dsdsds",
    "executivefunctiontime":"2020-12-23 22:00:59",
    "executivefunctionexplatin":"dsdsd",
    "phone":"123456",
    "email":"123232323@qq.com",
    "fileorganizationname":"dsdsdsd",
    "politicsstatus":"123444444",
    "nativeplace":"asasass",
    "address":"guangdong",
    "idcardfront":"dsdsdsdsd",
    "idcardcontrary":"2222222",
    "manphoto":"asasasas"
}
* */
    //增加用户Personal_basic_message表的信息
    @RequestMapping(value="/personalAdd_basic_message_add",method={RequestMethod.POST})
    @ResponseBody
    public int Addpersonal_others(@RequestBody Personal_basic_message personal_basic_message){

        if((personalUsermessageAddService1.personal_basic_message_service(personal_basic_message))==1) {

            return 1;
        }

        System.out.println(personal_basic_message);
        return 0;

    }

}
