package com.shangguigu.springcloud.controller;

import com.shangguigu.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@RestController
public class DeptController_Consumer {
    //private static final String URL_REST_PERFIX="http://localhost:8001";
    private static final String URL_REST_PERFIX="http://MICROSERVICECLOUD-DEPT";

    @Autowired
    public RestTemplate restTemplate;

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list(){
        return restTemplate.getForObject(URL_REST_PERFIX+"/dept/all",List.class);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return restTemplate.getForObject(URL_REST_PERFIX+"/dept/get/"+id,Dept.class);
    }

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(URL_REST_PERFIX+"/dept/add",dept,Boolean.class);
    }

    @RequestMapping("/consumer/dept/discovery")
    public Object discovery(){
        return restTemplate.getForObject(URL_REST_PERFIX+"/dept/discovery",Object.class);
    }
}
