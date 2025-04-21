package com.example.demo.task2.model;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class HelloWorldModel {

    private String hello;

    public HelloWorldModel(){
        this.hello = "Hello, World";
    }

    public String getHello() {
        return hello;
    }
}
