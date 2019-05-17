package com.example.eureka.feign.interfaces;

import com.example.eureka.feign.hystric.HelloHiHystricImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "hello-service-producer",fallback = HelloHiHystricImpl.class)
public interface HelloRemote {

    /**
     * 方法名hello要和服务提供者方法名一致
     * @param name
     * @return
     */
    @RequestMapping(value = "/hello")
     String hello(@RequestParam(value = "name") String name);
}
