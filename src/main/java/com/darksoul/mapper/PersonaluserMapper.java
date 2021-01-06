package com.darksoul.mapper;

import com.darksoul.Entity.Personal_basic_message;
import com.darksoul.Entity.Personaluser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface PersonaluserMapper {

    //查询所有用户的信息，用于测试
    List<Personaluser> QueryAllUser();

    //通过用户的id查询用户的登录信息
    Personaluser QueryAllUserbyid(@Param("PersonalUserid")String PersonalUserid);

    //用于用户登录验证
    String GetUserpwdbyphonenumber(String userphonenumber);

    //通过用户的id查询基本信息表查询
    List<Personal_basic_message> Queryuserbasicmessagebyid();

//    通过phonenumber查找到id
    Personaluser GetUseridbyphonenumber(String phonenumber);

//登录之后的修改密码
    int personaluserchangepassword(@Param("PersonalUserid") String personalUserid,@Param("password") String password);
}
