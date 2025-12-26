package com.example.demo.model;

public class InteractionRule {

    private Long id;

    // REQUIRED BY TESTS
    private String rule;

    public InteractionRule() {
    }

    public InteractionRule(String rule) {
        this.rule = rule;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // REQUIRED BY TESTS
    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }
}