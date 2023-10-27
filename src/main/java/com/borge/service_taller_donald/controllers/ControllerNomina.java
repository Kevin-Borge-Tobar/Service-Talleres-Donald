package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.MovimientoMaterial;
import com.borge.service_taller_donald.entities.Nomina;
import com.borge.service_taller_donald.services.ServiceNomina;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nomina")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ControllerNomina {
    private ServiceNomina serviceNomina;

    @GetMapping("/lista")
    @ResponseStatus(HttpStatus.OK)
    public List<Nomina> findAll(){
        return serviceNomina.findAll();
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Nomina findById(@PathVariable Integer id){
        return serviceNomina.findById(id);
    }

    @PostMapping("id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Nomina create( @PathVariable Integer id, @RequestBody Nomina nomina){
        return serviceNomina.create(nomina);
    }

    @PutMapping("id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Nomina update( @PathVariable Integer id, @RequestBody Nomina nomina){
        return serviceNomina.updated(nomina, id);
    }
    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById( @PathVariable  Integer id){
        serviceNomina.deleteById(id);
    }
}
