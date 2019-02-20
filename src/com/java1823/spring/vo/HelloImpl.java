package com.java1823.spring.vo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloImpl {
    @Test
    public void getSpring(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println( applicationContext.getBean("ljj"));
    }
    


}
