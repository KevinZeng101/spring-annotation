package com.zw.config;

import com.zw.controller.MyController;
import com.zw.domain.Color;
import com.zw.domain.Student;
import com.zw.filter.MyTypeFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * Coder ： ZW
 * Time ： 2020-08-27 16:33
 * Name ： com.zw.config.MyConfig
 * Description  ：
 */
@Configuration
@ComponentScan(
    value = "com.zw",//指定要扫描的包
    excludeFilters = {//排除的组件
        //按照注解过滤
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class),
        //按照类型过滤
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = Student.class)
    },
    includeFilters = {//包含的组件
        //按照自定义TyperFilter过滤
        @ComponentScan.Filter(type = FilterType.CUSTOM,classes = MyTypeFilter.class)
    },
    //禁用默认的过滤规则
    useDefaultFilters = false
)
public class MyConfig {

}
