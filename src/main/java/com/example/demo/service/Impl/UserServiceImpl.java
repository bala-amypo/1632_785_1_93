package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.service.UserService;

import com.example.demo.model.User;

import com.example.demo.repository.UserRepository;


@Service


public class UserServiceImpl implements UserService{
    @Autowired UserRepository student;


    @Override
    public User GetData(int id){
        return student.findById(id).orElse(null);
    }
}