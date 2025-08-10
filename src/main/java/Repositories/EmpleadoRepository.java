package com.erickalcon.parcial1.Repositories;

import com.erickalcon.parcial1.Entities.EmpleadoEntity;
import java.util.*;

public class EmpleadoRepository {
    private final Map<String, EmpleadoEntity> data = new HashMap<>();

    public boolean save(EmpleadoEntity e) {
        if (e == null || e.getId() == null || data.containsKey(e.getId())) return false;
        data.put(e.getId(), e);
        return true;
    }

    public EmpleadoEntity findById(String id) { return data.get(id); }

    public List<EmpleadoEntity> findAll() { return new ArrayList<>(data.values()); }
}
