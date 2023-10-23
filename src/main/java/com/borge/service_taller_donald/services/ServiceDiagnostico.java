package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Diagnostico;
import com.borge.service_taller_donald.repositories.DiagnosticoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceDiagnostico  implements  IServiceDiagnostico{
  private DiagnosticoRepository diagnosticoRepository;

  @Override
  @Transactional(readOnly = true)
  public List<Diagnostico> findAll() {
    return diagnosticoRepository.findAll();
  }

  @Override
  @Transactional(readOnly = true)
  public Diagnostico findById(Integer id) {
    return diagnosticoRepository.findById(id).orElse(null);
  }

  @Override
  @Transactional
  public Diagnostico create(Diagnostico diagnostico) {
    return diagnosticoRepository.save(diagnostico);
  }

  @Override()
  @Transactional
  public Diagnostico updated(Diagnostico diagnostico, Integer id) {
    return diagnosticoRepository.save(diagnostico);
  }

  @Override
  @Transactional
  public void deleteById(Integer id) {
  }
}
