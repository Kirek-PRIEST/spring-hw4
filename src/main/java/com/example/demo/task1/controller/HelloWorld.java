package com.example.demo.task1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/task1")
public class HelloWorld {

    @GetMapping
    @ResponseBody
    public String hello(){
        return "Hello, World!";
    }
}
