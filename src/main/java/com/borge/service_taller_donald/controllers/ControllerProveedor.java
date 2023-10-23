package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.Empleado;
import com.borge.service_taller_donald.entities.Proveedor;
import com.borge.service_taller_donald.services.ServiceProvedor;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/proveedor")
@AllArgsConstructor
public class ControllerProveedor {
  private ServiceProvedor serviceProvedor;

  @GetMapping("/lista")
  @ResponseStatus(HttpStatus.OK)
  public List<Proveedor> findAll(){
    return serviceProvedor.findAll();
  }

  @GetMapping("/id/{id}")
  @ResponseStatus(HttpStatus.OK)
  public Proveedor findById( @PathVariable Integer id){
    return serviceProvedor.findById(id);
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Proveedor create(@RequestBody Proveedor proveedor){
    return  serviceProvedor.create(proveedor);
  }

  @PutMapping("id/{id}")
  @ResponseStatus(HttpStatus.ACCEPTED)
  public Proveedor update(@RequestBody Proveedor proveedor, @PathVariable Integer id){
    return serviceProvedor.updated( proveedor, id);
  }

  @DeleteMapping("id/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void deleteById(@PathVariable Integer id){
    serviceProvedor.deleteById(id);
  }

}
