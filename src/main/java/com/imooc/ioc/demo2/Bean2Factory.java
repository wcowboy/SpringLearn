package com.imooc.ioc.demo2;
/*
 *Bean2的静态工厂
 */
public class Bean2Factory {
    public static Bean2 creatBean2(){
        System.out.println("Bean2Factory的方法已经执行。。。");
        return new Bean2();
    }
}
