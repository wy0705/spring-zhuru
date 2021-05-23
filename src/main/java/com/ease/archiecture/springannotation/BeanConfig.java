package com.ease.archiecture.springannotation;


import com.ease.archiecture.otherTest.Person;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ease.archiecture.springannotation")
public class BeanConfig {


    //@Bean
    public Person person() {
        return new Person();
    }
}
