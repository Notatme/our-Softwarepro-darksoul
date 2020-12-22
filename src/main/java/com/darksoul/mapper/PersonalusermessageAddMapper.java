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
}
