package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.InteractionRule;
import com.example.demo.model.ActiveIngredient;
public interface InteractionRuleRepository extends JpaRepository<InteractionRule, Long> {
        List<InteractionRule> findByIngredientA_Id(Long ingredientId);
}

