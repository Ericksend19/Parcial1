package com.erickalcon.parcial1.Entities.Interfaces;

import java.util.List;

public interface ConsultarInterface<T> {
    T obtenerPorId(String id);
    List<T> obtenerTodos();
}
