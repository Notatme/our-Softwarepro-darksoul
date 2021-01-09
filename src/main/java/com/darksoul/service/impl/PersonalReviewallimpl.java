package com.darksoul.service.impl;

import com.darksoul.Entity.Personal_reviewall;
import com.darksoul.mapper.PersonalReviewallMapper;
import com.darksoul.service.PersonalReviewallservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalReviewallimpl implements PersonalReviewallservice {

    @Autowired
    private PersonalReviewallMapper personalReviewallMapper;

//    通过id登录的用户查看评审总表信息
    @Override
    public List<Personal_reviewall> querypersonalReviewallbyid(String PersonalUserid) {
        return personalReviewallMapper.QueryAllreviewallbyid(PersonalUserid);
    }

    @Override
    public List<Personal_reviewall> querypersonalReviewallbyPhonenumber(String Phonenumber) {
        return personalReviewallMapper.QueryAllreviewallbyphonenumber(Phonenumber);
    }
    //在评审总表界面将其中一条评审表删除。
    @Override
     public void DeletePersonal_reviewall(String personalUserid, String personalreviewID) {
         personalReviewallMapper.DeletePersonal_reviewall(personalUserid,personalreviewID);
    }

    //    评审总表显示表内详情
    @Override
    public Personal_reviewall Getselectreviewall(String personalUserid, String personalreviewID) {
        return personalReviewallMapper.Getselectreviewall(personalUserid,personalreviewID);
    }

    //    单位用户通过模糊查询，输入个人用户名字查找总表信息
    @Override
    public List<Personal_reviewall> Getselectreviewallbyname(String PersonalUsername) {
        return personalReviewallMapper.Getselectreviewallbyname(PersonalUsername);
    }
//    //    评审总表中如果使用子表查询
//    @Override
//    public Personal_reviewall Getselectreviewalltest(String personalUserid, String personalreviewID) {
//        Personal_reviewall personal_reviewall=new Personal_reviewall();
//        personal_reviewall.setPersonal_basic_messages(personalReviewallMapper.GetsomePersonal_basic_message(personalUserid,personalreviewID));
//        return personal_reviewall;
//    }


}
