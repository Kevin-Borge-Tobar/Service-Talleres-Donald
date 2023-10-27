package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.Asistencia;
import com.borge.service_taller_donald.entities.Automovil;
import com.borge.service_taller_donald.services.ServiceAutomovil;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/automovil")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ControllerAutomovil {
    private ServiceAutomovil serviceAutomovil;

    @GetMapping("/lista")
    @ResponseStatus(HttpStatus.OK)
    public List<Automovil> findAll(){
        return serviceAutomovil.findAll();
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Automovil findById(@PathVariable Integer id){
        return serviceAutomovil.findById(id);
    }

    @PostMapping("id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Automovil create( @PathVariable Integer id, @RequestBody Automovil automovil){
        return serviceAutomovil.create(automovil);
    }

    @PutMapping("id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Automovil update( @PathVariable Integer id, @RequestBody Automovil automovil){
        return serviceAutomovil.updated(automovil, id);
    }
    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById( @PathVariable  Integer id){
        serviceAutomovil.deleteById(id);
    }
}
