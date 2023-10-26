package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.DetalleNomina;
import com.borge.service_taller_donald.entities.Nomina;
import com.borge.service_taller_donald.repositories.NominaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceNomina implements IServiceNomina{
    private NominaRepository nominaRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Nomina> findAll() {
        return nominaRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Nomina findById(Integer id) {
        return nominaRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Nomina create(Nomina nomina) {
        return nominaRepository.save(nomina);
    }

    @Override
    @Transactional
    public Nomina updated(Nomina nomina, Integer id) {
        return nominaRepository.save(nomina);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        nominaRepository.deleteById(id);
    }
}
