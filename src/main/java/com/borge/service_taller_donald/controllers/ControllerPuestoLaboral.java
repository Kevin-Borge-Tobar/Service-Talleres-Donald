package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.PuestoLaboral;
import com.borge.service_taller_donald.services.ServicePuestoLaboral;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "origins = http://localhost:4200")
@RequestMapping("/puestoLaboral")
public class ControllerPuestoLaboral {
  private ServicePuestoLaboral servicePuestoLaboral;

  @GetMapping("/lista")
  @ResponseStatus(HttpStatus.OK)
  public List<PuestoLaboral> findAll(){
    return servicePuestoLaboral.findAll();
  }

  @GetMapping("/id/{id}")
  @ResponseStatus(HttpStatus.OK)
  public PuestoLaboral findById( @PathVariable Integer id){
    return servicePuestoLaboral.findByid(id);
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public PuestoLaboral create(@RequestBody PuestoLaboral puestoLaboral){
    return  servicePuestoLaboral.create(puestoLaboral);
  }

  @PutMapping("id/{id}")
  @ResponseStatus(HttpStatus.ACCEPTED)
  public PuestoLaboral update(@RequestBody PuestoLaboral puestoLaboral, @PathVariable Integer id){
    return servicePuestoLaboral.updated( puestoLaboral, id);
  }

  @DeleteMapping("id/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void deleteById(@PathVariable Integer id){
    servicePuestoLaboral.deleteById(id);
  }
}
