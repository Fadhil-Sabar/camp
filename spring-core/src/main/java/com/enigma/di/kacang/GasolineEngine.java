package com.enigma.di.kacang;

import org.springframework.stereotype.Component;

@Component
public class GasolineEngine implements Engine{
    @Override
    public void startEngine() {
        System.out.println("Preketek prek etek");
    }
}
