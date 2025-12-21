package com.example.demo.model;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;

import jakarta.persistence.Entity;
@Entity
@Table(name="medications")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Medication{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name= "ingredient_name")
    private Set<String> ingredients = new HashSet<>();

    public Medications(String name){
        this.name=name;
        this.ingrediens=new HashSet<>();
    }

    public void addIngredient(String ingredient){
        this.ingredients.add(ingredient);
    }
     public void removeIngredient(String ingredient){
        this.ingredients.remove(ingredient);
    }

}
