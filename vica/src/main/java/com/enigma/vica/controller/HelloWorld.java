package com.enigma.vica.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class HelloWorld {
    @GetMapping("/hello")
    public String getHelloWorld(){
        return "Hello World";
    }

    @GetMapping("/hello/{id}")
    public String getHelloWorldById(@PathVariable String id){
        return "Id url ini adalah: " + id;
    }

    @GetMapping("/query-hello") //query-hello?var=
    public String getHElloWorldByQP(@RequestParam String name, Integer price, Integer stock,Integer rating){
        return "Param url ini adalah: " + name + price + stock + rating;
    }

    @PostMapping("/login")
    public String reqBody(@RequestBody HashMap<String, String> mapBody){
        return "Hasil reqBody: " + mapBody;
    }
}
