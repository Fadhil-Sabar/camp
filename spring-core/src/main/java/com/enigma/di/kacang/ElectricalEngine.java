package com.enigma.di.kacang;

import org.springframework.stereotype.Component;

@Component
public class ElectricalEngine implements Engine{
    @Override
    public void startEngine() {
        System.out.println("Ciiitt");
    }
}
