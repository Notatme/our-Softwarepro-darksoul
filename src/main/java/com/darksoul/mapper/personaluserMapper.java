package com.darksoul.mapper;

import com.darksoul.Entity.personaluser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface personaluserMapper {
    List<personaluser> QueryAllUser();
}
