package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.ContratoLaboral;
import com.borge.service_taller_donald.repositories.ContratoLaboralRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceContratoLaboral  implements IServiceContratoLaboral{
  private ContratoLaboralRepository contratoLaboralRepository;


  @Override
  @Transactional(readOnly = true)
  public List<ContratoLaboral> findAll() {
    return contratoLaboralRepository.findAll();
  }

  @Override
  @Transactional(readOnly = true)
  public ContratoLaboral findById(Integer id) {
    return contratoLaboralRepository.findById(id).orElse(null);
  }

  @Override
  @Transactional
  public ContratoLaboral create(ContratoLaboral contratoLaboral) {
    return contratoLaboralRepository.save(contratoLaboral);
  }

  @Override
  public ContratoLaboral updated(ContratoLaboral contratoLaboral, Integer id) {
    return contratoLaboralRepository.save(contratoLaboral);
  }

  @Override
  public void deleteById(Integer id) {
    contratoLaboralRepository.deleteById(id);

  }
}
