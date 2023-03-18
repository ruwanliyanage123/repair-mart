package com.repair.mart.core.controller.api;


import com.repair.mart.core.dto.Ram;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface RamControllerApi{
    List<Ram> getAllRams();

    ResponseEntity<Ram> getRamById();

    Ram createRam();

    Ram updateRam(Long id);

    void deleteRam(Long id);
}
