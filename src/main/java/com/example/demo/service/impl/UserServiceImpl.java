package com.example.demo.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.service.UserService;

import com.example.demo.model.User;

import com.example.demo.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService{
    @Autowired 
    private UserRepository userRepository;

    @Override
    public User registerUser(User user){
    if(use.getRole()==null){
        user.setRole("USER");
    }
    return userRepository.save(user);
}
    @Override
    public User findByEmail(String email){
        return userRepository.findByEmail(email);

    }    
}
