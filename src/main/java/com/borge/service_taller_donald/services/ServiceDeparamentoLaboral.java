package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.DepatamentoLaboral;
import com.borge.service_taller_donald.repositories.DepatamentoLaboralRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceDeparamentoLaboral implements  IServiceDepartamentoLaboral {
private DepatamentoLaboralRepository depatamentoLaboralRepository;

  @Override
  @Transactional(readOnly = true)
  public List<DepatamentoLaboral> findAll() {
    return depatamentoLaboralRepository.findAll();
  }

  @Override
  @Transactional(readOnly = true)
  public DepatamentoLaboral findById(Integer id) {
    return depatamentoLaboralRepository.findById(id).orElse(null);
  }

  @Override
  @Transactional
  public DepatamentoLaboral create(DepatamentoLaboral depatamentoLaboral) {
    return depatamentoLaboralRepository.save(depatamentoLaboral);
  }

  @Override
  @Transactional
  public DepatamentoLaboral updated(DepatamentoLaboral depatamentoLaboral, Integer id) {
    return depatamentoLaboralRepository.save(depatamentoLaboral);
  }

  @Override
  @Transactional
  public void deleteById(Integer id) {
  depatamentoLaboralRepository.deleteById(id);
  }
}
