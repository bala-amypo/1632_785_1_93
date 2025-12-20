package com.example.demo.entity;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class User{

    private Long id;
    private String name;
    private String email;
    private String password;
    private String role;  

}
