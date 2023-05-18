package ru.zhukov.springcourse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.zhukov.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
