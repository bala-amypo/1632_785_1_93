package com.example.demo.model;

public class InteractionCheckResult {

    private String medications;
    private String interactions;

    // EXISTING no-arg constructor
    public InteractionCheckResult() {
    }

    // EXISTING single-arg constructor (do not remove)
    public InteractionCheckResult(String message) {
        this.interactions = message;
    }

    // ✅ REQUIRED by tests (ADD THIS)
    public InteractionCheckResult(String medications, String interactions) {
        this.medications = medications;
        this.interactions = interactions;
    }

    // getters & setters
    public String getMedications() {
        return medications;
    }

    public void setMedications(String medications) {
        this.medications = medications;
    }

    public String getInteractions() {
        return interactions;
    }

    public void setInteractions(String interactions) {
        this.interactions = interactions;
    }
}
