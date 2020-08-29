package com.zw.registrar;

import com.zw.domain.RainBow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 自定义注册器
 */
public class MyRegistrar implements ImportBeanDefinitionRegistrar {
    /**
     * @param importingClassMetadata 当前类的注解信息
     * @param registry  注册类 把所有需要的添加到容器中的bean
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        //实例化一个RainBow的Bean的定义信息
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(RainBow.class);
        //手动注册一个bean，注册bean名
        registry.registerBeanDefinition("rainBow",rootBeanDefinition);
    }
}
