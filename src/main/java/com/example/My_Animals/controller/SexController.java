package com.example.My_Animals.controller;

import com.example.My_Animals.model.Sex;
import com.example.My_Animals.service.SexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sex")
public class SexController {

    @Autowired
    private SexService sexService;

    @GetMapping
    public List<Sex> getAllSex() {
        return sexService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sex> getSexById(@PathVariable String id) {
        Optional<Sex> sex = sexService.findById(id);
        return sex.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Sex> createSex(@RequestBody Sex sex) {
        Sex savedSex = sexService.save(sex);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedSex);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Sex> updateSex(@PathVariable String id, @RequestBody Sex sex) {
        if (!sexService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        sex.setId(id);
        Sex updatedSex = sexService.save(sex);
        return ResponseEntity.ok(updatedSex);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSex(@PathVariable String id) {
        if (!sexService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        sexService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
