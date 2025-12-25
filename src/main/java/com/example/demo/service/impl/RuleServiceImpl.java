package com.example.demo.service.impl;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.example.demo.model.InteractionRule;
import com.example.demo.model.ActiveIngredient;
import com.example.demo.repository.InteractionRuleRepository;
import com.example.demo.service.RuleService;

@Service
public class RuleServiceImpl implements RuleService {

    private final InteractionRuleRepository ruleRepository;

    public RuleServiceImpl(InteractionRuleRepository ruleRepository) {
        this.ruleRepository = ruleRepository;
    }

@Override
public InteractionRule addRule(InteractionRule rule) {
    if (!rule.getSeverity().equals("MINOR") &&!rule.getSeverity().equals("MODERATE") &&
    !rule.getSeverity().equals("MAJOR")) {

    throw new IllegalArgumentException("Invalid severity");
}

ActiveIngredient a = rule.getIngredientA();
ActiveIngredient b = rule.getIngredientB();

    Optional<InteractionRule> ruleAB =ruleRepository.findByIngredientAAndIngredientB(a, b);
    Optional<InteractionRule> ruleBA =ruleRepository.findByIngredientAAndIngredientB(b, a);
    if (ruleAB.isPresent() || ruleBA.isPresent()) {
        throw new IllegalArgumentException("Ingredient pairing already exists");
    }
    return ruleRepository.save(rule);
}

    @Override
    public List<InteractionRule> getAllRules() {
        return ruleRepository.findAll();
    }
}