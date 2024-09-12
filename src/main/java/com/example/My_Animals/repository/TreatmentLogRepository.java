package com.example.My_Animals.repository;

import com.example.My_Animals.model.TreatmentLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreatmentLogRepository extends JpaRepository<TreatmentLog, String> {
}
