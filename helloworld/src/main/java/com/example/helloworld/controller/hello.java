package com.example.helloworld.controller;

import com.example.helloworld.component.PropertiesDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Authod shawn
 * @create 2019/1/8 0008
 */
@RestController
public class hello {

    @Autowired
    private PropertiesDemo propertiesDemo;

    @RequestMapping("/hello")
    private String hello(){
        return propertiesDemo.getName()+","+ propertiesDemo.getTitle()+",port:"+propertiesDemo.getPort();
    }
}
