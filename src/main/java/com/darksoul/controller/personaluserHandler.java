package com.darksoul.controller;

import com.darksoul.Entity.personaluser;
import com.darksoul.service.personalUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/person")
public class personaluserHandler {
    @Autowired
    private personalUserService personalUserService1;

    @RequestMapping("/finduser")
    @ResponseBody
    public List<personaluser> getuser(){
        return personalUserService1.query();
    }

}
