package com.example.My_Animals.service;

import com.example.My_Animals.model.Sex;
import com.example.My_Animals.repository.SexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SexService {

    @Autowired
    private SexRepository sexRepository;

    public List<Sex> findAll() {
        return sexRepository.findAll();
    }

    public Optional<Sex> findById(String id) {
        return sexRepository.findById(id);
    }

    public Sex save(Sex sex) {
        return sexRepository.save(sex);
    }

    public void deleteById(String id) {
        sexRepository.deleteById(id);
    }
}
