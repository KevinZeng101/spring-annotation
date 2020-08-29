package com.zw;

import com.zw.config.MyConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class SpringAnnotationFactoryBeanTestApplicationTests {

	@Test
	void contextLoads() {
		AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(MyConfig.class);
		Object color = ioc.getBean("myFactory");	//class com.zw.domain.Color
		Object myFactory = ioc.getBean("&myFactory");	//class com.zw.factory.MyFactory
		System.out.println(color.getClass());
		System.out.println(myFactory.getClass());
	}
}
