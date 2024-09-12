package com.example.My_Animals.repository;

import com.example.My_Animals.model.Sex;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SexRepository extends JpaRepository<Sex, String> {
}
