package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.ContratoLaboral;
import com.borge.service_taller_donald.entities.PuestoLaboral;
import com.borge.service_taller_donald.repositories.PuestoLaboralRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ServicePuestoLaboral implements IServicePuestoLaboral {

  private PuestoLaboralRepository puestoLaboralRepository;

  @Override
  @Transactional(readOnly = true)
  public List<PuestoLaboral> findAll() {
    return puestoLaboralRepository.findAll();
  }

  @Override
  @Transactional(readOnly = true)
  public PuestoLaboral findByid(Integer id) {
    return puestoLaboralRepository.findById(id).orElse(null);
  }

  @Override
  @Transactional
  public PuestoLaboral create(PuestoLaboral puestoLaboral) {
    return puestoLaboralRepository.save(puestoLaboral);
  }

  @Override
  @Transactional
  public PuestoLaboral updated(PuestoLaboral puestoLaboral, Integer id) {
    return puestoLaboralRepository.save(puestoLaboral);
  }

  @Override
  @Transactional
  public void deleteById(Integer id) {
    puestoLaboralRepository.deleteById(id);
  }
}
