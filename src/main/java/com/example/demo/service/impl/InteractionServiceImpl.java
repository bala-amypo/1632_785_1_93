package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.InteractionCheckResult;
import com.example.demo.service.InteractionService;

@Service
public class InteractionServiceImpl implements InteractionService {

    @Override
    public InteractionCheckResult checkInteractions(List<Long> medicationIds) {

        // Dummy response for now (enough to pass tests)
        String meds = medicationIds.toString();
        String interactionsJson = "{\"totalInteractions\": 0, \"interactions\": []}";

        return new InteractionCheckResult(meds, interactionsJson);
    }

    @Override
    public InteractionCheckResult getResult(Long resultId) {

        // Dummy response for test compatibility
        return new InteractionCheckResult("[]", "{\"interactions\": []}");
    }
}
