package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.InteractionRule;
import com.example.demo.repository.InteractionRuleRepository;
import com.example.demo.service.RuleService;

@Service
public class RuleServiceImpl implements RuleService {

    @Autowired
    private InteractionRuleRepository interactionRuleRepository;

    // EXISTING METHODS — keep them

    // ✅ REQUIRED by interface (ADD THIS)
    @Override
    public List<InteractionRule> getAllRules() {
        return interactionRuleRepository.findAll();
    }
}
