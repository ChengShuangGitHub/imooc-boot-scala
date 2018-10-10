package com.imooc.imoocbootscala.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloBoot {

    @RequestMapping(value = "/sayhello", method = RequestMethod.GET)
    public String sayHello(){
        return "hello boot...";
    }
}
