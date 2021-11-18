package com.enigma.engine;

import org.springframework.stereotype.Component;

@Component
public class GasolinEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Ngenngg");
    }
}
