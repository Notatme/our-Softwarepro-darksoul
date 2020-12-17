package com.darksoul.mapper;

import com.darksoul.Entity.BookCase;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BookCaseRepositoryMapper {
    BookCase findById(Integer id);
}
