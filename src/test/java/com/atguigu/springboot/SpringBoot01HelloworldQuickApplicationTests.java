package com.atguigu.springboot;

import com.atguigu.springboot.bean.Person;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringBoot01HelloworldQuickApplicationTests {

    @Autowired
    Person person;
    @Autowired
    ApplicationContext ioc;
    //记录器
    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void testHelloService(){
        boolean b=ioc.containsBean("helloService1");
        System.out.println(b);
    }
    @Test
    void contextLoads() {
        System.out.println(person);
    }

    @Test
    void testLog(){


        //日志的级别
        //由低到高  trace<debug<info<warn<error
        //可以调整输出的日志级别；
        //日志就只会在这个级别以后的高级别生效

        logger.trace("这是trace日志...");
        logger.debug("这是debug日志...");
        //Springboot默认给我们使用的是info级别的
        //没有指定级别的就就默认级别
        //在配置文件中设置级别
        logger.info("这是info日志...");
        logger.warn("这是warn日志...");
        logger.error("这是error日志");

    }
}
