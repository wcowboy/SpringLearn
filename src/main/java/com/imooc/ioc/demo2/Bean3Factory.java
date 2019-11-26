package com.imooc.ioc.demo2;
/*
 *Bean3 实例工厂
 */
public class Bean3Factory {
    public Bean3 creatBean3(){
        System.out.println("Bean3的工厂被执行了。。。");
        return new Bean3();
    }
}
