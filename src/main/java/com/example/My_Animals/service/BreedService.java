package com.example.My_Animals.service;

import com.example.My_Animals.model.Breed;
import com.example.My_Animals.repository.BreedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BreedService {

    @Autowired
    private BreedRepository breedRepository;

    public List<Breed> findAll() {
        return breedRepository.findAll();
    }

    public Optional<Breed> findById(String id) {
        return breedRepository.findById(id);
    }

    public Breed save(Breed breed) {
        return breedRepository.save(breed);
    }

    public void deleteById(String id) {
        breedRepository.deleteById(id);
    }
}
