package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {

    @Bean
    //@LoadBalanced    //使用@LoadBalanced注解赋予RestTemplate负载均衡的能力
    //Ribbon之手写轮询算法：ApplicationContextConfig去掉注解@LoadBalanced，OrderMain80去掉注解@RibbonClient
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
