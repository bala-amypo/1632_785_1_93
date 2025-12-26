// package com.example.demo.model;

// import jakarta.persistence.Entity;
// import jakarta.persistence.Table;
// import jakarta.persistence.Id;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Column;

// import lombok.Data;
// import lombok.AllArgsConstructor;
// import lombok.NoArgsConstructor;

// @Entity
// @Table(name = "active_ingredients")
// @Data
// @AllArgsConstructor
// @NoArgsConstructor
// public class ActiveIngredient {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     @Column(unique = true)
//     private String name;

    
//     public ActiveIngredient(String name) {
//         this.name = name;
//     }
// }




// package com.example.demo.model;

// import jakarta.persistence.Entity;
// import jakarta.persistence.Table;
// import jakarta.persistence.Id;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Column;

// import lombok.Data;
// import lombok.NoArgsConstructor;

// @Entity
// @Table(name = "active_ingredients")
// @Data
// @NoArgsConstructor
// public class ActiveIngredient {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     @Column(unique = true)
//     private String name;

//     // Constructor used in test cases
//     public ActiveIngredient(String name) {
//         this.name = name;
//     }
// }



@Entity
@Table(name = "active_ingredients")
public class ActiveIngredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    public ActiveIngredient() {}

    public ActiveIngredient(String name) {
        this.name = name;
    }

    // getters/setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
