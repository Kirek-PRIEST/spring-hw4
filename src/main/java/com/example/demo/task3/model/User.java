package com.example.demo.task3.model;


import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Data
@Getter
@RequiredArgsConstructor
public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public User(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}

