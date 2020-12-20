package com.darksoul.service;

import com.darksoul.Entity.Personal_introduceman;
import com.darksoul.Entity.Personal_others;
import com.darksoul.Entity.Personal_research_materials;
import com.darksoul.mapper.PersonalusermessageAddMapper;
import org.springframework.stereotype.Service;


public interface personalUsermessageAddService {

    int PersonalusermessageAddMassage(Personal_introduceman personal_introduceman);

     int PerPersonalusermessageAddothers(Personal_others personal_others);

     int PerPersonalusermessageAdd_research_materials(Personal_research_materials personal_research_materials);
}
