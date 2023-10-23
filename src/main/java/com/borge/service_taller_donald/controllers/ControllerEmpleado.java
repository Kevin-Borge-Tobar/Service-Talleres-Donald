package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.Empleado;
import com.borge.service_taller_donald.entities.PuestoLaboral;
import com.borge.service_taller_donald.services.ServiceEmpleado;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/empleado")
@AllArgsConstructor
public class ControllerEmpleado {
private ServiceEmpleado serviceEmpleado;

  @GetMapping("/lista")
  @ResponseStatus(HttpStatus.OK)
  public List<Empleado> findAll(){
    return serviceEmpleado.findAll();
  }

  @GetMapping("/id/{id}")
  @ResponseStatus(HttpStatus.OK)
  public Empleado findById( @PathVariable Integer id){
    return serviceEmpleado.findById(id);
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Empleado create(@RequestBody Empleado empleado){
    return  serviceEmpleado.create(empleado);
  }

  @PutMapping("id/{id}")
  @ResponseStatus(HttpStatus.ACCEPTED)
  public Empleado update(@RequestBody Empleado empleado, @PathVariable Integer id){
    return serviceEmpleado.updated( empleado, id);
  }

  @DeleteMapping("id/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void deleteById(@PathVariable Integer id){
    serviceEmpleado.deleteById(id);
  }
}

