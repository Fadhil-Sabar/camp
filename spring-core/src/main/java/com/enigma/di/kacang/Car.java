package com.enigma.di.kacang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
    @Autowired
    @Qualifier("gasolineEngine")
    public Engine engine;

//    public Car(Engine engine) {
//        this.engine = engine;
//    }

    public void run(){
        engine.startEngine();
    }
}
