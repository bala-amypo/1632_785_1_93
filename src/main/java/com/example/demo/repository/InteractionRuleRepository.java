package com.example.demo.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.InteractionRule;
import com.example.demo.model.ActiveIngredient;
import java.util.Optional;


public interface InteractionRuleRepository extends JpaRepository<InteractionRule, Long> {
        Optional<InteractionRule>findByIngredientAAndIngredientB(ActiveIngredient ingredientA ,ActiveIngredient ingredientB);
}

