package com.darksoul.mapper;

import com.darksoul.Entity.Unituser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UnituserMapper {

    int Unituser_add(Unituser unituser);

    int Unituser_Update(Unituser unituser);
}
