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