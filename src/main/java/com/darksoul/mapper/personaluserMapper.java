package com.darksoul.mapper;

import com.darksoul.Entity.personal_basic_message;
import com.darksoul.Entity.personaluser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface personaluserMapper {

    //查询所有用户的信息，用于测试
    List<personaluser> QueryAllUser();

    //通过用户的id查询用户的登录信息
    personaluser QueryAllUserbyid(Integer id);

    //用于用户登录验证
    String GetUserpwdbyphonenumber(String userphonenumber);

    //通过用户的id查询基本信息表查询
    List<personal_basic_message> Queryuserbasicmessagebyid();

}
