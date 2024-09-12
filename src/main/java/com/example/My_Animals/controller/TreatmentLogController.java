package com.example.My_Animals.controller;

import com.example.My_Animals.model.TreatmentLog;
import com.example.My_Animals.service.TreatmentLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/treatment-logs")
public class TreatmentLogController {

    @Autowired
    private TreatmentLogService treatmentLogService;

    @GetMapping
    public List<TreatmentLog> getAllTreatmentLogs() {
        return treatmentLogService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TreatmentLog> getTreatmentLogById(@PathVariable String id) {
        Optional<TreatmentLog> treatmentLog = treatmentLogService.findById(id);
        return treatmentLog.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<TreatmentLog> createTreatmentLog(@RequestBody TreatmentLog treatmentLog) {
        TreatmentLog savedTreatmentLog = treatmentLogService.save(treatmentLog);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedTreatmentLog);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TreatmentLog> updateTreatmentLog(@PathVariable String id, @RequestBody TreatmentLog treatmentLog) {
        if (!treatmentLogService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        treatmentLog.setId(id);
        TreatmentLog updatedTreatmentLog = treatmentLogService.save(treatmentLog);
        return ResponseEntity.ok(updatedTreatmentLog);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTreatmentLog(@PathVariable String id) {
        if (!treatmentLogService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        treatmentLogService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
