package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;


@RestController
public class AuthController{
@Autowired UserService userService;

    @PostMapping("/register")
    public UserModel register(@RequestBody UserModel user){
        return userService.registerUser(user);

    }
