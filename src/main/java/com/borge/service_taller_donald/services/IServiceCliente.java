package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Asistencia;
import com.borge.service_taller_donald.entities.Cliente;

import java.util.List;

public interface IServiceCliente {
    public List<Cliente> findAll();

    public Cliente findById(Integer id);

    public Cliente create(Cliente cliente);

    public Cliente updated(Cliente cliente, Integer id);

    public void deleteById(Integer id);
}
