package com.example.My_Animals_Back.service;

import com.example.My_Animals_Back.model.Animal;
import com.example.My_Animals_Back.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public List<Animal> findAll() {
        return animalRepository.findAll();
    }

    public Optional<Animal> findById(String id) {
        return animalRepository.findById(id);
    }

    public Animal save(Animal animal) {
        // Assurez-vous que la race appartient à l'espèce spécifiée
        if (animal.getBreed() != null && animal.getSpecies() != null) {
            if (!animal.getBreed().getSpecies().equals(animal.getSpecies())) {
                throw new IllegalArgumentException("La race doit appartenir à l'espèce spécifiée.");
            }
        }
        return animalRepository.save(animal);
    }

    public void deleteById(String id) {
        animalRepository.deleteById(id);
    }
}
