package com.zw.config;

import com.zw.condition.MyCondition;
import com.zw.domain.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 */
@Configuration
public class MyConfig {

    @Conditional(MyCondition.class)
    @Bean("Steven")
    public Person person(){
        return new Person("史蒂芬Windows之父");
    }
}
