package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.ContratoLaboral;
import com.borge.service_taller_donald.services.ServiceContratoLaboral;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contratoLaboral")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ControllerContratoLaboral {
  private ServiceContratoLaboral serviceContratoLaboral;


  @GetMapping("/lista")
  @ResponseStatus(HttpStatus.OK)
  public List<ContratoLaboral> findAll(){
    return serviceContratoLaboral.findAll();
  }

  @GetMapping("/id/{id}")
  @ResponseStatus(HttpStatus.OK)
  public ContratoLaboral findById(@PathVariable Integer id){
    return serviceContratoLaboral.findById(id);
  }

  @PostMapping("id/{id}")
  @ResponseStatus(HttpStatus.ACCEPTED)
  public ContratoLaboral create( @PathVariable Integer id, @RequestBody ContratoLaboral contratoLaboral){
    return serviceContratoLaboral.create(contratoLaboral);
  }

  @PutMapping("id/{id}")
  @ResponseStatus(HttpStatus.CREATED)
  public ContratoLaboral update( @PathVariable Integer id, @RequestBody ContratoLaboral contratoLaboral){
    return serviceContratoLaboral.updated(contratoLaboral, id);
  }
  @DeleteMapping("/id/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void deleteById( @PathVariable  Integer id){
    serviceContratoLaboral.deleteById(id);
  }




}
