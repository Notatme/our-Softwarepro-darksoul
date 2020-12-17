package com.darksoul.service;

import com.darksoul.Entity.BookV0;
import com.darksoul.mapper.BookRepositoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

@Autowired
    private BookRepositoryMapper bookRepository;
    private Integer limit = 10;

@Override
    public BookV0 findByPage(Integer page) {
        Integer index = (page-1)*limit;
        BookV0 bookVO = new BookV0();
        bookVO.setData(bookRepository.find(index,limit));
        bookVO.setTotal(bookRepository.count());
        bookVO.setPageSize(limit);
        return bookVO;
    }
}
