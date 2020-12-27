package com.darksoul.service;

import com.darksoul.Entity.Personal_reviewall;

import java.util.List;

public interface PersonalReviewallservice {
//    通过id登录的用户查看评审总表信息
   Personal_reviewall querypersonalReviewallbyid(Integer id);

//   通过电话登录的用户查看评审总表信息
   Personal_reviewall querypersonalReviewallbyPhonenumber(String Phonenumber);
    //在评审总表界面将其中一条评审表删除。
    public void DeletePersonal_reviewall(String personalUserid, String personalreviewID);

//    评审总表显示表内详情
    Personal_reviewall Getselectreviewall(String personalUserid, String personalreviewID);

    //    单位用户通过模糊查询，输入个人用户名字查找总表信息
    public List<Personal_reviewall> Getselectreviewallbyname(String PersonalUsername);
//        评审总表中如果使用子表查询
//    Personal_reviewall Getselectreviewalltest(String personalUserid, String personalreviewID);
}
