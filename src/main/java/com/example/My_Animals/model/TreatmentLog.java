package com.example.My_Animals.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import java.util.Date;
import lombok.Data;

@Entity
@Table(name = "treatment_log")
@Data
@NoArgsConstructor
public class TreatmentLog {
    @Id
    private String id;
    private Date nextDueDate;

    @ManyToOne
    @JoinColumn(name = "animal_treatment_id", nullable = false)
    private AnimalTreatment animalTreatment;

    @ManyToOne
    @JoinColumn(name = "treatment_id", nullable = false)
    private Treatment treatment;
}