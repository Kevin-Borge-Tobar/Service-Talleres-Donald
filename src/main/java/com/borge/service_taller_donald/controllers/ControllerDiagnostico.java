package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.Diagnostico;
import com.borge.service_taller_donald.services.ServiceDiagnostico;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diagnostico")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ControllerDiagnostico {
    private ServiceDiagnostico serviceDiagnostico;

    @GetMapping("/lista")
    @ResponseStatus(HttpStatus.OK)
    public List<Diagnostico> findAll(){
        return serviceDiagnostico.findAll();
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Diagnostico findById(@PathVariable Integer id){
        return serviceDiagnostico.findById(id);
    }

    @PostMapping("id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Diagnostico create( @PathVariable Integer id, @RequestBody Diagnostico diagnostico){
        return serviceDiagnostico.create(diagnostico);
    }

    @PutMapping("id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Diagnostico update( @PathVariable Integer id, @RequestBody Diagnostico diagnostico){
        return serviceDiagnostico.updated(diagnostico, id);
    }
    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById( @PathVariable  Integer id){
        serviceDiagnostico.deleteById(id);
    }

}
