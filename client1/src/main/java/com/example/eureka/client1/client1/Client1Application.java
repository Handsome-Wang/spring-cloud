package com.example.eureka.client1.client1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

//启用服务注册与发现
@EnableDiscoveryClient
//启用feign进行远程调用
@EnableFeignClients
@SpringBootApplication
public class Client1Application {

    public static void main(String[] args) {
        SpringApplication.run(Client1Application.class, args);
    }

}
