package com.example.My_Animals.repository;

import com.example.My_Animals.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, String> {
}
