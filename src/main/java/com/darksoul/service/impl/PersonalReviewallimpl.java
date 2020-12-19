package com.darksoul.service.impl;

import com.darksoul.Entity.Personal_reviewall;
import com.darksoul.mapper.PersonalReviewallMapper;
import com.darksoul.service.PersonalReviewallservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalReviewallimpl implements PersonalReviewallservice {

    @Autowired
    private PersonalReviewallMapper personalReviewallMapper;

//    通过id登录的用户查看评审总表信息
    @Override
    public Personal_reviewall querypersonalReviewallbyid(Integer id) {
        return personalReviewallMapper.QueryAllreviewallbyid(id);
    }

    @Override
    public Personal_reviewall querypersonalReviewallbyPhonenumber(String Phonenumber) {
        return personalReviewallMapper.QueryAllreviewallbyphonenumber(Phonenumber);
    }
}
