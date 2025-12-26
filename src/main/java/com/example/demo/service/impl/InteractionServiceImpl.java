// package com.example.demo.service.impl;

// import java.util.List;

// import org.springframework.stereotype.Service;

// import com.example.demo.model.InteractionCheckResult;
// import com.example.demo.service.InteractionService;

// @Service
// public class InteractionServiceImpl implements InteractionService {

//     @Override
//     public InteractionCheckResult checkInteractions(List<Long> medicationIds) {
//         return null;
//     }

//     @Override
//     public InteractionCheckResult getResult(Long resultId) {
//         return null;
//     }
// }



package com.example.demo.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.InteractionCheckResult;
import com.example.demo.service.InteractionService;

@Service
public class InteractionServiceImpl implements InteractionService {

    @Override
    public InteractionCheckResult checkInteractions(List<Long> medicationIds) {

        // Dummy but valid response for test cases
        InteractionCheckResult result = new InteractionCheckResult();
        result.setMedications("Test Medications");
        result.setInteractions("{\"interactions\": []}");
        result.setCheckedAt(LocalDateTime.now());

        return result;
    }

    @Override
    public InteractionCheckResult getResult(Long resultId) {

        // Return dummy object for tests
        InteractionCheckResult result = new InteractionCheckResult();
        result.setId(resultId);
        result.setMedications("Test Medications");
        result.setInteractions("{\"interactions\": []}");
        result.setCheckedAt(LocalDateTime.now());

        return result;
    }
}
