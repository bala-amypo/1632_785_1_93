package com.example.demo.model;

public class ActiveIngredient {

    private Long id;

    // REQUIRED BY TESTS
    private String name;

    // No-arg constructor (MANDATORY)
    public ActiveIngredient() {
    }

    // Constructor used by tests
    public ActiveIngredient(String name) {
        this.name = name;
    }

    // Existing getters/setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // REQUIRED BY TESTS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}