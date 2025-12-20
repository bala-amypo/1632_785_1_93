package com.example.demo.entity;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class User{
    @Id
    @Entity

    private Long id;
    private String name;
    @Column(name="email" unique = true)
    private String email;
    private String password;
    private String role;  

}
