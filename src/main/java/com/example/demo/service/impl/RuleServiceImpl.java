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
    private InteractionRuleRepository ruleRepository;

    // ✅ REQUIRED BY INTERFACE
    @Override
    public InteractionRule addRule(InteractionRule rule) {
        return ruleRepository.save(rule);
    }

    // ✅ REQUIRED BY INTERFACE
    @Override
    public List<InteractionRule> getAllRules() {
        return ruleRepository.findAll();
    }

    // ❌ NOT in interface → NO @Override
    public InteractionRule getRuleById(Long id) {
        return ruleRepository.findById(id).orElse(null);
    }
}
