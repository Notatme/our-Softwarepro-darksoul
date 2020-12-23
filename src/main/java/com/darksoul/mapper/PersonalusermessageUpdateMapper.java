package com.darksoul.mapper;

import com.darksoul.Entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PersonalusermessageUpdateMapper {

    int personal_others_update(Personal_others personal_others);

    int personal_introduceman_update(Personal_introduceman personal_introduceman);

    int personal_research_materials_update(Personal_research_materials personal_research_materials);

    int personal_basic_message_update(Personal_basic_message personal_basic_message);

    int personal_education_update(Personal_education personal_education);

    int Personal_Update_major_experience(Personal_major_experience personal_major_experience);

    int Personal_Update_occupational_qualification(Personal_occupational_qualification personal_occupational_qualification);

    int Personal_Update_paper_patents(Personal_paper_patents personal_paper_patents);

    int Personal_Update_performance_achievement(Personal_performance_achievement personal_performance_achievement);

    int Personal_Update_performance_awards(Personal_performance_awards personal_performance_awards);

    int Personal_Update_performance_patents(Personal_performance_patents personal_performance_patents);

    int Personal_Update_reviewall(Personal_reviewall personal_reviewall);

    int Personal_Update_worksummary(Personal_worksummary personal_worksummary);

    int Personal_Update_Personaluser(Personaluser personaluser);
}
