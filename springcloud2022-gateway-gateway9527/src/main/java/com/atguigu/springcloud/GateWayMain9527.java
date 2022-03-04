package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527 {

/*
    访问说明
        添加网关前 - http://localhost:8001/payment/get/1
        添加网关后 - http://localhost:9527/payment/get/1
        两者访问成功，返回相同结果
*/
    public static void main(String[] args) {
        SpringApplication.run(GateWayMain9527.class, args);
    }

}
