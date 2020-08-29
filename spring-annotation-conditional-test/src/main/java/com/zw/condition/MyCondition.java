package com.zw.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 自定义Condition
 */
public class MyCondition implements Condition {
    /**
     * @param context 判断条件能使用的上下文环境
     * @param metadata 当前标注了Conditional注解的注解信息
     * @return
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //1.获取到ioc使用的bean工厂
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        //2.获取类加载器
        ClassLoader classLoader = context.getClassLoader();
        //3.获取当前环境信息
        Environment environment = context.getEnvironment();
        //4.获取到bean定义的注册信息
        BeanDefinitionRegistry registry = context.getRegistry();
        //5.如果是Windows系统就表示可以将Person注册到IOC容器
        if (environment.getProperty("os.name").contains("Windows")){
            return true;
        }
        return false;
    }
}
