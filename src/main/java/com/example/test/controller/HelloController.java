package com.example.test.controller;

import com.example.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    public TestService testService;

    @GetMapping("/greetings")
    public String greet(){
        String result=testService.greet();
        return result;
    }

    @GetMapping("/greetingsFeature")
    public String greetFeature(){
        return "Greeting from feature branch";
    }
}
