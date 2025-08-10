package com.erickalcon.parcial1.Entities;

public class EmpleadoEntity extends PersonaEntity {
    private String puesto;

    public EmpleadoEntity(String id, String nombre, String puesto) {
        super(id, nombre);
        this.puesto = puesto;
    }

    public String getPuesto() { return puesto; }
}
