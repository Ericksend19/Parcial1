package com.erickalcon.parcial1.Services;

import com.erickalcon.parcial1.Entities.EmpleadoEntity;
import com.erickalcon.parcial1.Entities.Interfaces.ConsultarInterface;
import com.erickalcon.parcial1.Entities.Interfaces.RegistrarInterface;
import com.erickalcon.parcial1.Repositories.EmpleadoRepository;
import java.util.List;

public class EmpleadoService implements RegistrarInterface<EmpleadoEntity>, ConsultarInterface<EmpleadoEntity> {

    private final EmpleadoRepository repo;

    public EmpleadoService(EmpleadoRepository repo) {
        this.repo = repo;
    }

    @Override
    public boolean registrar(EmpleadoEntity entidad) {
        return repo.save(entidad);
    }

    @Override
    public EmpleadoEntity obtenerPorId(String id) {
        return repo.findById(id);
    }

    @Override
    public List<EmpleadoEntity> obtenerTodos() {
        return repo.findAll();
    }
}
