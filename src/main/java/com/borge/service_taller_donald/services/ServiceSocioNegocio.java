package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.SocioNegocio;
import com.borge.service_taller_donald.repositories.SocioNegocioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceSocioNegocio implements  IServiceSocioNegocio {
private SocioNegocioRepository socioNegocioRepository;

  @Override
  public List<SocioNegocio> findAll() {
    return socioNegocioRepository.findAll();
  }

  @Override
  public SocioNegocio findById(Integer id) {
    return socioNegocioRepository.findById(id).orElse(null);
  }

  @Override
  public SocioNegocio findByNit(String nit) {
    return socioNegocioRepository.findByNit(nit).orElse(null);
  }

  @Override
  public SocioNegocio create(SocioNegocio socioNegocio) {
     return socioNegocioRepository.save(socioNegocio);

  }
  public SocioNegocio updated(SocioNegocio socioNegocio, String nit) {
     return socioNegocioRepository.save(socioNegocio);
    }
  @Override
  public void deleteById(Integer id) {
    socioNegocioRepository.deleteById(id);

  }
}

