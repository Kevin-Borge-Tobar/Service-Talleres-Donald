package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.SocioNegocio;

import java.util.List;

public  interface IServiceSocioNegocio {
  public List<SocioNegocio> findAll();
  public SocioNegocio findById(Integer id);

  public SocioNegocio findByNit(String nit);
  public SocioNegocio create(SocioNegocio socioNegocio);
  public SocioNegocio updated(SocioNegocio socioNegocio, String nit);
  public void  deleteById(Integer id );
}
