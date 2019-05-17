package com.example.eureka.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(@RequestParam String name) {
        return "hello "+name+"，this is first messge,port:8080";
    }

    @RequestMapping(value = "/helloWorld",method = RequestMethod.GET)
    public String hello() {
        return "hello world!";
    }
}
