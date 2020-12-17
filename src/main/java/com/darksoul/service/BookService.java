package com.darksoul.service;

import com.darksoul.Entity.BookV0;

public interface BookService {
    BookV0 findByPage(Integer page);
}
