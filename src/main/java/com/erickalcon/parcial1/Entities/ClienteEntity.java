package com.erickalcon.parcial1.Entities;

public class ClienteEntity extends PersonaEntity {
    private String carnetBiblioteca;

    public ClienteEntity(String id, String nombre, String carnetBiblioteca) {
        super(id, nombre);
        this.carnetBiblioteca = carnetBiblioteca;
    }

    public String getCarnetBiblioteca() { return carnetBiblioteca; }
}
