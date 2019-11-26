package com.imooc.ioc.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo1 {

    @Test
    public void dome1(){
//        UseService useService = new UserServiceImpl();
        UserServiceImpl userService = new UserServiceImpl();
        //设置属性
        userService.setName("张三");
        userService.sayHello();
    }
    @Test
    /*
    *使用Spring的方式
     */
    public void demo2(){
        //c创建Spring工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UseService useService = (UseService) applicationContext.getBean("userService");
        useService.sayHello();
    }
}
