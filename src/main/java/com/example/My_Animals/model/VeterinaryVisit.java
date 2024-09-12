package com.example.My_Animals.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Entity
@Table(name = "veterinary_visit")
@Data
@NoArgsConstructor
public class VeterinaryVisit {
    @Id
    private String id;
    private Date lastVisitDate;
    private Date nextVisitDate;

    @ManyToOne
    @JoinColumn(name = "animal_id", nullable = false)
    private Animal animal;
}