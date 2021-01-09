package com.darksoul.mapper;

import com.darksoul.Entity.Personal_basic_message;
import com.darksoul.Entity.Personal_reviewall;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PersonalReviewallMapper {
    //通过用户的id查询用户的申报信息
    List<Personal_reviewall> QueryAllreviewallbyid(@Param("PersonalUserid") String PersonalUserid);
//    通过用户登录的电话查找用户评审总表
    List<Personal_reviewall> QueryAllreviewallbyphonenumber(String phonenumber);
    //在评审总表界面将其中一条评审表删除。
    public void DeletePersonal_reviewall(@Param("PersonalUserid") String PersonalUserid, @Param("PersonalreviewID") String PersonalreviewID);
    //    评审总表显示表内详情
    Personal_reviewall Getselectreviewall(@Param("PersonalUserid") String PersonalUserid, @Param("PersonalreviewID") String PersonalreviewID);

    //    单位用户通过模糊查询，输入个人用户名字查找总表信息
  //  Personal_reviewall Getselectreviewallbyname(String PersonalUsername);

    public List<Personal_reviewall> Getselectreviewallbyname(String PersonalUsername);
//    //    评审总表中如果使用子表查询
//    List<Personal_reviewall> Getselectreviewalltest(@Param("PersonalUserid") String PersonalUserid, @Param("PersonalreviewID") String PersonalreviewID);
//
//    List<Personal_basic_message> GetsomePersonal_basic_message(@Param("PersonalUserid") String PersonalUserid, @Param("PersonalreviewID") String PersonalreviewID);

}
