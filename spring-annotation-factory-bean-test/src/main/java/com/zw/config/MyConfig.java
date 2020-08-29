package com.zw.config;

import com.zw.factory.MyFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    /**
     * 将自定义FactotyBean注册到ioc容器
     * @return
     */
    @Bean
    public MyFactory myFactory(){
        return new MyFactory();
    }
}
