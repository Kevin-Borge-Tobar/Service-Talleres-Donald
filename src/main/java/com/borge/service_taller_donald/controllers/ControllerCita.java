package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.Automovil;
import com.borge.service_taller_donald.entities.Cita;
import com.borge.service_taller_donald.services.ServiceCita;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cita")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ControllerCita {
    private ServiceCita serviceCita;

    @GetMapping("/lista")
    @ResponseStatus(HttpStatus.OK)
    public List<Cita> findAll(){
        return serviceCita.findAll();
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Cita findById(@PathVariable Integer id){
        return serviceCita.findById(id);
    }

    @PostMapping("id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Cita create( @PathVariable Integer id, @RequestBody Cita cita){
        return serviceCita.create(cita);
    }

    @PutMapping("id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Cita update( @PathVariable Integer id, @RequestBody Cita cita){
        return serviceCita.updated(cita, id);
    }
    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById( @PathVariable  Integer id){
        serviceCita.deleteById(id);
    }
}
