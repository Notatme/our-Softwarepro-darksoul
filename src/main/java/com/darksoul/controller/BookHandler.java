package com.darksoul.controller;

import com.darksoul.Entity.BookV0;
import com.darksoul.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookHandler {     //jhjhjhjhjhj

@Autowired
    private BookService bookService;

    @RequestMapping("/findByPage/{page}")
    @ResponseBody
    public BookV0 findByPage(@PathVariable("page") Integer page){

        return bookService.findByPage(page);

    }
}
