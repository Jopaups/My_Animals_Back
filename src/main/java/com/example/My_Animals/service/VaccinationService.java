package com.example.My_Animals.service;

import com.example.My_Animals.model.Vaccination;
import com.example.My_Animals.repository.VaccinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VaccinationService {

    @Autowired
    private VaccinationRepository vaccinationRepository;

    public List<Vaccination> findAll() {
        return vaccinationRepository.findAll();
    }

    public Optional<Vaccination> findById(String id) {
        return vaccinationRepository.findById(id);
    }

    public Vaccination save(Vaccination vaccination) {
        return vaccinationRepository.save(vaccination);
    }

    public void deleteById(String id) {
        vaccinationRepository.deleteById(id);
    }
}
