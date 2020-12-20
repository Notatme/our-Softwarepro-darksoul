package com.darksoul.controller;

import com.darksoul.Entity.Personal_introduceman;
import com.darksoul.Entity.Personal_others;
import com.darksoul.Entity.Personal_research_materials;
import com.darksoul.service.PersonalUsermessageUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/personalMessageUpdate")
public class personaluserUpdateHandler {

    @Autowired
    private PersonalUsermessageUpdateService personalUsermessageUpdateService;


    //更新personsl_others表的信息
    @RequestMapping(value="/personalUpdate_others",method={RequestMethod.POST})
    @ResponseBody
    public int Updatepersonal_others(@RequestBody Personal_others personal_others){

        if((personalUsermessageUpdateService.Personal_others_update_service(personal_others))==1) {

            System.out.println(personal_others);
            return 1;
        }
        return 0;

    }

    //更新personsl_introduceman表的信息
    @RequestMapping(value="/personalUpdate_introduceman",method={RequestMethod.POST})
    @ResponseBody
    public int Updatepersonal_introduceman(@RequestBody Personal_introduceman personal_introduceman){

        if((personalUsermessageUpdateService.Personal_introduceman_update_service(personal_introduceman))==1) {

            return 1;
        }

        System.out.println(personal_introduceman);
        return 0;

    }


    //更新personsl_introduceman表的信息
    @RequestMapping(value="/personalUpdate_research_materials",method={RequestMethod.POST})
    @ResponseBody
    public int Updatepersonal_introduceman(@RequestBody Personal_research_materials personal_research_materials){

        if((personalUsermessageUpdateService.Personal_research_materials_update_service(personal_research_materials))==1) {

            return 1;
        }

        System.out.println(personal_research_materials);
        return 0;

    }
}
