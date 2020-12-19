package com.darksoul.service;

import com.darksoul.Entity.Personal_reviewall;

public interface PersonalReviewallservice {
//    通过id登录的用户查看评审总表信息
   Personal_reviewall querypersonalReviewallbyid(Integer id);

//   通过电话登录的用户查看评审总表信息
   Personal_reviewall querypersonalReviewallbyPhonenumber(String Phonenumber);
}
