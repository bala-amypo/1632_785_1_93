package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.InteractionRule;

public interface InteractionRuleRepository extends JpaRepository<InteractionRule, Long> {
        List<InteractionRule> findByIngredientId(Long ingredientId);
}