package com.darksoul.controller;

import com.darksoul.service.Personaluserdeleteservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personaluserdelete")
public class PersonaluserdeleteHandler {
    @Autowired
    private Personaluserdeleteservice personaluserdeleteservice;

    //删除个人基本信息表。
    @RequestMapping("/deletePersonalbasicmessage")
    public void DeletePersonal_basic_message(@RequestParam("PersonalUserid") String PersonalUserid, @RequestParam("PersonalreviewID") String PersonalreviewID){
        personaluserdeleteservice.DeletePersonal_basic_message(PersonalUserid,PersonalreviewID);
    }
    //删除个人学历情况表
    @RequestMapping("/deletePersonaleducation")
    public void DeletePersonal_education(@RequestParam("PersonalUserid") String PersonalUserid, @RequestParam("PersonalreviewID") String PersonalreviewID){
        personaluserdeleteservice.DeletePersonal_education(PersonalUserid,PersonalreviewID);
    }

//   删除个人主要经历表
    @RequestMapping("/deletePersonalmajorexperience")
    public void DeletePersonal_major_experience(@RequestParam("PersonalUserid") String PersonalUserid, @RequestParam("PersonalreviewID") String PersonalreviewID){
        personaluserdeleteservice.DeletePersonal_major_experience(PersonalUserid,PersonalreviewID);
    }
//    删除个人人才引进相关材料表
    @RequestMapping("/deletePersonalintroduceman")
    public void DeletePersonal_introduceman(@RequestParam("PersonalUserid") String PersonalUserid, @RequestParam("PersonalreviewID") String PersonalreviewID){
        personaluserdeleteservice.DeletePersonal_introduceman(PersonalUserid,PersonalreviewID);
    }
//删除个人论文著作表
    @RequestMapping("/deletePersonalpaperpatents")
    public void DeletePersonal_paper_patents(@RequestParam("PersonalUserid") String PersonalUserid, @RequestParam("PersonalreviewID") String PersonalreviewID){
        personaluserdeleteservice.DeletePersonal_paper_patents(PersonalUserid,PersonalreviewID);
    }
// 删除个人业绩成果表
    @RequestMapping("/deletePersonalperformanceachievement")
    public void DeletePersonal_performance_achievement(@RequestParam("PersonalUserid") String PersonalUserid, @RequestParam("PersonalreviewID") String PersonalreviewID){
        personaluserdeleteservice.DeletePersonal_performance_achievement(PersonalUserid,PersonalreviewID);
    }
    // 删除个人业绩奖项表
    @RequestMapping("/deletePersonalperformanceawards")
    public void DeletePersonal_performance_awards(@RequestParam("PersonalUserid") String PersonalUserid, @RequestParam("PersonalreviewID") String PersonalreviewID){
        personaluserdeleteservice.DeletePersonal_performance_awards(PersonalUserid,PersonalreviewID);
    }

    // 删除个人业绩专利表
    @RequestMapping("/deletePersonalperformancepatents")
    public void DeletePersonal_performance_patents(@RequestParam("PersonalUserid") String PersonalUserid, @RequestParam("PersonalreviewID") String PersonalreviewID){
        personaluserdeleteservice.DeletePersonal_performance_patents(PersonalUserid,PersonalreviewID);
    }

    // 删除个人从业或执业（职业）资格表
    @RequestMapping("/deletePersonaloccupationalqualification")
    public void DeletePersonal_occupational_qualification(@RequestParam("PersonalUserid") String PersonalUserid, @RequestParam("PersonalreviewID") String PersonalreviewID){
        personaluserdeleteservice.DeletePersonal_occupational_qualification(PersonalUserid,PersonalreviewID);
    }

//  个人国（境）外工作或研究材料表
    @RequestMapping("/deletePersonalresearchmaterials")
    public void DeletePersonal_research_materials(@RequestParam("PersonalUserid") String PersonalUserid, @RequestParam("PersonalreviewID") String PersonalreviewID){
        personaluserdeleteservice.DeletePersonal_research_materials(PersonalUserid,PersonalreviewID);
    }
//个人工作总结表
    @RequestMapping("/deletePersonalworksummary")
    public void DeletePersonal_worksummary(@RequestParam("PersonalUserid") String PersonalUserid, @RequestParam("PersonalreviewID") String PersonalreviewID){
        personaluserdeleteservice.DeletePersonal_worksummary(PersonalUserid,PersonalreviewID);
    }

//个人其他材料表
    @RequestMapping("/deletePersonalothers")
    public void DeletePersonal_others(@RequestParam("PersonalUserid") String PersonalUserid, @RequestParam("PersonalreviewID") String PersonalreviewID){
        personaluserdeleteservice.DeletePersonal_others(PersonalUserid,PersonalreviewID);
    }
}
