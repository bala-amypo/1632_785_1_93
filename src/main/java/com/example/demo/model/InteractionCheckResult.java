// package com.example.demo.model;

// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import lombok.Data;
// import lombok.AllArgsConstructor;
// import lombok.NoArgsConstructor;
// import jakarta.persistence.Id;
// import jakarta.persistence.Column;
// import jakarta.persistence.PrePersist;
// import java.time.LocalDateTime;
// import jakarta.persistence.Entity;
// import jakarta.persistence.Table;
// @Entity
// @Table(name "interaction_check_results")
// @Data
// @AllArgsConstructor
// @NoArgsConstructor

// public class InteractionCheckResult{
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;
//     private String medications;
//     @Column(columnDefinition = "TEXT")
//     private String interaction;
//     private LocalDateTime checkedAt;

//     public InteractionCheckResult(String medications,String interactions){
//         this.medications=medications;
//         this.interactions=interactions;
//     }

//     @PrePersist
//     public void setCheckedAt(){
//         this.CheckedAt =  LocalDateTime.now();
//     }

// }

package com.example.demo.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.PrePersist;

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
    }

    public InteractionCheckResult(String medications, String interactions) {
        this.medications = medications;
        this.interactions = interactions;
    }

    @PrePersist
    public void onCreate() {
        this.checkedAt = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public String getMedications() {
        return medications;
    }

    public void setMedications(String medications) {
        this.medications = medications;
    }

    public String getInteractions() {
        return interactions;
    }

    public void setInteractions(String interactions) {
        this.interactions = interactions;
    }

    public LocalDateTime getCheckedAt() {
        return checkedAt;
    }
}