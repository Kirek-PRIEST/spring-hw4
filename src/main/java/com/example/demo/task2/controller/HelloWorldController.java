package com.example.demo.task2.controller;

import com.example.demo.task2.model.HelloWorldModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/task2")
public class HelloWorldController {

    @Autowired
    private HelloWorldModel helloWorldModel;

    @GetMapping
    public String hello(Model model) {
        model.addAttribute("hello", helloWorldModel.getHello());
        return "task2";
    }
}