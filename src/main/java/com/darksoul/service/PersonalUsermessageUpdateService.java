package com.darksoul.service;

import com.darksoul.Entity.Personal_basic_message;
import com.darksoul.Entity.Personal_introduceman;
import com.darksoul.Entity.Personal_others;
import com.darksoul.Entity.Personal_research_materials;

public interface PersonalUsermessageUpdateService {


    int Personal_others_update_service(Personal_others personal_others);

    int Personal_introduceman_update_service(Personal_introduceman personal_introduceman);

    int Personal_research_materials_update_service(Personal_research_materials personal_research_materials);

    int PersonalUpdate_basic_message_service(Personal_basic_message personal_basic_message);
}
