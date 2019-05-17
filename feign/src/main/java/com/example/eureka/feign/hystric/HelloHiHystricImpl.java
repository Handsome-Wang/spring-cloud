package com.example.eureka.feign.hystric;

import com.example.eureka.feign.interfaces.HelloRemote;
import org.springframework.stereotype.Service;

@Service
public class HelloHiHystricImpl implements HelloRemote {
    @Override
    public String hello(String name) {
        return "error";
    }
}
