package com.example.My_Animals.repository;

import com.example.My_Animals.model.Treatment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreatmentRepository extends JpaRepository<Treatment, String> {
}
