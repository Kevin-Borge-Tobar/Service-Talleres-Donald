package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Nomina;
import com.borge.service_taller_donald.entities.OrdenTrabajo;
import com.borge.service_taller_donald.repositories.OrdenTrabajoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceOrdenTrabajo implements IServiceOrdenTrabajo{
    private OrdenTrabajoRepository ordenTrabajoRepository;

    @Transactional(readOnly = true)
    @Override
    public List<OrdenTrabajo> findAll() {
        return ordenTrabajoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public OrdenTrabajo findById(Integer id) {
        return ordenTrabajoRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public OrdenTrabajo create(OrdenTrabajo ordenTrabajo) {
        return ordenTrabajoRepository.save(ordenTrabajo);
    }

    @Override
    @Transactional
    public OrdenTrabajo updated(OrdenTrabajo ordenTrabajo, Integer id) {
        return ordenTrabajoRepository.save(ordenTrabajo);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        ordenTrabajoRepository.deleteById(id);
    }
}
