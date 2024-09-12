package com.example.My_Animals.service;

import com.example.My_Animals.model.TreatmentLog;
import com.example.My_Animals.repository.TreatmentLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TreatmentLogService {

    @Autowired
    private TreatmentLogRepository treatmentLogRepository;

    public List<TreatmentLog> findAll() {
        return treatmentLogRepository.findAll();
    }

    public Optional<TreatmentLog> findById(String id) {
        return treatmentLogRepository.findById(id);
    }

    public TreatmentLog save(TreatmentLog treatmentLog) {
        return treatmentLogRepository.save(treatmentLog);
    }

    public void deleteById(String id) {
        treatmentLogRepository.deleteById(id);
    }
}
