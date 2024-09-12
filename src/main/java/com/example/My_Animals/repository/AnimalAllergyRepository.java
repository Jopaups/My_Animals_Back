package com.example.My_Animals.repository;

import com.example.My_Animals.model.AnimalAllergy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalAllergyRepository extends JpaRepository<AnimalAllergy, String> {
}
