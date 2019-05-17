package com.example.eureka.client1.client1.interfaces;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "hello-service-producer")
public interface HelloRemote {
    @RequestMapping(value = "/hello")
     String hello(@RequestParam(value = "name") String name);
}
