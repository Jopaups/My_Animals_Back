package com.example.My_Animals.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "allergy")
@Data
@NoArgsConstructor
public class Allergy {
    @Id
    private String id;
    private String name;
}
