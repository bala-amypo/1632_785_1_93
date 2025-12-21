package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.service.UserService;

import com.example.demo.entity.UserEntity;

import com.example.demo.repository.UserRepository;


@Service


public class UserServiceImpl implements UserService{
    @Autowired UserRepository student;


    @Override
    public UserEntity GetData(int id){
        return student.findById(id).orElse(null);
    }
}