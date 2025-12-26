package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ActiveIngredient;
import com.example.demo.model.Medication;
import com.example.demo.repository.ActiveIngredientRepository;
import com.example.demo.repository.MedicationRepository;
import com.example.demo.service.CatalogService;

@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private ActiveIngredientRepository ingredientRepository;

    @Autowired
    private MedicationRepository medicationRepository;

    // ✅ REQUIRED BY INTERFACE
    @Override
    public ActiveIngredient addIngredient(ActiveIngredient ingredient) {
        return ingredientRepository.save(ingredient);
    }

    // ✅ REQUIRED BY INTERFACE
    @Override
    public Medication addMedication(Medication medication) {
        return medicationRepository.save(medication);
    }

    // ✅ REQUIRED BY INTERFACE
    @Override
    public List<Medication> getAllMedications() {
        return medicationRepository.findAll();
    }

    // ❌ NOT in interface → NO @Override
    public Medication getMedicationById(Long id) {
        return medicationRepository.findById(id).orElse(null);
    }
}
