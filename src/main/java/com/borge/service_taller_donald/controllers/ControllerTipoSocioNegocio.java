package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.TipoSocioNegocio;
import com.borge.service_taller_donald.services.IServiceTipoSocioNegocio;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin( origins = "http://localhost:4200")
@Data
@AllArgsConstructor
@RequestMapping("/list")
public class ControllerTipoSocioNegocio {
  private IServiceTipoSocioNegocio serviceTipoSocioNegocio;

  @GetMapping("/socio")
  public List<TipoSocioNegocio> findAll(){
     return serviceTipoSocioNegocio.findAll();
  }

}
