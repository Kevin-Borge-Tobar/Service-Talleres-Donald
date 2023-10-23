package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Taller;
import com.borge.service_taller_donald.repositories.TallerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceTaller implements IServiceTaller{
  private TallerRepository tallerRepository;
  @Override
  @Transactional(readOnly = true)
  public List<Taller> findAll() {
    return tallerRepository.findAll();
  }

  @Override
  @Transactional(readOnly = true)
  public Taller findById(Integer id) {
    return tallerRepository.findById(id).orElse(null);
  }

  @Override
  @Transactional
  public Taller create(Taller taller) {
    return tallerRepository.save(taller);
  }

  @Override
  @Transactional
  public Taller updated(Taller taller, Integer id) {
    return tallerRepository.save(taller);
  }

  @Override
  @Transactional
  public void deleteById(Integer id) {
  tallerRepository.deleteById(id);
  }
}
