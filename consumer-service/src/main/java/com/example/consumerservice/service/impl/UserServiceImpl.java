package com.example.consumerservice.service.impl;

import com.example.consumerservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class UserServiceImpl implements UserService {
    public static String SERVICE_NAME = "manager-server";

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String fun() {
        //简单演示get和post请求
        String getFun = restTemplate.getForObject("http://" + SERVICE_NAME + "/api/hello", String.class);
        return getFun+"    ";
    }
}
