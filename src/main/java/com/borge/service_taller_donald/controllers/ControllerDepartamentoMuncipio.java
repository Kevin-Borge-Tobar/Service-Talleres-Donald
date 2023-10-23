package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.Departamento;
import com.borge.service_taller_donald.entities.Municipio;
import com.borge.service_taller_donald.services.IServiceDepartamento;
import com.borge.service_taller_donald.services.IServiceMunicipio;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Data
@RequestMapping("/")
public class ControllerDepartamentoMuncipio {
  private IServiceMunicipio serviceMunicipio;
  private IServiceDepartamento serviceDepartamento;

  @GetMapping("departamento/lista")
  @ResponseStatus(HttpStatus.OK)
  public  List<Departamento> findAll(){
    return serviceDepartamento.findAll();
  }

  @GetMapping("departamento/id/{id}")
  public Departamento getDepartamento(@PathVariable Integer id){
    return serviceDepartamento.findById(id).orElseThrow(null);
  }

}
