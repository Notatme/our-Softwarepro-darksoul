package com.darksoul.service.impl;

import com.darksoul.Entity.*;
import com.darksoul.mapper.PersonalusermessageAddMapper;
import com.darksoul.service.personalUsermessageAddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class personalUsermessageAddServiceimpl implements personalUsermessageAddService {

    @Autowired
    private PersonalusermessageAddMapper personalusermessageAddMapper;


    //增加表中数据的service层
    @Override
    public int PersonalusermessageAddMassage(Personal_introduceman personal_introduceman1) {

        return personalusermessageAddMapper.personal_messageadd(personal_introduceman1);
    }

    @Override
    public int PerPersonalusermessageAddothers(Personal_others personal_others) {

        return personalusermessageAddMapper.personaladdohtners(personal_others);
    }

    @Override
    public int PerPersonalusermessageAdd_research_materials(Personal_research_materials personal_research_materials) {
        return personalusermessageAddMapper.personaladd_research_materials(personal_research_materials);
    }

    @Override
    public int personal_basic_message_service(Personal_basic_message personal_basic_message) {
        return personalusermessageAddMapper.personaladd_basic_message(personal_basic_message);
    }

    @Override
    public int PersonalAdd_education_add_service(Personal_education personal_education) {
        return personalusermessageAddMapper.PersonalAdd_education(personal_education);
    }

    @Override
    public int personalAdd_major_experience_add_service(Personal_major_experience personal_major_experience) {
        return personalusermessageAddMapper.PersonalAdd_major_experience(personal_major_experience);
    }

    @Override
    public int PersonalAdd_occupational_qualification_add(Personal_occupational_qualification personal_occupational_qualification) {
        return personalusermessageAddMapper.PersonalAdd_occupational_qualification(personal_occupational_qualification);
    }

    @Override
    public int PersonalAdd_paper_patents_add_service(Personal_paper_patents personal_paper_patents) {
        return personalusermessageAddMapper.PersonalAdd_paper_patents_add(personal_paper_patents);
    }

    @Override
    public int PersonalAdd_performance_achievement_add_service(Personal_performance_achievement personal_performance_achievement) {
        return personalusermessageAddMapper.PersonalAdd_performance_achievement_add(personal_performance_achievement);
    }

    @Override
    public int PersonalAdd_performance_awards_add_service(Personal_performance_awards personal_performance_awards) {
        return personalusermessageAddMapper.PersonalAdd_performance_awards_add(personal_performance_awards);
    }

    @Override
    public int PersonalAdd_performance_patents_add_service(Personal_performance_patents personal_performance_patents) {
        return personalusermessageAddMapper.PersonalAdd_performance_patents_add(personal_performance_patents);
    }

    @Override
    public int PersonalAdd_reviewall_add_service(Personal_reviewall personal_reviewall) {
        return personalusermessageAddMapper.PersonalAdd_reviewall_add(personal_reviewall);
    }

    @Override
    public int PersonalAdd_worksummary_add_service(Personal_worksummary personal_worksummary) {
        return personalusermessageAddMapper.PersonalAdd_worksummary_add(personal_worksummary);
    }

    @Override
    public int PersonalAdd_Personaluser_add_service(Personaluser personaluser) {
        return personalusermessageAddMapper.PersonalAdd_Personaluser_add(personaluser);
    }


}
