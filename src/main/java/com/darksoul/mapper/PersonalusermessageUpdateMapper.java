package com.darksoul.mapper;

import com.darksoul.Entity.Personal_basic_message;
import com.darksoul.Entity.Personal_introduceman;
import com.darksoul.Entity.Personal_others;
import com.darksoul.Entity.Personal_research_materials;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PersonalusermessageUpdateMapper {

    int personal_others_update(Personal_others personal_others);

    int personal_introduceman_update(Personal_introduceman personal_introduceman);

    int personal_research_materials_update(Personal_research_materials personal_research_materials);

    int personal_basic_message_update(Personal_basic_message personal_basic_message);
}
