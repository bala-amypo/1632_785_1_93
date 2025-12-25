package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ActiveIngredient;

@Repository
public interface ActiveIngredientRepository extends JpaRepository<ActiveIngredient, Long> {

    boolean existsByName(String name);
}