package com.darksoul.mapper;

import com.darksoul.Entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BookRepositoryMapper {
    List<Book> find(Integer index, Integer limit);
    Integer count();
}
