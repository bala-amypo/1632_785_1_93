package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Medication;
import com.example.demo.repository.MedicationRepository;
import com.example.demo.service.CatalogService;

@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private MedicationRepository medicationRepository;

    // ===== EXISTING METHODS (UNCHANGED) =====

    @Override
    public Medication getMedicationById(Long id) {
        return medicationRepository.findById(id).orElse(null);
    }

    @Override
    public List<Medication> getAllMedications() {
        return medicationRepository.findAll();
    }

    // ===== REQUIRED BY INTERFACE (ADDED – DO NOT REMOVE) =====

    @Override
    public Medication addMedication(Medication medication) {
        return medicationRepository.save(medication);
    }
}
