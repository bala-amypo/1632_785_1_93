package com.example.demo.service;

import com.example.demo.entity.StudentEntity;

import java.util.List;

public interface StudentService{

    //method declarations

    StudentEntity postData(StudentEntity stu);     

    List<StudentEntity>getAllData();

    String DeleteData(int id);

    StudentEntity GetData(int id);

    StudentEntity updateData(int id,StudentEntity entity);


}
