package com.com.learn.service;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class SingletonTestServiceImpl {

    public String testServiceSingleton() {
        return String.valueOf(this);
    }
}
