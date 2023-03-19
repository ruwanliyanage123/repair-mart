package com.repair.mart.core.controller;

import com.repair.mart.core.dto.Ram;
import com.repair.mart.core.service.api.RamServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/ram")
public class RamRestController {
    @Autowired
    @Qualifier("com.repair.mart.core.service.impl.RamServiceImpl")
    private RamServiceApi ramService;

    @GetMapping()
    public ResponseEntity<List<Ram>> getAllRam() {
        return ResponseEntity.ok(ramService.getAllRams());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Ram> getRamById(@PathVariable Long id) {
        return ResponseEntity.ok(ramService.getRamById(id));
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Ram> createRam(@RequestBody Ram ram) {
        return ResponseEntity.ok(ramService.createRam(ram));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Ram> deleteRam(@PathVariable Long id) {
        ramService.deleteRam(id);
        return ResponseEntity.ok(null);
    }

    @PutMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Ram> updateRam(@PathVariable Long id, @RequestBody Ram ram) {
        return ResponseEntity.ok(ramService.updateRam(id, ram));
    }
}
