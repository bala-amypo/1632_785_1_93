package com.example.demo.model;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;

import jakarta.persistence.Entity;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class User{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;

    ----
    

}
