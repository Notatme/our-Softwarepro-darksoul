package com.darksoul.mapper;

import com.darksoul.Entity.Personal_reviewall;
import com.darksoul.Entity.Unituser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UnituserMapper {

    Unituser findUniuserid(String userid);

    int Unituser_add(Unituser unituser);

    int Unituser_Update(Unituser unituser);

    String GetUserpwdbyphonenumber(String phonenumber);

    //    根据手机号查询登录的单位用户，其用户名单位下，reviewall表中的评审信息
    public List<Personal_reviewall> Getselectreviewallbyphonenumber(String phonenumber);


    Unituser GetselectUnitusermessage(String phonenumber);
}
