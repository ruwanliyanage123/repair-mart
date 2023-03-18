package com.repair.mart.core.dao;

import com.repair.mart.core.dto.Ram;

import java.util.HashMap;
import java.util.Map;

public final class InternalDatabase {
    private final Map<Long, Ram> ramTable = new HashMap<>();

    private InternalDatabase(){
    }

    private static final class InternalDatabaseLazyLoader{
        public static final InternalDatabase INSTANCE = new InternalDatabase();
    }

    public static InternalDatabase getInstance(){
        return InternalDatabaseLazyLoader.INSTANCE;
    }

    public Map<Long, Ram> getRamTable(){
        return ramTable;
    }
}
