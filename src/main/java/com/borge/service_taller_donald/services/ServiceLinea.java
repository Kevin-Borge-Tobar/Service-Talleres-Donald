package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Linea;
import com.borge.service_taller_donald.repositories.LineaRepository;
import com.borge.service_taller_donald.repositories.MarcaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceLinea implements  IServiceLinea {
  private LineaRepository lineaRepository;

  @Override
  @Transactional(readOnly = true)
  public List<Linea> findAll() {
    return lineaRepository.findAll();
  }

  @Override
  @Transactional(readOnly = true)
  public Linea findById(Integer id) {
    return lineaRepository.findById(id).orElse(null);
  }

  @Override
  @Transactional
  public Linea create(Linea linea) {
    return lineaRepository.save(linea);
  }

  @Override
  @Transactional
  public Linea updated(Linea linea, Integer id) {
    return lineaRepository.save(linea);
  }

  @Override
  @Transactional
  public void deleteById(Integer id) {
  lineaRepository.deleteById(id);
  }
}
