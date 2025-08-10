package com.erickalcon.parcial1.Entities;

import com.erickalcon.parcial1.Entities.Interfaces.PersonaInterface;

public abstract class PersonaEntity implements PersonaInterface {
    protected String id;
    protected String nombre;

    protected PersonaEntity(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @Override public String getId() { return id; }
    @Override public String getNombre() { return nombre; }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{id='" + id + "', nombre='" + nombre + "'}";
    }
}
