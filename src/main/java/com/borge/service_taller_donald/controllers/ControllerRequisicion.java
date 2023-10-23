package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.Requisicion;
import com.borge.service_taller_donald.services.IServiceRequisicion;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
@RequestMapping("/requisicion")
public class ControllerRequisicion {
  private IServiceRequisicion serviceRequisicion;

  @GetMapping("/lista")
  @ResponseStatus(HttpStatus.OK)
  public List<Requisicion> findAllRequisiciones() {
    return serviceRequisicion.findAll();
  }

  @GetMapping("/id/{id}")
  @ResponseStatus(HttpStatus.OK)
  public Requisicion findById( @PathVariable Integer id){
    return serviceRequisicion.findById(id);
  }

  @PostMapping("/crear")
  @ResponseStatus(HttpStatus.CREATED)
  public Requisicion createRequisicion(@RequestBody Requisicion requisicion){
    return serviceRequisicion.create(requisicion);
  }
}


