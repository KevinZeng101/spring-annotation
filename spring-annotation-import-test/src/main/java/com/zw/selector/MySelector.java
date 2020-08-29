package com.zw.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.function.Predicate;

/**
 * 自定义选择器
 */
public class MySelector implements ImportSelector {
    /**
     *
     * @param importingClassMetadata  当前标注@Import注解的类的所有注解信息
     * @return 返回需要导入的组件
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.zw.domain.Blue","com.zw.domain.Red"};
    }
    @Override
    public Predicate<String> getExclusionFilter() {
        return null;
    }
}
