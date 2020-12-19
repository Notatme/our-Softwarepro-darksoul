package com.darksoul.service;

import com.darksoul.Entity.personal_reviewall;

import java.util.List;

public interface personalReviewallservice {
//    通过id登录的用户查看评审总表信息
   personal_reviewall querypersonalReviewallbyid(Integer id);

//   通过电话登录的用户查看评审总表信息
   personal_reviewall querypersonalReviewallbyPhonenumber(String Phonenumber);
}
