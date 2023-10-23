package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.TipoSocioNegocio;
import com.borge.service_taller_donald.repositories.TipoSocioNegocioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceTipoSocioNegocio implements  IServiceTipoSocioNegocio {

  private TipoSocioNegocioRepository tipoSocioNegocioRepository;
  @Override
  public List<TipoSocioNegocio> findAll() {
     return tipoSocioNegocioRepository.findAll();
  }

}
