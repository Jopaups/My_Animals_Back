package com.example.My_Animals.repository;

import com.example.My_Animals.model.Vaccination;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccinationRepository extends JpaRepository<Vaccination, String> {
}
