package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Bodega;
import com.borge.service_taller_donald.entities.Cliente;
import com.borge.service_taller_donald.repositories.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceCliente implements IServiceCliente{
    private ClienteRepository clienteRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente findById(Integer id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Cliente create(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    @Transactional
    public Cliente updated(Cliente cliente, Integer id) {
        return clienteRepository.save(cliente);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        clienteRepository.deleteById(id);
    }

}
