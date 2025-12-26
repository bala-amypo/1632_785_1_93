// package com.example.demo.model;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.ManyToOne;
// import jakarta.persistence.Table;

// import lombok.Data;
// import lombok.NoArgsConstructor;

// @Entity
// @Table(name = "interaction_rules")
// @Data
// @NoArgsConstructor
// public class InteractionRule {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     @ManyToOne
//     private ActiveIngredient ingredientA;

//     @ManyToOne
//     private ActiveIngredient ingredientB;

//     private String severity;
//     private String description;

//     // ✅ Constructor REQUIRED by test cases (WITHOUT id)
//     public InteractionRule(ActiveIngredient ingredientA,
//                            ActiveIngredient ingredientB,
//                            String severity,
//                            String description) {
//         this.ingredientA = ingredientA;
//         this.ingredientB = ingredientB;
//         this.severity = severity;
//         this.description = description;
//     }
// }


@Entity
@Table(name = "interaction_rules")
public class InteractionRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private ActiveIngredient ingredientA;

    @ManyToOne
    private ActiveIngredient ingredientB;

    private String severity;
    private String description;

    public InteractionRule() {}

    public InteractionRule(ActiveIngredient a, ActiveIngredient b,
                           String severity, String description) {
        this.ingredientA = a;
        this.ingredientB = b;
        this.severity = severity;
        this.description = description;
    }

    // getters/setters
    public String getSeverity() { return severity; }
    public void setSeverity(String severity) { this.severity = severity; }

    public ActiveIngredient getIngredientA() { return ingredientA; }
    public ActiveIngredient getIngredientB() { return ingredientB; }
}
