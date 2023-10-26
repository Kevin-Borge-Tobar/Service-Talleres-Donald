package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Nomina;
import com.borge.service_taller_donald.entities.ResumenNomina;
import com.borge.service_taller_donald.repositories.ResumenNominaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceResumenNomina implements IServiceResumenNomina{
    ResumenNominaRepository resumenNominaRepository;

    @Transactional(readOnly = true)
    @Override
    public List<ResumenNomina> findAll() {
        return resumenNominaRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public ResumenNomina findById(Integer id) {
        return resumenNominaRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public ResumenNomina create(ResumenNomina resumenNomina) {
        return resumenNominaRepository.save(resumenNomina);
    }

    @Override
    @Transactional
    public ResumenNomina updated(ResumenNomina resumenNomina, Integer id) {
        return resumenNominaRepository.save(resumenNomina);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        resumenNominaRepository.deleteById(id);
    }
}
