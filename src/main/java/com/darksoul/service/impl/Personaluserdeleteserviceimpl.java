package com.darksoul.service.impl;

import com.darksoul.mapper.PersonaluserdeleteMapper;
import com.darksoul.service.Personaluserdeleteservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Personaluserdeleteserviceimpl implements Personaluserdeleteservice {

    @Autowired
    private PersonaluserdeleteMapper personaluserdeleteMapper;

//    删除个人基本信息表
    @Override
    public void DeletePersonal_basic_message(String personalUserid, String personalreviewID) {
        personaluserdeleteMapper.DeletePersonal_reviewall(personalUserid,personalreviewID);
    }
    //删除个人学历情况表
    @Override
    public void DeletePersonal_education(String personalUserid, String personalreviewID) {
        personaluserdeleteMapper.DeletePersonal_education(personalUserid,personalreviewID);
    }

    //   删除个人主要经历表
    @Override
    public void DeletePersonal_major_experience(String personalUserid, String personalreviewID) {
        personaluserdeleteMapper.DeletePersonal_major_experience(personalUserid,personalreviewID);
    }
    //    删除个人人才引进相关材料表
    @Override
    public void DeletePersonal_introduceman(String personalUserid, String personalreviewID) {
        personaluserdeleteMapper.DeletePersonal_introduceman(personalUserid,personalreviewID);
    }
    //删除个人论文著作表
    @Override
    public void DeletePersonal_paper_patents(String personalUserid, String personalreviewID) {
        personaluserdeleteMapper.DeletePersonal_paper_patents(personalUserid,personalreviewID);
    }
    // 删除个人业绩成果表
    @Override
    public void DeletePersonal_performance_achievement(String personalUserid, String personalreviewID) {
        personaluserdeleteMapper.DeletePersonal_performance_achievement(personalUserid,personalreviewID);
    }
    // 删除个人业绩奖项表
    @Override
    public void DeletePersonal_performance_awards(String personalUserid, String personalreviewID) {
        personaluserdeleteMapper.DeletePersonal_performance_awards(personalUserid,personalreviewID);
    }
    // 删除个人业绩专利表
    @Override
    public void DeletePersonal_performance_patents(String personalUserid, String personalreviewID) {
        personaluserdeleteMapper.DeletePersonal_performance_patents(personalUserid,personalreviewID);
    }
    // 删除个人从业或执业（职业）资格表
    @Override
    public void DeletePersonal_occupational_qualification(String personalUserid, String personalreviewID) {
        personaluserdeleteMapper.DeletePersonal_occupational_qualification(personalUserid,personalreviewID);
    }
    //  个人国（境）外工作或研究材料表
    @Override
    public void DeletePersonal_research_materials(String personalUserid, String personalreviewID) {
        personaluserdeleteMapper.DeletePersonal_research_materials(personalUserid,personalreviewID);
    }

    @Override
    public void DeletePersonal_worksummary(String personalUserid, String personalreviewID) {
        personaluserdeleteMapper.DeletePersonal_worksummary(personalUserid,personalreviewID);
    }

    @Override
    public void DeletePersonal_others(String personalUserid, String personalreviewID) {
        personaluserdeleteMapper.DeletePersonal_others(personalUserid,personalreviewID);
    }
}
