package com.enigma;

import com.enigma.engine.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Car {

    @Autowired
    @Qualifier("dieselEngine")
    private Engine engine;

    private Integer fuel = 10;


    public void startEngine(){
    if(fuel>0) {
        engine.start();
        System.out.println(this.fuel);
        }else{
        System.out.println("Fuel is empty");
    }
    }

}
