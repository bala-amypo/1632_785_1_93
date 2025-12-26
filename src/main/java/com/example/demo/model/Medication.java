package com.example.demo.model;

import java.util.Set;

public class Medication {

    private Long id;

    // EXISTING (do not remove)
    private Set<ActiveIngredient> activeIngredients;

    // REQUIRED BY TESTS
    private String medication;
    private String ingredients;

    public Medication() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // EXISTING LOGIC (keep)
    public Set<ActiveIngredient> getActiveIngredients() {
        return activeIngredients;
    }

    public void setActiveIngredients(Set<ActiveIngredient> activeIngredients) {
        this.activeIngredients = activeIngredients;
    }

    // REQUIRED BY TESTS
    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    // REQUIRED BY TESTS
    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
}