package com.example.testspring01.controller;

import com.example.testspring01.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @GetMapping("/api/v1/users")
    public List<User> getAllUser(){
        return null;
    }

    @GetMapping("/api/v1/users/search?name={nameValue}")
    public User getUserByName(){
        return null;
    }
}
