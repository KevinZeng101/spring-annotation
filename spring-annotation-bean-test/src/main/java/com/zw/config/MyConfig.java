package com.zw.config;

import com.zw.domain.MyBean;
import com.zw.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
// @Bean(initMethod = "init",destroyMethod = "destory")
// public User user(){
//     return new User(1,"雷神");
// }
@Configuration
public class MyConfig {

    @Bean
    public MyBean myBean(){
        return new MyBean();
    }
}

