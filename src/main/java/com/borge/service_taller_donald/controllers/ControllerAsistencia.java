package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.Asistencia;
import com.borge.service_taller_donald.entities.ContratoLaboral;
import com.borge.service_taller_donald.services.ServiceAsistencia;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/asistencia")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ControllerAsistencia {
    private ServiceAsistencia serviceAsistencia;

    @GetMapping("/lista")
    @ResponseStatus(HttpStatus.OK)
    public List<Asistencia> findAll(){
        return serviceAsistencia.findAll();
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Asistencia findById(@PathVariable Integer id){
        return serviceAsistencia.findById(id);
    }

    @PostMapping("id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Asistencia create( @PathVariable Integer id, @RequestBody Asistencia asistencia){
        return serviceAsistencia.create(asistencia);
    }

    @PutMapping("id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Asistencia update( @PathVariable Integer id, @RequestBody Asistencia asistencia){
        return serviceAsistencia.updated(asistencia, id);
    }
    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById( @PathVariable  Integer id){
        serviceAsistencia.deleteById(id);
    }
}
