package com.zw;

import com.zw.config.MyConfig;
import com.zw.domain.Person;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class SpringAnnotationConditionalTestApplicationTests {

	@Test
	void contextLoads() {
		AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(MyConfig.class);
		System.out.println(ioc.getBean(Person.class));
	}
}
