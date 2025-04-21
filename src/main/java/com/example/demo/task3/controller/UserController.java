package com.example.demo.task3.controller;

import com.example.demo.task3.repoistory.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/task3")
public class UserController {

    @Autowired
    UsersRepo usersRepo;

    @GetMapping
    public String getAllUsers(Model model){
        model.addAttribute("users", usersRepo.getUserList());
        return "task3";
    }

    @PostMapping()
    public String addUser(@RequestParam String firstName,
                          @RequestParam String lastName,
                          @RequestParam String email) {
        usersRepo.addUser(firstName, lastName, email);
        return "redirect:/task3";

    }

}
