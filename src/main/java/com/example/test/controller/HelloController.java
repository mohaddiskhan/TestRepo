package com.example.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/greetings")
    public String greet(){
        return "Hello GitHub";
    }

    @GetMapping("/greetFeature2")
    public String greetFeature2(){
        return "Hello from feature2";
    }


}
