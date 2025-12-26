// package com.example.demo.model;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import lombok.Data;
// import lombok.AllArgsConstructor;
// import lombok.NoArgsConstructor;
// import jakarta.persistence.Id;
// import jakarta.persistence.Column;
// import jakarta.persistence.Table;
// import jakarta.persistence.ElementCollection;
// import java.util.HashSet;
// import java.util.Set;

// import jakarta.persistence.Entity;
// @Entity
// @Table(name="medications")
// @Data
// @AllArgsConstructor
// @NoArgsConstructor

// public class Medication{
//     @Id
//     @GeneratedValue(strategy=GenerationType.IDENTITY)
//     private Long id;
//     private String name;
//     @Column(name= "ingredient_name")
//     @ElementCollection
//     private Set<String> ingredients = new HashSet<>();

//     public Medication(String name){
//         this.name=name;
//         this.ingredients=new HashSet<>();
//     }

//     public void addIngredient(String ingredient){
//         this.ingredients.add(ingredient);
//     }
//      public void removeIngredient(String ingredient){
//         this.ingredients.remove(ingredient);
//     }

// }



// package com.example.demo.model;

// import jakarta.persistence.Entity;
// import jakarta.persistence.Table;
// import jakarta.persistence.Id;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.ManyToMany;
// import jakarta.persistence.JoinTable;
// import jakarta.persistence.JoinColumn;

// import lombok.Data;
// import lombok.NoArgsConstructor;

// import java.util.HashSet;
// import java.util.Set;

// @Entity
// @Table(name = "medications")
// @Data
// @NoArgsConstructor
// public class Medication {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     private String name;

//     // Many-to-Many relationship required by tests
//     @ManyToMany
//     @JoinTable(
//         name = "medication_ingredients",
//         joinColumns = @JoinColumn(name = "medication_id"),
//         inverseJoinColumns = @JoinColumn(name = "ingredient_id")
//     )
//     private Set<ActiveIngredient> ingredients = new HashSet<>();

//     // Constructor used in test cases
//     public Medication(String name) {
//         this.name = name;
//         this.ingredients = new HashSet<>();
//     }

//     // Helper methods REQUIRED by tests
//     public void addIngredient(ActiveIngredient ingredient) {
//         this.ingredients.add(ingredient);
//     }

//     public void removeIngredient(ActiveIngredient ingredient) {
//         this.ingredients.remove(ingredient);
//     }
// }



@Entity
@Table(name = "medications")
public class Medication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    private Set<ActiveIngredient> ingredients = new HashSet<>();

    public Medication() {}

    public Medication(String name) {
        this.name = name;
    }

    // getters/setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Set<ActiveIngredient> getIngredients() { return ingredients; }

    public void addIngredient(ActiveIngredient ingredient) {
        this.ingredients.add(ingredient);
    }

    public void removeIngredient(ActiveIngredient ingredient) {
        this.ingredients.remove(ingredient);
    }
}
