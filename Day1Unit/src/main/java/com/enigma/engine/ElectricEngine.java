package com.enigma.engine;

import org.springframework.stereotype.Component;

@Component
public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Swinggg");
    }
}
