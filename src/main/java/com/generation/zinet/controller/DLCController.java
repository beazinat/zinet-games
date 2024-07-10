package com.generation.zinet.controller;

import com.generation.zinet.model.DLC;
import com.generation.zinet.repository.DLCRepository;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dlcs")
public class DLCController {

    @Autowired
    private DLCRepository dlcRepository;

    @GetMapping
    public List<DLC> getAllDLCs() {
        return dlcRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DLC> getDLCById(@PathVariable Long id) {
        return dlcRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public DLC createDLC(@RequestBody DLC dlc) {
        return dlcRepository.save(dlc);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DLC> updateDLC(@PathVariable Long id, @RequestBody DLC dlcDetails) {
        return dlcRepository.findById(id)
                .map(dlc -> {
                	BeanUtils.copyProperties(dlcDetails, dlc, "id");
                    DLC updatedDLC = dlcRepository.save(dlc);
                    return ResponseEntity.ok(updatedDLC);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteDLC(@PathVariable Long id) {
        return dlcRepository.findById(id)
                .map(dlc -> {
                    dlcRepository.delete(dlc);
                    return ResponseEntity.noContent().build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
