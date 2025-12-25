package com.example.demo.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.PrePersist;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "interaction_check_results")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InteractionCheckResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable=false)
    private String medications;

    @Column(columnDefinition = "TEXT")
    private String interactions;

    private LocalDateTime checkedAt;

    

    // public InteractionCheckResult(String medications, String interactions) {
    //     this.medications = medications;
    //     this.interactions = interactions;
    // }

    @PrePersist
    public void checkedAt () {
        this.checkedAt = LocalDateTime.now();
    } 
}