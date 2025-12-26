package com.example.demo.model;

public class InteractionCheckResult {

    private Long id;

    // REQUIRED BY TESTS
    private String result;

    public InteractionCheckResult() {
    }

    public InteractionCheckResult(String result) {
        this.result = result;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // REQUIRED BY TESTS
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}