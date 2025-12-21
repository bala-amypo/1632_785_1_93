package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.service.StudentService;

import com.example.demo.entity.StudentEntity;

import com.example.demo.repository.StudentRepository;
import java.util.List;



@Service


public class StudentServiceImpl implements StudentService{
    @Autowired StudentRepository student;

//definition



    @Override
    public StudentEntity GetData(int id){
        return student.findById(id).orElse(null);
    }

  

}