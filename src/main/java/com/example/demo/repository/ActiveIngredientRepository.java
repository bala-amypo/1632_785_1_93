// package com.example.demo.repository;

// import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;

// import com.example.demo.model.ActiveIngredient;

// @Repository
// public interface ActiveIngredientRepository extends JpaRepository<ActiveIngredient, Long> {

//     boolean existsByName(String name);
// }



package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ActiveIngredient;

@Repository
public interface ActiveIngredientRepository extends JpaRepository<ActiveIngredient, Long> {

    boolean existsByName(String name);

    Optional<ActiveIngredient> findByName(String name);
}
