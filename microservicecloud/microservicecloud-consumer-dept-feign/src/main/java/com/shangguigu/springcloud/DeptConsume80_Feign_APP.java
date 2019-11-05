package com.shangguigu.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.shangguigu.service"})//扫描API下的Feign接口所在的包
@ComponentScan("com.shangguigu")
public class DeptConsume80_Feign_APP {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsume80_Feign_APP.class,args);
    }
}
