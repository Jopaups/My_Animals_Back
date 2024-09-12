package com.example.My_Animals.service;

import com.example.My_Animals.model.Species;
import com.example.My_Animals.repository.SpeciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpeciesService {

    @Autowired
    private SpeciesRepository speciesRepository;

    public List<Species> findAll() {
        return speciesRepository.findAll();
    }

    public Optional<Species> findById(String id) {
        return speciesRepository.findById(id);
    }

    public Species save(Species species) {
        return speciesRepository.save(species);
    }

    public void deleteById(String id) {
        speciesRepository.deleteById(id);
    }
}
