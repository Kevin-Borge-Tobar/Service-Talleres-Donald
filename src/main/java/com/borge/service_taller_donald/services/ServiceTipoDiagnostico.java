package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.TipoDiagnostico;
import com.borge.service_taller_donald.repositories.TipoDiagnosticoRepository;
import com.borge.service_taller_donald.repositories.TipoSocioNegocioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@AllArgsConstructor
public class ServiceTipoDiagnostico implements IServiceTipoDiagnostico {
  private TipoDiagnosticoRepository tipoDiagnosticoRepository;

  @Override
  @Transactional(readOnly = true)
  public List<TipoDiagnostico> findAll() {
    return  tipoDiagnosticoRepository.findAll();
  }

  @Override
  @Transactional(readOnly = true)
  public TipoDiagnostico findById(Integer id) {
    return tipoDiagnosticoRepository.findById(id).orElse(null);
  }

  @Override
  @Transactional
  public TipoDiagnostico create(TipoDiagnostico tipoDiagnostico) {
    return tipoDiagnosticoRepository.save(tipoDiagnostico);
  }

  @Override
  @Transactional
  public TipoDiagnostico updated(TipoDiagnostico tipoDiagnostico, Integer id) {
    return tipoDiagnosticoRepository.save(tipoDiagnostico);
  }

  @Override
  public void deleteById(Integer id) {
    tipoDiagnosticoRepository.deleteById(id);
  }
}
