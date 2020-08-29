package com.zw.factory;

import com.zw.domain.Color;
import org.springframework.beans.factory.FactoryBean;

/**
 * 自定义FactoryBean
 */
public class MyFactory implements FactoryBean<Color> {

    /**
     *
     * @return 返回一个Color对象，这个对象会添加到容器中
     * @throws Exception
     */
    @Override
    public Color getObject() throws Exception {
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    /**
     * 控制是否是单实例
     * @return true 单例 false 多例
     */
    @Override
    public boolean isSingleton() {
        return true;
    }
}
