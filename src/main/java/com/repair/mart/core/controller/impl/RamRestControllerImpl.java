package com.repair.mart.core.controller.impl;

import com.repair.mart.core.dto.Ram;
import com.repair.mart.core.service.api.RamServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ram")
public class RamRestControllerImpl {
    @Autowired
    @Qualifier("com.repair.mart.core.service.impl.RamServiceImpl")
    private RamServiceApi ramService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Ram>> getAllRam() {
        return ResponseEntity.ok(ramService.getAllRams());
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Ram> getRamById(@PathVariable Long id) {
        return ResponseEntity.ok(ramService.getRamById(id));
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Ram> createRam(@RequestBody Ram ram) {
        return ResponseEntity.ok(ramService.createRam(ram));
    }

    @DeleteMapping(path = "{/id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Ram> deleteRam(Long id) {
        ramService.deleteRam(id);
        return ResponseEntity.ok(null);
    }

    @PutMapping(path = "{/id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Ram> updateRam(Long id, Ram ram) {
        return ResponseEntity.ok(ramService.updateRam(id, ram));
    }
}
