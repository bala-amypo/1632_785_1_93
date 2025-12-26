// package com.example.demo.model;

// import java.time.LocalDateTime;

// import jakarta.persistence.Entity;
// import jakarta.persistence.Table;
// import jakarta.persistence.Id;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Column;
// import jakarta.persistence.PrePersist;

// import lombok.Data;
// import lombok.AllArgsConstructor;
// import lombok.NoArgsConstructor;
// @Entity
// @Table(name = "interaction_check_results")
// @Data
// @AllArgsConstructor
// @NoArgsConstructor
// public class InteractionCheckResult {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;
//     @Column(nullable=false)
//     private String medications;

//     @Column(columnDefinition = "TEXT")
//     private String interactions;

//     private LocalDateTime checkedAt;

    

//     public InteractionCheckResult(String medications, String interactions) {
//         this.medications = medications;
//         this.interactions = interactions;
//     }

//     @PrePersist
//     public void checkedAt () {
//         this.checkedAt = LocalDateTime.now();
//     } 
// }




// package com.example.demo.model;

// import java.time.LocalDateTime;

// import jakarta.persistence.Entity;
// import jakarta.persistence.Table;
// import jakarta.persistence.Id;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Column;

// import lombok.Data;
// import lombok.NoArgsConstructor;

// @Entity
// @Table(name = "interaction_check_results")
// @Data
// @NoArgsConstructor
// public class InteractionCheckResult {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     @Column(nullable = false)
//     private String medications;

//     @Column(columnDefinition = "TEXT")
//     private String interactions;

//     // ✅ Must NOT be null even without saving
//     private LocalDateTime checkedAt = LocalDateTime.now();

//     // ✅ Constructor used in test cases
//     public InteractionCheckResult(String medications, String interactions) {
//         this.medications = medications;
//         this.interactions = interactions;
//         this.checkedAt = LocalDateTime.now();
//     }
// }










@Entity
@Table(name = "interaction_check_results")
public class InteractionCheckResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String medications;

    @Column(columnDefinition = "TEXT")
    private String interactions;

    private LocalDateTime checkedAt;

    public InteractionCheckResult() {
        this.checkedAt = LocalDateTime.now();
    }

    public InteractionCheckResult(String medications, String interactions) {
        this.medications = medications;
        this.interactions = interactions;
        this.checkedAt = LocalDateTime.now();
    }

    // getters/setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getMedications() { return medications; }
    public void setMedications(String medications) { this.medications = medications; }

    public String getInteractions() { return interactions; }
    public void setInteractions(String interactions) { this.interactions = interactions; }

    public LocalDateTime getCheckedAt() { return checkedAt; }
    public void setCheckedAt(LocalDateTime checkedAt) { this.checkedAt = checkedAt; }
}
