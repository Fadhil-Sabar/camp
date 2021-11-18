package com.enigma.di.kacang;

import org.springframework.stereotype.Component;

@Component
public class DieselEngine implements Engine{
    @Override
    public void startEngine() {
        System.out.println("Blarrr blarr");
    }
}
