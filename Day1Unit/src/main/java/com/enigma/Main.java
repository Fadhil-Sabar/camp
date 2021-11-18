package com.enigma;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
//        String [] beanList= applicationContext.getBeanDefinitionNames();
//        for (String names: beanList) {
//            System.out.println(names);
//        }
        Car car = (Car) applicationContext.getBean("car");
        car.startEngine();
    }
}
