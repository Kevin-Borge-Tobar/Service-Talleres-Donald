package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Nomina;
import com.borge.service_taller_donald.entities.TipoMovimiento;
import com.borge.service_taller_donald.repositories.TipoMovimientoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceTipoMovimiento implements IServiceTipoMovimiento{
    private TipoMovimientoRepository tipoMovimientoRepository;

    @Transactional(readOnly = true)
    @Override
    public List<TipoMovimiento> findAll() {
        return tipoMovimientoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public TipoMovimiento findById(Integer id) {
        return tipoMovimientoRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public TipoMovimiento create(TipoMovimiento tipoMovimiento) {
        return tipoMovimientoRepository.save(tipoMovimiento);
    }

    @Override
    @Transactional
    public TipoMovimiento updated(TipoMovimiento tipoMovimiento, Integer id) {
        return tipoMovimientoRepository.save(tipoMovimiento);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        tipoMovimientoRepository.deleteById(id);
    }
}
