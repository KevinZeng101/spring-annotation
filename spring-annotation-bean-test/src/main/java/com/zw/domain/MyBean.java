package com.zw.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// public class MyBean implements InitializingBean, DisposableBean {
//     public MyBean(){
//         System.out.println("MyBean constructor...");
//     }
//
//     @Override
//     public void afterPropertiesSet() throws Exception {
//         System.out.println("MyBean初始化完成....");
//     }
//
//     @Override
//     public void destroy() throws Exception {
//         System.out.println("MyBean进行销毁....");
//     }
// }
public class MyBean {
    public MyBean(){
        System.out.println("MyBean constructor...");
    }
    @PostConstruct
    public void init(){
        System.out.println("MyBean初始化完成....");
    }
    @PreDestroy
    public void destory(){
        System.out.println("MyBean进行销毁....");
    }
}
