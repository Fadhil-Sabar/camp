package com.enigma.di;

import com.enigma.di.kacang.Car;
import com.enigma.di.kacang.DieselEngine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Car car = (Car) applicationContext.getBean("car");
        car.run();
    }
}
