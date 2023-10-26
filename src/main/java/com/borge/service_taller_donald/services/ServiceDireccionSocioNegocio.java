package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.DetallePedido;
import com.borge.service_taller_donald.entities.DireccionSocioNegocio;
import com.borge.service_taller_donald.repositories.DireccionSocioNegocioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceDireccionSocioNegocio implements IServiceDireccionSocioNegocio{
    DireccionSocioNegocioRepository direccionSocioNegocioRepository;

    @Transactional(readOnly = true)
    @Override
    public List<DireccionSocioNegocio> findAll() {
        return direccionSocioNegocioRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public DireccionSocioNegocio findById(Integer id) {
        return direccionSocioNegocioRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public DireccionSocioNegocio create(DireccionSocioNegocio direccionSocioNegocio) {
        return direccionSocioNegocioRepository.save(direccionSocioNegocio);
    }

    @Override
    @Transactional
    public DireccionSocioNegocio updated(DireccionSocioNegocio direccionSocioNegocio, Integer id) {
        return direccionSocioNegocioRepository.save(direccionSocioNegocio);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        direccionSocioNegocioRepository.deleteById(id);
    }
}
