package com.example.consumerservice.controller;


import com.example.consumerservice.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api")
public class TestController {

    @Resource
    private UserService userService;

    @GetMapping(value = "/getHello")
    public String consume(){
        return userService.fun();
    }
}
