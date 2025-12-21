package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
import java.util.List;

@RestController

public class AuthController{
    @Autowired StudentService user;

    @PostMapping("/post")
    public UserM sendData(@RequestBody UserEntity auth){
        return user.postData(auth);

    }
