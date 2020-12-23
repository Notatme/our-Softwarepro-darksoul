package com.darksoul.mapper;


import com.darksoul.Entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PersonalusermessageAddMapper {

    //增加基本用户的personal_introduction表的信息
    int personal_messageadd(Personal_introduceman personal_introduceman);

    int bookaddtest(BookCase bookCase);

    int personaladdohtners(Personal_others personal_others);

    int personaladd_research_materials(Personal_research_materials personal_research_materials);

    int personaladd_basic_message(Personal_basic_message personal_basic_message);

    int PersonalAdd_education(Personal_education personal_education);

    int PersonalAdd_major_experience(Personal_major_experience personal_major_experience);

    int PersonalAdd_occupational_qualification(Personal_occupational_qualification personal_occupational_qualification);

    int PersonalAdd_paper_patents_add(Personal_paper_patents personal_paper_patents);

    int PersonalAdd_performance_achievement_add(Personal_performance_achievement personal_performance_achievement);

    int PersonalAdd_performance_awards_add(Personal_performance_awards personal_performance_awards);

    int PersonalAdd_performance_patents_add(Personal_performance_patents personal_performance_patents);

    int PersonalAdd_reviewall_add(Personal_reviewall personal_reviewall);

    int PersonalAdd_worksummary_add(Personal_worksummary personal_worksummary);

    int PersonalAdd_Personaluser_add(Personaluser personaluser);
}
