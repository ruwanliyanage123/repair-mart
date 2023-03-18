package com.repair.mart.core.controller.impl;

import com.repair.mart.core.controller.api.RamControllerApi;
import com.repair.mart.core.dto.Ram;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ram")
public class RamRestControllerImpl implements RamControllerApi {

    @GetMapping("/rams")
    @Override
    public List<Ram> getAllRams() {
        return Arrays.asList(new Ram(), new Ram());
    }

    @GetMapping("/rams/{id}")
    @Override
    public Ram getRamById(Long id) {
        return new Ram(2L,"get by id ram", "kingston", "4GHz");
    }

    @Override
    public Ram createRam() {
        return new Ram(2L,"created ram", "kingston", "4GHz");
    }

    @Override
    public Ram updateRam(Long id) {
        return new Ram(2L,"updated ram", "kingston", "4GHz");
    }

    @Override
    public void deleteRam(Long id) {
        System.out.println("deleted");
    }
}
