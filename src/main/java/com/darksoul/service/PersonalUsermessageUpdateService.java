package com.darksoul.service;

import com.darksoul.Entity.*;

public interface PersonalUsermessageUpdateService {


    int Personal_others_update_service(Personal_others personal_others);

    int Personal_introduceman_update_service(Personal_introduceman personal_introduceman);

    int Personal_research_materials_update_service(Personal_research_materials personal_research_materials);

    int PersonalUpdate_basic_message_service(Personal_basic_message personal_basic_message);

    int Personal_Update_education_service(Personal_education personal_education);

    int Personal_Update_major_experience_service(Personal_major_experience personal_major_experience);

    int Personal_Update_occupational_qualification_service(Personal_occupational_qualification personal_occupational_qualification);

    int Personal_Update_paper_patents_service(Personal_paper_patents personal_paper_patents);

    int Personal_Update_performance_achievement_service(Personal_performance_achievement personal_performance_achievement);

    int Personal_Update_performance_awards_service(Personal_performance_awards personal_performance_awards);

    int Personal_Update_performance_patents_service(Personal_performance_patents personal_performance_patents);

    int Personal_Update_reviewall_service(Personal_reviewall personal_reviewall);

    int Personal_Update_worksummary_service(Personal_worksummary personal_worksummary);

    int Personal_Update_Personaluser_service(Personaluser personaluser);
}
