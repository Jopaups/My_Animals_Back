package com.example.My_Animals.service;

import com.example.My_Animals.model.Vaccine;
import com.example.My_Animals.repository.VaccineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VaccineService {

    @Autowired
    private VaccineRepository vaccineRepository;

    public List<Vaccine> findAll() {
        return vaccineRepository.findAll();
    }

    public Optional<Vaccine> findById(String id) {
        return vaccineRepository.findById(id);
    }

    public Vaccine save(Vaccine vaccine) {
        return vaccineRepository.save(vaccine);
    }

    public void deleteById(String id) {
        vaccineRepository.deleteById(id);
    }
}
