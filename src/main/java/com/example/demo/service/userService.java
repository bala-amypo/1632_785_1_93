package com.example.demo.service;

import com.example.demo.model.UserModel;

import java.util.List;

public interface userService{

    //method declarations

    UserModel postData(UserModel stu);     

    List<UserModel>getAllData();

    String DeleteData(int id);

    UserModel GetData(int id);

    UserModel updateData(int id,UserModely entity);


}
