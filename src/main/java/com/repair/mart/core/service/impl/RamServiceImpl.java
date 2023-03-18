package com.repair.mart.core.service.impl;

import com.repair.mart.core.dao.api.RamDaoApi;
import com.repair.mart.core.dto.Ram;
import com.repair.mart.core.service.api.RamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class RamServiceImpl implements RamService {
    @Autowired
    @Qualifier("com.repair.mart.core.dao.impl.RamDaoImpl")
    private RamDaoApi ramDao;

    @Override
    public List<Ram> getAllRams() {
        return ramDao.getAllRams();
    }

    @Override
    public Ram getRamById(Long id) {
        return ramDao.getRamById(id);
    }

    @Override
    public Ram createRam(Ram ram) {
        return ramDao.createRam(ram);
    }

    @Override
    public Ram updateRam(Long id, Ram ram) {
        return ramDao.updateRam(id, ram);
    }

    @Override
    public void deleteRam(Long id) {
        ramDao.deleteRam(id);
    }
}
