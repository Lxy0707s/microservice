package com.example.consumerservice.controller;

import com.example.consumerservice.service.FeignClientInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping(value = "/api")
public class FeignController {
    @Resource
    private FeignClientInterface feignClientInterface = null;

    @GetMapping("/rpc/hello")
    public String getDate() {
        return feignClientInterface.hello();
    }
}