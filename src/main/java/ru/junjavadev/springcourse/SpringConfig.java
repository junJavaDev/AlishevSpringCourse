package ru.junjavadev.springcourse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.junjavadev.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
