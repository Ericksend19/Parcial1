package com.erickalcon.parcial1.Services;

import com.erickalcon.parcial1.Entities.ClienteEntity;
import com.erickalcon.parcial1.Entities.Interfaces.ConsultarInterface;
import com.erickalcon.parcial1.Entities.Interfaces.RegistrarInterface;
import com.erickalcon.parcial1.Repositories.ClienteRepository;
import java.util.List;

public class ClienteService implements RegistrarInterface<ClienteEntity>, ConsultarInterface<ClienteEntity> {

    private final ClienteRepository repo;

    public ClienteService(ClienteRepository repo) {
        this.repo = repo;
    }

    @Override
    public boolean registrar(ClienteEntity entidad) {
        return repo.save(entidad);
    }

    @Override
    public ClienteEntity obtenerPorId(String id) {
        return repo.findById(id);
    }

    @Override
    public List<ClienteEntity> obtenerTodos() {
        return repo.findAll();
    }
}
