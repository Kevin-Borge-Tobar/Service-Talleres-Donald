package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.SocioNegocio;
import com.borge.service_taller_donald.repositories.SocioNegocioRepository;
import com.borge.service_taller_donald.services.ServiceSocioNegocio;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@CrossOrigin( origins = "http://localhost:4200")
@RequestMapping("/socioNegocio")
public class ControllerSocioNegocio {
  private ServiceSocioNegocio serviceSocioNegocio;

  @GetMapping("/lista")
  @ResponseStatus(HttpStatus.OK)
  public List<SocioNegocio> findAll(){
    return serviceSocioNegocio.findAll();
  }

  @GetMapping("/id/{id}")
  public SocioNegocio findById( @PathVariable Integer id){
    return serviceSocioNegocio.findById(id);
  }

  @GetMapping("/nit/{nit}")
  public SocioNegocio findByNit(@PathVariable  String nit){
    return serviceSocioNegocio.findByNit(nit);
  }

  @PostMapping("/crear")
  @ResponseStatus(HttpStatus.CREATED)
  public SocioNegocio createSocioNegocio(@RequestBody SocioNegocio socioNegocio ){
    return serviceSocioNegocio.create(socioNegocio);
  }

  @PutMapping("/nit/{nit}")
  @ResponseStatus(HttpStatus.ACCEPTED)
    public SocioNegocio updateSocioNegocio(@PathVariable String nit, @RequestBody SocioNegocio socioNegocio){
      return serviceSocioNegocio.updated(socioNegocio, nit);
    }

  @DeleteMapping("delete/id/{idSocioNegocio}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void  deleteById(@PathVariable Integer idSocioNegocio){
    serviceSocioNegocio.deleteById(idSocioNegocio);
  }


}
