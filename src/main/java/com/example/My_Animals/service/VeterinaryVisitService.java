package com.example.My_Animals.service;

import com.example.My_Animals.model.VeterinaryVisit;
import com.example.My_Animals.repository.VeterinaryVisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeterinaryVisitService {

    @Autowired
    private VeterinaryVisitRepository veterinaryVisitRepository;

    public List<VeterinaryVisit> findAll() {
        return veterinaryVisitRepository.findAll();
    }

    public Optional<VeterinaryVisit> findById(String id) {
        return veterinaryVisitRepository.findById(id);
    }

    public VeterinaryVisit save(VeterinaryVisit veterinaryVisit) {
        return veterinaryVisitRepository.save(veterinaryVisit);
    }

    public void deleteById(String id) {
        veterinaryVisitRepository.deleteById(id);
    }
}
