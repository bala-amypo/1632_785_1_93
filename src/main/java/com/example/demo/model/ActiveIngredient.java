package com.example.demo.model;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name="active_ingredients")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ActiveIngredient{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String name;  

    public ActiveIngredient(String name){
        this.name=name;
    }
}


// package com.example.demo.model;

// import java.util.Set;

// import jakarta.persistence.Entity;
// import jakarta.persistence.Table;
// import jakarta.persistence.Id;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Column;
// import jakarta.persistence.ManyToMany;

// @Entity
// @Table(name = "active_ingredients")
// public class ActiveIngredient {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     @Column(unique = true)
//     private String name;

//     @ManyToMany(mappedBy = "ingredients")
//     private Set<Medication> med;
// }