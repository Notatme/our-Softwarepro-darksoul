package com.darksoul.service.impl;

import com.darksoul.Entity.Personal_introduceman;
import com.darksoul.Entity.Personal_others;
import com.darksoul.Entity.Personal_research_materials;
import com.darksoul.mapper.PersonalusermessageAddMapper;
import com.darksoul.service.personalUsermessageAddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class personalUsermessageAddServiceimpl implements personalUsermessageAddService {

    @Autowired
    private PersonalusermessageAddMapper personalusermessageAddMapper;


    //增加表中数据的service层
    @Override
    public int PersonalusermessageAddMassage(Personal_introduceman personal_introduceman1) {

        return personalusermessageAddMapper.personal_messageadd(personal_introduceman1);
    }

    @Override
    public int PerPersonalusermessageAddothers(Personal_others personal_others) {

        return personalusermessageAddMapper.personaladdohtners(personal_others);
    }

    @Override
    public int PerPersonalusermessageAdd_research_materials(Personal_research_materials personal_research_materials) {
        return personalusermessageAddMapper.personaladd_research_materials(personal_research_materials);
    }

}
