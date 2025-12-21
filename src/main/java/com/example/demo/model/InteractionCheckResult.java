package com.example.demo.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name "interaction_check_results")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class InteractionCheckResult{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String medications;
    private String interaction;
    private LocalDateTime checkedAt;

    public InteractionCheckResult(String medications,String interactions){
        this.medications=medications;
        this.interactions=interactions;
    }

    @PrePersist
    public void setCheckedAt(){
        this.CheckedAt = 
    }

}