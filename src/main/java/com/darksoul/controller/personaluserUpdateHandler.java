package com.darksoul.controller;

import com.darksoul.Entity.*;
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

    //更新Personal_basic_message表的信息
    @RequestMapping(value="/personalUpdate_basic_message",method={RequestMethod.POST})
    @ResponseBody
    public int Updatepersonal_introduceman(@RequestBody Personal_basic_message personal_basic_message){

        if((personalUsermessageUpdateService.PersonalUpdate_basic_message_service(personal_basic_message))==1) {

            return 1;
        }

        System.out.println(personal_basic_message);
        return 0;

    }


    //更新Personal_education表的信息
    @RequestMapping(value="/personal_Update_education",method={RequestMethod.POST})
    @ResponseBody
    public int Updatepersonal_introduceman(@RequestBody Personal_education personal_education){

        if((personalUsermessageUpdateService.Personal_Update_education_service(personal_education))==1) {

            return 1;
        }

        System.out.println(personal_education);
        return 0;

    }


    //更新Personal_major_experience表的信息
    @RequestMapping(value="/personal_Update_major_experience",method={RequestMethod.POST})
    @ResponseBody
    public int Updatepersonal_introduceman(@RequestBody Personal_major_experience personal_major_experience){

        if((personalUsermessageUpdateService.Personal_Update_major_experience_service(personal_major_experience))==1) {

            return 1;
        }

        System.out.println(personal_major_experience);
        return 0;

    }

    //更新Personal_occupational_qualification表的信息
    @RequestMapping(value="/personal_Update_occupational_qualification",method={RequestMethod.POST})
    @ResponseBody
    public int Updatepersonal_introduceman(@RequestBody Personal_occupational_qualification personal_occupational_qualification){

        if((personalUsermessageUpdateService.Personal_Update_occupational_qualification_service(personal_occupational_qualification))==1) {

            return 1;
        }

        System.out.println(personal_occupational_qualification);
        return 0;

    }

    //更新Personal_paper_patents表的信息
    @RequestMapping(value="/personal_Update_paper_patents",method={RequestMethod.POST})
    @ResponseBody
    public int Updatepersonal_introduceman(@RequestBody Personal_paper_patents personal_paper_patents){

        if((personalUsermessageUpdateService.Personal_Update_paper_patents_service(personal_paper_patents))==1) {

            return 1;
        }

        System.out.println(personal_paper_patents);
        return 0;

    }


    //更新Personal_performance_achievement表的信息
    @RequestMapping(value="/personal_Update_performance_achievement",method={RequestMethod.POST})
    @ResponseBody
    public int Updatepersonal(@RequestBody Personal_performance_achievement personal_performance_achievement){

        if((personalUsermessageUpdateService.Personal_Update_performance_achievement_service(personal_performance_achievement))==1) {

            return 1;
        }

        System.out.println(personal_performance_achievement);
        return 0;

    }

    //更新Personal_performance_awards表的信息
    @RequestMapping(value="/personal_Update_performance_awards",method={RequestMethod.POST})
    @ResponseBody
    public int Updatepersonal(@RequestBody Personal_performance_awards personal_performance_awards){

        if((personalUsermessageUpdateService.Personal_Update_performance_awards_service(personal_performance_awards))==1) {

            return 1;
        }

        System.out.println(personal_performance_awards);
        return 0;

    }


    //更新Personal_performance_patents表的信息
    @RequestMapping(value="/personal_Update_performance_patents",method={RequestMethod.POST})
    @ResponseBody
    public int Updatepersonal(@RequestBody Personal_performance_patents personal_performance_patents){

        if((personalUsermessageUpdateService.Personal_Update_performance_patents_service(personal_performance_patents))==1) {

            return 1;
        }

        System.out.println(personal_performance_patents);
        return 0;

    }

    //更新Personal_reviewall表的信息
    @RequestMapping(value="/personal_Update_reviewall",method={RequestMethod.POST})
    @ResponseBody
    public int Updatepersonal(@RequestBody Personal_reviewall personal_reviewall){

        if((personalUsermessageUpdateService.Personal_Update_reviewall_service(personal_reviewall))==1) {

            return 1;
        }

        System.out.println(personal_reviewall);
        return 0;

    }

    //更新Personal_worksummary表的信息
    @RequestMapping(value="/personal_Update_worksummary",method={RequestMethod.POST})
    @ResponseBody
    public int Updatepersonal(@RequestBody Personal_worksummary personal_worksummary){

        if((personalUsermessageUpdateService.Personal_Update_worksummary_service(personal_worksummary))==1) {

            return 1;
        }

        System.out.println(personal_worksummary);
        return 0;

    }

    //更新Personaluser表的信息，实现用户的忘记密码，修改用户信息
    @RequestMapping(value="/personal_Update_Personaluser",method={RequestMethod.POST})
    @ResponseBody
    public int Updatepersonal(@RequestBody Personaluser personaluser){

        if((personalUsermessageUpdateService.Personal_Update_Personaluser_service(personaluser))==1) {

            return 1;
        }

        System.out.println(personaluser);
        return 0;

    }

}
