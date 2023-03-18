package com.repair.mart.core.service.api;

import com.repair.mart.core.dto.Ram;

import java.util.List;

public interface RamService {
    /**
     * Get all Rams
     * @return all rams
     */
    List<Ram> getAllRams();

    /**
     * Get Ram by id
     * @param id id of the ram
     * @return ram by id
     */
    Ram getRamById(Long id);

    /**
     * Create Ram
     * @param ram ram need to crate
     * @return ram by id
     */
    Ram createRam(Ram ram);

    /**
     * Update Ram by id
     * @param id id of the ram
     * @return updated ram
     */
    Ram updateRam(Long id);

    /**
     * Delete ram by id
     * @param id id of the ram
     */
    void deleteRam(Long id);
}
