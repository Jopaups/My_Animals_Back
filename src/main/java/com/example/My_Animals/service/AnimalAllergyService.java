package com.example.My_Animals.service;

import com.example.My_Animals.model.AnimalAllergy;
import com.example.My_Animals.repository.AnimalAllergyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalAllergyService {

    @Autowired
    private AnimalAllergyRepository animalAllergyRepository;

    public List<AnimalAllergy> findAll() {
        return animalAllergyRepository.findAll();
    }

    public Optional<AnimalAllergy> findById(String id) {
        return animalAllergyRepository.findById(id);
    }

    public AnimalAllergy save(AnimalAllergy animalAllergy) {
        return animalAllergyRepository.save(animalAllergy);
    }

    public void deleteById(String id) {
        animalAllergyRepository.deleteById(id);
    }
}
