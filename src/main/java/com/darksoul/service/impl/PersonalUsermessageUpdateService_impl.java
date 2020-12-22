package com.darksoul.service.impl;

import com.darksoul.Entity.Personal_basic_message;
import com.darksoul.Entity.Personal_introduceman;
import com.darksoul.Entity.Personal_others;
import com.darksoul.Entity.Personal_research_materials;
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
}
