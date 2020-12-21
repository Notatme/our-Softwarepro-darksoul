package com.darksoul.service.impl;

import com.darksoul.Entity.*;
import com.darksoul.mapper.PersonalReviewselectMapper;
import com.darksoul.service.PersonalReviewselectservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalReviewselectserviceimpl implements PersonalReviewselectservice {
    @Autowired
    private PersonalReviewselectMapper personalReviewselectMapper;

//    个人基本信息表查询
    @Override
    public Personal_basic_message GetPersonal_basic_message(String PersonalUserid,String PersonalreviewID) {
        return personalReviewselectMapper.GetPersonal_basic_messageMapper(PersonalUserid,PersonalreviewID);
    }
// 个人学历情况表查询
    @Override
    public Personal_education GetPersonal_education(String PersonalUserid, String PersonalreviewID) {
        return personalReviewselectMapper.GetPersonal_education(PersonalUserid,PersonalreviewID);
    }
    //个人主要经历表查询
    @Override
    public Personal_major_experience GetPersonal_major_experience(String PersonalUserid, String PersonalreviewID) {
        return personalReviewselectMapper.GetPersonal_major_experience(PersonalUserid,PersonalreviewID);
    }
// 个人人才引进相关材料表查询
    @Override
    public Personal_introduceman GetPersonal_introduceman(String PersonalUserid, String PersonalreviewID) {
        return personalReviewselectMapper.GetPersonal_introduceman(PersonalUserid,PersonalreviewID);
    }
    // 个人论文著作表（personal_paper_patents
    @Override
    public Personal_paper_patents GetPersonal_paper_patents(String PersonalUserid, String PersonalreviewID) {
        return personalReviewselectMapper.GetPersonal_paper_patents(PersonalUserid,PersonalreviewID);
    }
    // 个人业绩成果表personal_performance_achievement
    @Override
    public Personal_performance_achievement GetPersonal_performance_achievement(String PersonalUserid, String PersonalreviewID) {
        return personalReviewselectMapper.GetPersonal_performance_achievement(PersonalUserid,PersonalreviewID);
    }

    //	个人业绩奖项表personal_performance_awards
    @Override
    public Personal_performance_awards GetPersonal_performance_awards(String PersonalUserid, String PersonalreviewID) {
        return personalReviewselectMapper.GetPersonal_performance_awards(PersonalUserid,PersonalreviewID);
    }
    //	个人业绩专利表（personal_performance_patents）
    @Override
    public Personal_performance_patents GetPersonal_performance_patents(String PersonalUserid, String PersonalreviewID) {
        return personalReviewselectMapper.GetPersonal_performance_patents(PersonalUserid,PersonalreviewID);
    }
//	个人从业或执业（职业）资格表（personal_occupational_qualification）
    @Override
    public Personal_occupational_qualification GetPersonal_occupational_qualification(String personalUserid, String personalreviewID) {
        return  personalReviewselectMapper.GetPersonal_occupational_qualification(personalUserid,personalreviewID);
    }
    //   个人国（境）外工作或研究材料表（personal_research_materials）
    @Override
    public Personal_research_materials GetPersonal_research_materials(String personalUserid, String personalreviewID) {
        return  personalReviewselectMapper.GetPersonal_research_materials(personalUserid,personalreviewID);
    }
    //个人工作总结表personal_worksummary
    @Override
    public Personal_worksummary GetPersonal_worksummary(String personalUserid, String personalreviewID) {
        return personalReviewselectMapper.GetPersonal_worksummary(personalUserid,personalreviewID);
    }
//    4.3.15	个人其他材料表（personal_others）
    @Override
    public Personal_others GetPersonal_others(String personalUserid, String personalreviewID) {
        return personalReviewselectMapper.GetPersonal_others(personalUserid,personalreviewID);
    }

}
