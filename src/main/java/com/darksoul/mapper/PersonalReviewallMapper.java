package com.darksoul.mapper;

import com.darksoul.Entity.Personal_reviewall;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PersonalReviewallMapper {
    //通过用户的id查询用户的申报信息
    Personal_reviewall QueryAllreviewallbyid(Integer id);
//    通过用户登录的电话查找用户评审总表
    Personal_reviewall QueryAllreviewallbyphonenumber(String phonenumber);
    //在评审总表界面将其中一条评审表删除。
    public void DeletePersonal_reviewall(@Param("PersonalUserid") String PersonalUserid, @Param("PersonalreviewID") String PersonalreviewID);
}
