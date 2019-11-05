package com.shangguigu.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration//注解配置标签，原本是在application.yml下配置，现在用注解版的配置
public class ConfigBean {

    @Bean
    @LoadBalanced//客户端负载均衡，默认轮训其他的还包括（
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }

   /* @Bean
    public IRule myRule(){
        return new RandomRule();//可以返回一个自定义轮训算法，此次返回的是随机算法
        //return new RetryRule(); //先按照轮训算法，若某个服务宕机则会在轮训列表中删除
    }*/
}
/**
 * 原本是<bean id="userService" class=""com.shangguigu.springcloud.UserServiceImp"/>
 * 现在：
 * @Bean
 * public UserService getUserService(){
 *     return new UserServiceImp;
 * }
 */
