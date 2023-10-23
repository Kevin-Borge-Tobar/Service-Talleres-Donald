package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Automovil;
import com.borge.service_taller_donald.repositories.AutomovilRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@AllArgsConstructor
public class ServiceAutomovil implements  IServiceAutomovil {
  private AutomovilRepository automovilRepository;


  @Transactional(readOnly = true)
  @Override
  public List<Automovil> findAll() {
    return automovilRepository.findAll();
  }

  @Override
  @Transactional(readOnly = true)
  public Automovil findById(Integer id) {
    return automovilRepository.findById(id).orElse(null);
  }

  @Override
  @Transactional
  public Automovil create(Automovil automovil) {
    return automovilRepository.save(automovil);
  }

  @Override
  @Transactional
  public Automovil updated(Automovil automovil, Integer id) {
    return automovilRepository.save(automovil);
  }

  @Override
  @Transactional
  public void deleteById(Integer id) {
    automovilRepository.deleteById(id);
  }
}
