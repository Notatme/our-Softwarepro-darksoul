package com.darksoul.mapper;

import com.darksoul.Entity.personal_reviewall;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface personalReviewallMapper {
    //通过用户的id查询用户的申报信息
    personal_reviewall QueryAllreviewallbyid(Integer id);
//    通过用户登录的电话查找用户评审总表
    personal_reviewall QueryAllreviewallbyphonenumber(String phonenumber);
}
