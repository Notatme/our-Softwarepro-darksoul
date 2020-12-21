package com.darksoul.controller;

import com.darksoul.Entity.*;
import com.darksoul.service.PersonalReviewselectservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/PersonalReviewselect")
public class PersonalReviewselectHandler {

    @Autowired
    private PersonalReviewselectservice personalReviewselectservice;

    //http://localhost:8081/PersonalReviewselect/Personal_basic_message?PersonalUserid=1&PersonalreviewID=1
//    个人基本信息表查询
    @RequestMapping("/Personal_basic_message")
    public Personal_basic_message GetPersonal_basic_message(@RequestParam("PersonalUserid") String PersonalUserid,@RequestParam("PersonalreviewID") String PersonalreviewID){
        return personalReviewselectservice.GetPersonal_basic_message(PersonalUserid,PersonalreviewID);
    }
//    个人学历情况表查询
    @RequestMapping("/personal_education")
    public Personal_education GetPersonal_education(@RequestParam("PersonalUserid") String PersonalUserid, @RequestParam("PersonalreviewID") String PersonalreviewID){
        return personalReviewselectservice.GetPersonal_education(PersonalUserid,PersonalreviewID);
}

//个人主要经历表查询
    @RequestMapping("/personal_major_experience")
    public Personal_major_experience GetPersonal_major_experience(@RequestParam("PersonalUserid") String PersonalUserid,@RequestParam("PersonalreviewID") String PersonalreviewID){
        return personalReviewselectservice.GetPersonal_major_experience(PersonalUserid,PersonalreviewID);
    }

//  个人人才引进相关材料表查询
    @RequestMapping("/personal_introduceman")
    public Personal_introduceman GetPersonal_introduceman(@RequestParam("PersonalUserid") String PersonalUserid, @RequestParam("PersonalreviewID") String PersonalreviewID){
        return personalReviewselectservice.GetPersonal_introduceman(PersonalUserid,PersonalreviewID);
    }
// 个人论文著作表（personal_paper_patents
    @RequestMapping("/personal_paper_patents")
    public Personal_paper_patents GetPersonal_paper_patents(@RequestParam("PersonalUserid") String PersonalUserid, @RequestParam("PersonalreviewID") String PersonalreviewID){
        return personalReviewselectservice.GetPersonal_paper_patents(PersonalUserid,PersonalreviewID);
    }
// 个人业绩成果表personal_performance_achievement
    @RequestMapping("/personal_performance_achievement")
    public Personal_performance_achievement GetPersonal_performance_achievement(@RequestParam("PersonalUserid") String PersonalUserid, @RequestParam("PersonalreviewID") String PersonalreviewID){
        return personalReviewselectservice.GetPersonal_performance_achievement(PersonalUserid,PersonalreviewID);
    }
//	个人业绩奖项表personal_performance_awards
    @RequestMapping("/personal_performance_awards")
    public Personal_performance_awards GetPersonal_performance_awards(@RequestParam("PersonalUserid") String PersonalUserid, @RequestParam("PersonalreviewID") String PersonalreviewID){
        return personalReviewselectservice.GetPersonal_performance_awards(PersonalUserid,PersonalreviewID);
    }
//	个人业绩专利表（personal_performance_patents）
    @RequestMapping("/personal_performance_patents")
    public Personal_performance_patents GetPersonal_performance_patents(@RequestParam("PersonalUserid") String PersonalUserid, @RequestParam("PersonalreviewID") String PersonalreviewID){
        return personalReviewselectservice.GetPersonal_performance_patents(PersonalUserid,PersonalreviewID);
    }

//	个人从业或执业（职业）资格表（personal_occupational_qualification）
    @RequestMapping("/personal_occupational_qualification")
    public Personal_occupational_qualification GetPersonal_occupational_qualification(@RequestParam("PersonalUserid") String PersonalUserid, @RequestParam("PersonalreviewID") String PersonalreviewID){
        return personalReviewselectservice.GetPersonal_occupational_qualification(PersonalUserid,PersonalreviewID);
    }
//   个人国（境）外工作或研究材料表（personal_research_materials）
    @RequestMapping("/personal_research_materials")
    public Personal_research_materials GetPersonal_research_materials(@RequestParam("PersonalUserid") String PersonalUserid, @RequestParam("PersonalreviewID") String PersonalreviewID){
        return personalReviewselectservice.GetPersonal_research_materials(PersonalUserid,PersonalreviewID);
    }
//个人工作总结表personal_worksummary
    @RequestMapping("/personal_worksummary")
    public Personal_worksummary GetPersonal_worksummary(@RequestParam("PersonalUserid") String PersonalUserid, @RequestParam("PersonalreviewID") String PersonalreviewID){
        return personalReviewselectservice.GetPersonal_worksummary(PersonalUserid,PersonalreviewID);
    }

//    4.3.15	个人其他材料表（personal_others）
    @RequestMapping("/personal_others")
    public Personal_others GetPersonal_others(@RequestParam("PersonalUserid") String PersonalUserid, @RequestParam("PersonalreviewID") String PersonalreviewID){
        return personalReviewselectservice.GetPersonal_others(PersonalUserid,PersonalreviewID);
    }




    //    @RequestMapping("/personal_introduceman")
//    public Personal_introduceman INSERTpersonal_introduceman(){
//        return personalReviewselectservice
//    }
}
