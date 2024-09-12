package com.example.My_Animals.service;

import com.example.My_Animals.model.Allergy;
import com.example.My_Animals.repository.AllergyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AllergyService {

    @Autowired
    private AllergyRepository allergyRepository;

    public List<Allergy> findAll() {
        return allergyRepository.findAll();
    }

    public Optional<Allergy> findById(String id) {
        return allergyRepository.findById(id);
    }

    public Allergy save(Allergy allergy) {
        return allergyRepository.save(allergy);
    }

    public void deleteById(String id) {
        allergyRepository.deleteById(id);
    }
}
