package com.zw.config;

import com.zw.domain.Green;
import com.zw.registrar.MyRegistrar;
import com.zw.selector.MySelector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({Green.class, MySelector.class, MyRegistrar.class})
public class MyConfig {
}
