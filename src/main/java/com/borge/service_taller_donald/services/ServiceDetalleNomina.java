package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.DetalleNomina;
import com.borge.service_taller_donald.repositories.DetalleNominaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceDetalleNomina implements IServiceDetalleNomina{
    private DetalleNominaRepository detalleNominaRepository;

    @Transactional(readOnly = true)
    @Override
    public List<DetalleNomina> findAll() {
        return detalleNominaRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public DetalleNomina findById(Integer id) {
        return detalleNominaRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public DetalleNomina create(DetalleNomina detalleNomina) {
        return detalleNominaRepository.save(detalleNomina);
    }

    @Override
    @Transactional
    public DetalleNomina updated(DetalleNomina detalleNomina, Integer id) {
        return detalleNominaRepository.save(detalleNomina);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        detalleNominaRepository.deleteById(id);
    }
}
