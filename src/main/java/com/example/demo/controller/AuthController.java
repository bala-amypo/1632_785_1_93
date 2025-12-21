package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.User;
import com.example.demo.service.UserService;


@RestController
public class AuthController{
@Autowired UserService userService;

    @PostMapping("/register")
    public User register(@RequestBody User user){
        return userService.registerUser(user);

    }
@PostMapping("/login")
public String login(@RequestBody User user){
    User dbUser=userService.findByEmail(user.getEmail());

    id(dbUser != null && dbUser.getPassword().equals(user.getPassword())){
        return "Login successful";
    }
    else{
        return "Invalid Credentials";
    }
}
}
