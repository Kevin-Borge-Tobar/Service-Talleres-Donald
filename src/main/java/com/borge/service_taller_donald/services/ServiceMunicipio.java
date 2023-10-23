package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Municipio;
import com.borge.service_taller_donald.repositories.MunicipioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ServiceMunicipio implements IServiceMunicipio {
  private MunicipioRepository municipioRepository;
  @Override
  public List<Municipio> findAll() {
    return municipioRepository.findAll();
  }
  @Override
  public Optional<Municipio> findById(Integer id) {
    return municipioRepository.findById(id);
  }
  @Override
  public void create(Municipio municipio, Integer id) {
    municipioRepository.save(municipio);
  }
  @Override
  public void updated(Municipio municipio, Integer id) {
    municipioRepository.save(municipio);
  }

  @Override
  public void deleteById(Integer id) {
    municipioRepository.deleteById(id);
  }
}
