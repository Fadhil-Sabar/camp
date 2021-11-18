package com.enigma.di;


import com.enigma.di.kacang.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.enigma.di.kacang")
public class ApplicationConfiguration {
//
//    @Bean
//    Engine dieselEngine(){
//        return new DieselEngine();
//    }
//
//    @Bean
//    Engine electricalEngine(){
//        return new ElectricalEngine();
//    }
//
//    @Bean
//    Engine gasolineEngine(){
//        return new GasolineEngine();
//    }
//
//    @Bean
//    Car car (){
//        return new Car(dieselEngine());
//    }
}
