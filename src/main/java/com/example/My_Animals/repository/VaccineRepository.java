package com.example.My_Animals.repository;

import com.example.My_Animals.model.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccineRepository extends JpaRepository<Vaccine, String> {
}
