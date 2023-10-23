package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Cita;
import com.borge.service_taller_donald.repositories.CitaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@AllArgsConstructor
public class ServiceCita implements IServiceCita {
  private CitaRepository citaRepository;

  @Override
  @Transactional(readOnly = true)
  public List<Cita> findAll() {
    return citaRepository.findAll();
  }

  @Override
  @Transactional(readOnly = true)
  public Cita findById(Integer id) {
    return citaRepository.findById(id).orElse(null);
  }

  @Override
  @Transactional
  public Cita create(Cita cita) {
    return citaRepository.save(cita);
  }

  @Override
  @Transactional
  public Cita updated(Cita cita, Integer id) {
    return citaRepository.save(cita);
  }

  @Override
  @Transactional
  public void deleteById(Integer id) {
    citaRepository.deleteById(id);
  }
}
