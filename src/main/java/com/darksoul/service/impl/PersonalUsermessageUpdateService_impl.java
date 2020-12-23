package com.darksoul.service.impl;

import com.darksoul.Entity.*;
import com.darksoul.mapper.PersonalusermessageUpdateMapper;
import com.darksoul.service.PersonalUsermessageUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalUsermessageUpdateService_impl implements PersonalUsermessageUpdateService{

@Autowired
    private PersonalusermessageUpdateMapper personalusermessageUpdateMapper;

    @Override
    public int Personal_others_update_service(Personal_others personal_others) {

        return personalusermessageUpdateMapper.personal_others_update(personal_others);
    }

    @Override
    public int Personal_introduceman_update_service(Personal_introduceman personal_introduceman) {
        return personalusermessageUpdateMapper.personal_introduceman_update(personal_introduceman);
    }

    @Override
    public int Personal_research_materials_update_service(Personal_research_materials personal_research_materials) {
        return personalusermessageUpdateMapper.personal_research_materials_update(personal_research_materials);
    }

    @Override
    public int PersonalUpdate_basic_message_service(Personal_basic_message personal_basic_message) {
        return personalusermessageUpdateMapper.personal_basic_message_update(personal_basic_message);
    }

    @Override
    public int Personal_Update_education_service(Personal_education personal_education) {
        return personalusermessageUpdateMapper.personal_education_update(personal_education);
    }

    @Override
    public int Personal_Update_major_experience_service(Personal_major_experience personal_major_experience) {
        return personalusermessageUpdateMapper.Personal_Update_major_experience(personal_major_experience);
    }

    @Override
    public int Personal_Update_occupational_qualification_service(Personal_occupational_qualification personal_occupational_qualification) {
        return personalusermessageUpdateMapper.Personal_Update_occupational_qualification(personal_occupational_qualification);
    }

    @Override
    public int Personal_Update_paper_patents_service(Personal_paper_patents personal_paper_patents) {
        return personalusermessageUpdateMapper.Personal_Update_paper_patents(personal_paper_patents);
    }

    @Override
    public int Personal_Update_performance_achievement_service(Personal_performance_achievement personal_performance_achievement) {
        return personalusermessageUpdateMapper.Personal_Update_performance_achievement(personal_performance_achievement);
    }

    @Override
    public int Personal_Update_performance_awards_service(Personal_performance_awards personal_performance_awards) {
        return personalusermessageUpdateMapper.Personal_Update_performance_awards(personal_performance_awards);
    }

    @Override
    public int Personal_Update_performance_patents_service(Personal_performance_patents personal_performance_patents) {
        return personalusermessageUpdateMapper.Personal_Update_performance_patents(personal_performance_patents);
    }

    @Override
    public int Personal_Update_reviewall_service(Personal_reviewall personal_reviewall) {
        return personalusermessageUpdateMapper.Personal_Update_reviewall(personal_reviewall);
    }

    @Override
    public int Personal_Update_worksummary_service(Personal_worksummary personal_worksummary) {
        return personalusermessageUpdateMapper.Personal_Update_worksummary(personal_worksummary);
    }

    @Override
    public int Personal_Update_Personaluser_service(Personaluser personaluser) {
        return personalusermessageUpdateMapper.Personal_Update_Personaluser(personaluser);
    }
}
