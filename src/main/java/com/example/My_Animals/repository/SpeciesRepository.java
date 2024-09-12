package com.example.My_Animals.repository;

import com.example.My_Animals.model.Species;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeciesRepository extends JpaRepository<Species, String> {
}
