package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.DireccionSocioNegocio;
import com.borge.service_taller_donald.entities.DireccionSucursal;
import com.borge.service_taller_donald.repositories.DireccionSucursalRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceDireccionSucursal implements IServiceDireccionSucursal{
    DireccionSucursalRepository direccionSucursalRepository;

    @Transactional(readOnly = true)
    @Override
    public List<DireccionSucursal> findAll() {
        return direccionSucursalRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public DireccionSucursal findById(Integer id) {
        return direccionSucursalRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public DireccionSucursal create(DireccionSucursal direccionSucursal) {
        return direccionSucursalRepository.save(direccionSucursal);
    }

    @Override
    @Transactional
    public DireccionSucursal updated(DireccionSucursal direccionSucursal, Integer id) {
        return direccionSucursalRepository.save(direccionSucursal);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        direccionSucursalRepository.deleteById(id);
    }
}
