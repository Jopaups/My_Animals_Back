package com.example.My_Animals.service;

import com.example.My_Animals.model.Treatment;
import com.example.My_Animals.repository.TreatmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TreatmentService {

    @Autowired
    private TreatmentRepository treatmentRepository;

    public List<Treatment> findAll() {
        return treatmentRepository.findAll();
    }

    public Optional<Treatment> findById(String id) {
        return treatmentRepository.findById(id);
    }

    public Treatment save(Treatment treatment) {
        return treatmentRepository.save(treatment);
    }

    public void deleteById(String id) {
        treatmentRepository.deleteById(id);
    }
}
