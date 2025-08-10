package com.erickalcon.parcial1;

import com.erickalcon.parcial1.Entities.ClienteEntity;
import com.erickalcon.parcial1.Entities.EmpleadoEntity;
import com.erickalcon.parcial1.Repositories.ClienteRepository;
import com.erickalcon.parcial1.Repositories.EmpleadoRepository;
import com.erickalcon.parcial1.Services.ClienteService;
import com.erickalcon.parcial1.Services.EmpleadoService;

public class Main {
    public static void main(String[] args) {
        // Crear servicios con sus repositorios
        var clienteSrv  = new ClienteService(new ClienteRepository());
        var empleadoSrv = new EmpleadoService(new EmpleadoRepository());

        // Registrar algunos clientes
        clienteSrv.registrar(new ClienteEntity("C001", "Ana López", "CAR-001"));
        clienteSrv.registrar(new ClienteEntity("C002", "Luis Pérez", "CAR-002"));

        // Registrar algunos empleados
        empleadoSrv.registrar(new EmpleadoEntity("E001", "María Díaz", "Bibliotecaria"));
        empleadoSrv.registrar(new EmpleadoEntity("E002", "Carlos Gómez", "Archivista"));

        // Mostrar todos los clientes
        System.out.println("Clientes:");
        clienteSrv.obtenerTodos().forEach(System.out::println);

        // Mostrar todos los empleados
        System.out.println("\nEmpleados:");
        empleadoSrv.obtenerTodos().forEach(System.out::println);

        // Buscar un cliente por ID
        System.out.println("\nBuscar cliente C002: " + clienteSrv.obtenerPorId("C002"));

        // Buscar un empleado por ID
        System.out.println("Buscar empleado E001: " + empleadoSrv.obtenerPorId("E001"));
    }
}
