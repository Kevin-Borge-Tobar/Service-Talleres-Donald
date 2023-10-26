package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Nomina;
import com.borge.service_taller_donald.entities.TipoDireccion;
import com.borge.service_taller_donald.repositories.TipoDireccionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceTipoDireccion implements IServiceTipoDireccion{
    private TipoDireccionRepository tipoDireccionRepository;

    @Transactional(readOnly = true)
    @Override
    public List<TipoDireccion> findAll() {
        return tipoDireccionRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public TipoDireccion findById(Integer id) {
        return tipoDireccionRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public TipoDireccion create(TipoDireccion tipoDireccion) {
        return tipoDireccionRepository.save(tipoDireccion);
    }

    @Override
    @Transactional
    public TipoDireccion updated(TipoDireccion tipoDireccion, Integer id) {
        return tipoDireccionRepository.save(tipoDireccion);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        tipoDireccionRepository.deleteById(id);
    }
}
