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

    // ===== EXISTING METHODS (KEEP AS IS) =====

    @Override
    public InteractionRule getRuleById(Long id) {
        return interactionRuleRepository.findById(id).orElse(null);
    }

    // ===== REQUIRED BY INTERFACE (ADDED METHODS) =====

    @Override
    public InteractionRule addRule(InteractionRule rule) {
        return interactionRuleRepository.save(rule);
    }

    @Override
    public List<InteractionRule> getAllRules() {
        return interactionRuleRepository.findAll();
    }
}