package com.com.learn.controller;

import com.com.learn.service.SingletonTestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/haitao/learn/test")
public class SingletonTestController {


    @Autowired
    private SingletonTestServiceImpl service;

    @RequestMapping(value = "/singleton", method = RequestMethod.GET)
    public String testSingleton() {
        return String.valueOf(this) + service.testServiceSingleton();
    }
}
