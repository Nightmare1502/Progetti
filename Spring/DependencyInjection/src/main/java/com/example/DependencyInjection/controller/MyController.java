package com.example.DependencyInjection.controller;

import com.example.DependencyInjection.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private final MyService myService;

    public MyController (MyService myService) {
        this.myService = myService;
        System.out.println("MyController constructor has been called");
    }

    @GetMapping("/")
    public String welcome() {
        return "Welcome!";
    }

    @GetMapping("/getName")
    public String getName() {
        return myService.getName();
    }
}
