package com.darksoul.mapper;


import com.darksoul.Entity.BookCase;
import com.darksoul.Entity.Personal_introduceman;
import com.darksoul.Entity.Personal_others;
import com.darksoul.Entity.Personal_research_materials;
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
}
