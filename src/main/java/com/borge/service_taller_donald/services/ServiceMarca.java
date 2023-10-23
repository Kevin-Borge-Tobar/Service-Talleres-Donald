package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Marca;
import com.borge.service_taller_donald.repositories.MarcaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceMarca implements  IServiceMarca {
  private MarcaRepository marcaRepository;

  @Override
  @Transactional(readOnly = true)
  public List<Marca> findAll() {
    return marcaRepository.findAll();
  }

  @Override
  @Transactional(readOnly = true)
  public Marca findById(Integer id) {
    return marcaRepository.findById(id).orElse(null);
  }

  @Override
  @Transactional
  public Marca create(Marca marca) {
    return marcaRepository.save(marca);
  }

  @Override
  @Transactional
  public Marca updated(Marca marca, Integer id) {
    return marcaRepository.save(marca);
  }

  @Override
  @Transactional
  public void deleteById(Integer id) {
    marcaRepository.deleteById(id);

  }
}
