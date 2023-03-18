package com.repair.mart.core.controller.impl;

import com.repair.mart.core.dto.Ram;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ram")
public class RamRestControllerImpl {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Ram>> getAllRam() {
        List<Ram> ramList = new ArrayList<>();
        ramList.add(new Ram(1L, "ram1", "kingston", "4GHz"));
        ramList.add(new Ram(2L, "ram2", "kingston", "8GHz"));
        ramList.add(new Ram(3L, "ram3", "kingston", "12GHz"));
        return ResponseEntity.ok(ramList);
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Ram> getRamById() {
        return ResponseEntity.ok(new Ram(3L, "ram3", "kingston", "12GHz"));
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Ram> createRam(Ram ram){
        return ResponseEntity.ok(new Ram(3L, "ram3", "kingston", "12GHz"));
    }

    @DeleteMapping(path = "{/id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Ram> deleteRam(Long id){
        return ResponseEntity.ok(new Ram(3L, "ram3", "kingston", "12GHz"));
    }

    @PutMapping(path = "{/id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Ram> updateRam(Long id){
        return ResponseEntity.ok(new Ram(3L, "ram3", "kingston", "12GHz"));
    }
}
