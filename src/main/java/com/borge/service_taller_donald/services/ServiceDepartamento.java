package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Departamento;
import com.borge.service_taller_donald.repositories.DepartamentoRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ServiceDepartamento implements  IServiceDepartamento {
  private DepartamentoRepository departamentoRepository;

  @Override
  @Transactional(readOnly = true)
  public List<Departamento> findAll() {
     return departamentoRepository.findAll();
  }

  @Override
  @Transactional(readOnly = true)
  public Optional<Departamento> findById(Integer id) {
    Optional<Departamento> departamento;
    return Optional.ofNullable(departamentoRepository.findById(id).orElse(null));
  }

  @Override
  @Transactional
  public Departamento create(Departamento departamento, Integer id) {
    return departamentoRepository.save(departamento);
  }

  @Override
  @Transactional
  public Integer update(Integer id, Departamento departamento) {
    departamentoRepository.save(departamento);
    return 1;
  }

  @Override
  @Transactional
  public void deleteById(Integer id) {
    departamentoRepository.deleteById(id);
  }
}
