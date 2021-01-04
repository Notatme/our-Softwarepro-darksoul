package com.darksoul.controller;

import com.darksoul.Entity.*;
//import com.darksoul.Entity.personal_introduceman;
import com.darksoul.mapper.PersonalusermessageAddMapper;
import com.darksoul.service.personalUsermessageAddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

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

    //增加用户Personal_education表的信息
    @RequestMapping(value="/personalAdd_education_add",method={RequestMethod.POST})
    @ResponseBody
    public int Addpersonal_others(@RequestBody Personal_education personal_education){

        if((personalUsermessageAddService1.PersonalAdd_education_add_service(personal_education))==1) {

            return 1;
        }

        System.out.println(personal_education);
        return 0;

    }

    //增加用户Personal_major_experience表的信息
    @RequestMapping(value="/personalAdd_major_experience_add",method={RequestMethod.POST})
    @ResponseBody
    public int Addpersonal_others(@RequestBody Personal_major_experience personal_major_experience){

        if((personalUsermessageAddService1.personalAdd_major_experience_add_service(personal_major_experience))==1) {

            return 1;
        }

        System.out.println(personal_major_experience);
        return 0;

    }


    //增加用户Personal_occupational_qualification表的信息
    @RequestMapping(value="/personalAdd_occupational_qualification_add",method={RequestMethod.POST})
    @ResponseBody
    public int Addpersonal_others(@RequestBody Personal_occupational_qualification personal_occupational_qualification){

        if((personalUsermessageAddService1.PersonalAdd_occupational_qualification_add(personal_occupational_qualification))==1) {

            return 1;
        }

        System.out.println(personal_occupational_qualification);
        return 0;

    }


    //增加用户Personal_paper_patents表的信息
    @RequestMapping(value="/personalAdd_paper_patents_add",method={RequestMethod.POST})
    @ResponseBody
    public int Addpersonal_others(@RequestBody Personal_paper_patents personal_paper_patents){

        if((personalUsermessageAddService1.PersonalAdd_paper_patents_add_service(personal_paper_patents))==1) {

            return 1;
        }

        System.out.println(personal_paper_patents);
        return 0;

    }

    //增加用户Personal_performance_achievement表的信息
    @RequestMapping(value="/personalAdd_performance_achievement_add",method={RequestMethod.POST})
    @ResponseBody
    public int Addpersonal(@RequestBody Personal_performance_achievement personal_performance_achievement){

        if((personalUsermessageAddService1.PersonalAdd_performance_achievement_add_service(personal_performance_achievement))==1) {

            return 1;
        }

        System.out.println(personal_performance_achievement);
        return 0;

    }

    //增加用户Personal_performance_awards表的信息
    @RequestMapping(value="/personalAdd_performance_awards_add",method={RequestMethod.POST})
    @ResponseBody
    public int Addpersonal(@RequestBody Personal_performance_awards personal_performance_awards){

        if((personalUsermessageAddService1.PersonalAdd_performance_awards_add_service(personal_performance_awards))==1) {

            return 1;
        }

        System.out.println(personal_performance_awards);
        return 0;

    }

    //增加用户Personal_performance_patents表的信息
    @RequestMapping(value="/personalAdd_performance_patents_add",method={RequestMethod.POST})
    @ResponseBody
    public int Addpersonal(@RequestBody Personal_performance_patents personal_performance_patents){

        if((personalUsermessageAddService1.PersonalAdd_performance_patents_add_service(personal_performance_patents))==1) {

            return 1;
        }

        System.out.println(personal_performance_patents);
        return 0;

    }

    //增加用户Personal_reviewall表的信息
    @RequestMapping(value="/personalAdd_reviewall_add",method={RequestMethod.POST})
    @ResponseBody
    public int Addpersonal(@RequestBody Personal_reviewall personal_reviewall){

        if((personalUsermessageAddService1.PersonalAdd_reviewall_add_service(personal_reviewall))==1) {

            return 1;
        }

        System.out.println(personal_reviewall);
        return 0;

    }

    //增加用户Personal_worksummary表的信息
    @RequestMapping(value="/personalAdd_worksummary_add",method={RequestMethod.POST})
    @ResponseBody
    public int Addpersonal(@RequestBody Personal_worksummary personal_worksummary){

        if((personalUsermessageAddService1.PersonalAdd_worksummary_add_service(personal_worksummary))==1) {

            return 1;
        }

        System.out.println(personal_worksummary);
        return 0;

    }


    //增加用户Personaluser表的信息，实现用户注册
    @RequestMapping(value="/personalAdd_Personaluser_add",method={RequestMethod.POST})
    @ResponseBody
    public int Addpersonal(@RequestBody Personaluser personaluser){

        String userid=null;
        Boolean flag=true;
        Personaluser p =null;
        while(flag) {
            userid = UUID.randomUUID().toString().replace("-", "").substring(0, 6).toUpperCase();          //生成6位不重复的id
            p= personalUsermessageAddService1.findUniuserid_service(userid);
            if(StringUtils.isEmpty(p)){
                personaluser.setPersonalUserid(userid);
                break;
            }
        }
        System.out.println(personaluser);

        if((personalUsermessageAddService1.PersonalAdd_Personaluser_add_service(personaluser))==1) {

            return 1;
        }

        System.out.println(personaluser);
        return 0;

    }



}
