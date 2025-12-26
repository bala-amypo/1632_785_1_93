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

    // EXISTING METHODS — keep them

    // ✅ REQUIRED by interface (ADD THIS)
    @Override
    public List<Medication> getAllMedications() {
        return medicationRepository.findAll();
    }
}
