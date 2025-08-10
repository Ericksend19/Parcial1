package com.erickalcon.parcial1.Repositories;

import com.erickalcon.parcial1.Entities.ClienteEntity;
import java.util.*;

public class ClienteRepository {
    private final Map<String, ClienteEntity> data = new HashMap<>();

    public boolean save(ClienteEntity c) {
        if (c == null || c.getId() == null || data.containsKey(c.getId())) return false;
        data.put(c.getId(), c);
        return true;
    }

    public ClienteEntity findById(String id) { return data.get(id); }

    public List<ClienteEntity> findAll() { return new ArrayList<>(data.values()); }
}
