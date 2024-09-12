package com.example.My_Animals.service;

import com.example.My_Animals.model.AnimalTreatment;
import com.example.My_Animals.repository.AnimalTreatmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalTreatmentService {

    @Autowired
    private AnimalTreatmentRepository animalTreatmentRepository;

    public List<AnimalTreatment> findAll() {
        return animalTreatmentRepository.findAll();
    }

    public Optional<AnimalTreatment> findById(String id) {
        return animalTreatmentRepository.findById(id);
    }

    public AnimalTreatment save(AnimalTreatment animalTreatment) {
        return animalTreatmentRepository.save(animalTreatment);
    }

    public void deleteById(String id) {
        animalTreatmentRepository.deleteById(id);
    }
}
