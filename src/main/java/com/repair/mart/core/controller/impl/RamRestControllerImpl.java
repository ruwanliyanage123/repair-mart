package com.repair.mart.core.controller.impl;

import com.repair.mart.core.dto.Ram;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rams")
public class RamRestControllerImpl{

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Ram> getRam() {
        return ResponseEntity.ok(new Ram(2L, "get by id ram", "kingston", "4GHz"));
    }
}
