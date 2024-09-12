package com.example.My_Animals.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sex")
@Data
@NoArgsConstructor
public class Sex {
    @Id
    private String id;
    private String type;
    private String symbolUrl;
}
