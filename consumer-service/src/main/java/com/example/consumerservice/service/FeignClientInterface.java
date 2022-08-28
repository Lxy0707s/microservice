package com.example.consumerservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "manager-server", name = "manager-server")
public interface FeignClientInterface {
    @RequestMapping(value = "/api/hello",method = RequestMethod.GET)
    public String hello();
}
