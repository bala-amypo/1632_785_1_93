// package com.example.demo.controller;
// import java.util.List;

// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;

// import com.example.demo.model.InteractionRule;
// import com.example.demo.service.RuleService;

// @RestController
// public class RuleController {

//     private final RuleService ruleService;

//     public RuleController(RuleService ruleService) {
//         this.ruleService = ruleService;
//     }

//     @PostMapping("/rules")
//     public InteractionRule addRule(
//             @RequestBody InteractionRule rule) {
//         return ruleService.addRule(rule);
//     }

//     @GetMapping("/rules")
//     public List<InteractionRule> getAllRules() {
//         return ruleService.getAllRules();
//     }
// }




package com.example.demo.controller;

import com.example.demo.model.InteractionRule;
import com.example.demo.service.RuleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rules")
@Tag(name = "Rules", description = "Manage Drug-to-Drug Interaction Rules")
public class RuleController {

    private final RuleService ruleService;

    public RuleController(RuleService ruleService) {
        this.ruleService = ruleService;
    }

    @PostMapping
    @Operation(summary = "Add a new interaction rule")
    public ResponseEntity<InteractionRule> addRule(@RequestBody InteractionRule rule) {
        return ResponseEntity.ok(ruleService.addRule(rule));
    }

    @GetMapping
    @Operation(summary = "List all interaction rules")
    public ResponseEntity<List<InteractionRule>> getAllRules() {
        return ResponseEntity.ok(ruleService.getAllRules());
    }
}