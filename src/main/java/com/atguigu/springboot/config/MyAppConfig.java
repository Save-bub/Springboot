package com.atguigu.springboot.config;

import com.atguigu.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration                      //指明当前类是一个配置类，替代之前的Spring配置文件
public class MyAppConfig {

    @Bean
    public HelloService helloService1(){
        System.out.println("配置类@bean给容器添加组件了");
        return new HelloService();
    }
}
