package com.example.My_Animals.repository;

import com.example.My_Animals.model.VeterinaryVisit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeterinaryVisitRepository extends JpaRepository<VeterinaryVisit, String> {
}
