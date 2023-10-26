package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Nomina;
import com.borge.service_taller_donald.entities.TipoMovimientoNomina;
import com.borge.service_taller_donald.repositories.TipoMovimientoNominaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceTipoMovimientoNomina implements IServiceTipoMovimientoNomina{
    private TipoMovimientoNominaRepository tipoMovimientoNominaRepository;

    @Transactional(readOnly = true)
    @Override
    public List<TipoMovimientoNomina> findAll() {
        return tipoMovimientoNominaRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public TipoMovimientoNomina findById(Integer id) {
        return tipoMovimientoNominaRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public TipoMovimientoNomina create(TipoMovimientoNomina tipoMovimientoNomina) {
        return tipoMovimientoNominaRepository.save(tipoMovimientoNomina);
    }

    @Override
    @Transactional
    public TipoMovimientoNomina updated(TipoMovimientoNomina tipoMovimientoNomina, Integer id) {
        return tipoMovimientoNominaRepository.save(tipoMovimientoNomina);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        tipoMovimientoNominaRepository.deleteById(id);
    }
}
