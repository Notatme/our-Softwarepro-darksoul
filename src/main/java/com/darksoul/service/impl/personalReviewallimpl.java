package com.darksoul.service.impl;

import com.darksoul.Entity.personal_reviewall;
import com.darksoul.mapper.personalReviewallMapper;
import com.darksoul.service.personalReviewallservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class personalReviewallimpl implements personalReviewallservice {

    @Autowired
    private personalReviewallMapper personalReviewallMapper;

//    通过id登录的用户查看评审总表信息
    @Override
    public personal_reviewall querypersonalReviewallbyid(Integer id) {
        return personalReviewallMapper.QueryAllreviewallbyid(id);
    }

    @Override
    public personal_reviewall querypersonalReviewallbyPhonenumber(String Phonenumber) {
        return personalReviewallMapper.QueryAllreviewallbyphonenumber(Phonenumber);
    }
}
