package com.darksoul.service;

import com.darksoul.Entity.*;
import com.darksoul.mapper.PersonalusermessageAddMapper;
import org.springframework.stereotype.Service;


public interface personalUsermessageAddService {

    int PersonalusermessageAddMassage(Personal_introduceman personal_introduceman);

     int PerPersonalusermessageAddothers(Personal_others personal_others);

     int PerPersonalusermessageAdd_research_materials(Personal_research_materials personal_research_materials);

    int personal_basic_message_service(Personal_basic_message personal_basic_message);

    int PersonalAdd_education_add_service(Personal_education personal_education);

    int personalAdd_major_experience_add_service(Personal_major_experience personal_major_experience);

    int PersonalAdd_occupational_qualification_add(Personal_occupational_qualification personal_occupational_qualification);

    int PersonalAdd_paper_patents_add_service(Personal_paper_patents personal_paper_patents);

    int PersonalAdd_performance_achievement_add_service(Personal_performance_achievement personal_performance_achievement);

    int PersonalAdd_performance_awards_add_service(Personal_performance_awards personal_performance_awards);

    int PersonalAdd_performance_patents_add_service(Personal_performance_patents personal_performance_patents);

    int PersonalAdd_reviewall_add_service(Personal_reviewall personal_reviewall);

    int PersonalAdd_worksummary_add_service(Personal_worksummary personal_worksummary);

    int PersonalAdd_Personaluser_add_service(Personaluser personaluser);

    Personaluser findUniuserid_service(String userid);
}
