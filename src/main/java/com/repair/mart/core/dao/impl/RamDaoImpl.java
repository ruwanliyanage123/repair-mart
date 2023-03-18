package com.repair.mart.core.dao.impl;

import com.repair.mart.core.dao.InternalDatabase;
import com.repair.mart.core.dao.api.RamDaoApi;
import com.repair.mart.core.dto.Ram;

import java.util.ArrayList;
import java.util.List;

public class RamDaoImpl implements RamDaoApi {

    @Override
    public List<Ram> getAllRams() {
        return new ArrayList<>(InternalDatabase.getInstance().getRamTable().values());
    }

    @Override
    public Ram getRamById(Long id) {
        return InternalDatabase.getInstance().getRamTable().get(id);
    }

    @Override
    public Ram createRam(Ram ram) {
        InternalDatabase.getInstance().getRamTable().put(ram.getId(), ram);
        return ram;
    }

    @Override
    public Ram updateRam(Long id, Ram ram) {
        InternalDatabase.getInstance().getRamTable().put(id,ram);
        return ram;
    }

    @Override
    public void deleteRam(Long id) {
        InternalDatabase.getInstance().getRamTable().remove(id);
    }
}
