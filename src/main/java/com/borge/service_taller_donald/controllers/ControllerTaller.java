package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.Taller;
import com.borge.service_taller_donald.services.IServiceTaller;
import com.borge.service_taller_donald.services.ServiceTaller;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
@RequestMapping("/taller")
public class ControllerTaller {
  private ServiceTaller serviceTaller;

  @GetMapping("/lista")
  @ResponseStatus(HttpStatus.OK)
  public List<Taller> findAll(){
    return serviceTaller.findAll();
  }

  @GetMapping("/id/{id}")
  @ResponseStatus(HttpStatus.OK)
  public Taller findById( @PathVariable Integer id){
    return serviceTaller.findById(id);
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Taller create(@RequestBody Taller taller){
    return  serviceTaller.create(taller);
  }

  @PutMapping("id/{id}")
  @ResponseStatus(HttpStatus.ACCEPTED)
  public Taller update(@RequestBody Taller taller, @PathVariable Integer id){
    return serviceTaller.updated(taller, id);
  }

  @DeleteMapping("id/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void deleteById(@PathVariable Integer id){
    serviceTaller.deleteById(id);
  }

}
