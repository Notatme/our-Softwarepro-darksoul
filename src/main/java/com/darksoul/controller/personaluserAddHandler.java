package com.darksoul.controller;

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

       // personalUsermessageAddService1.PersonalusermessageAddMapper(personal_introduceman1);
//        System.out.println(personal_introduceman1.getPersonalUserid()+personal_introduceman1.getPersonalreviewID()+personal_introduceman1.getPersonalreviewID()+
//                personal_introduceman1.getMaterialsadjunct());
       // personalUsermessageAddService1.PersonalusermessageAddMassage(personal_introduceman1);

       // personalusermessageAddMapper.personal_messageadd(personal_introduceman1);
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

}
