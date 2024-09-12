package com.example.My_Animals.repository;

import com.example.My_Animals.model.Breed;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BreedRepository extends JpaRepository<Breed, String> {
}
