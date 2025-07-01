package com.example.DependencyInjection.component;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private final String myComponentName;

    public MyComponent() {
        this.myComponentName = "Enrico";
        System.out.println("MyComponent constructor has been called");
    }

    public String getMyComponentName() {
        System.out.println("MyComponent.getMyComponentName() has been called");
        return myComponentName;
    }

}
