package com.repair.mart.core.controller.api;


import com.repair.mart.core.dto.Ram;

import java.util.List;

public interface RamControllerApi{
    List<Ram> getAllRams();

    Ram getRamById(Long id);

    Ram createRam();

    Ram updateRam(Long id);

    void deleteRam(Long id);
}
