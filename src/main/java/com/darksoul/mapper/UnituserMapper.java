package com.darksoul.mapper;

import com.darksoul.Entity.Unituser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UnituserMapper {

    Unituser findUniuserid(String userid);

    int Unituser_add(Unituser unituser);

    int Unituser_Update(Unituser unituser);

    String GetUserpwdbyphonenumber(String phonenumber);
}
