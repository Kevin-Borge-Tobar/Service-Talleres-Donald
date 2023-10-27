package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.DocumentoFiscal;
import com.borge.service_taller_donald.entities.Linea;
import com.borge.service_taller_donald.services.ServiceLinea;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/linea")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ControllerLinea {
    private ServiceLinea serviceLinea;

    @GetMapping("/lista")
    @ResponseStatus(HttpStatus.OK)
    public List<Linea> findAll(){
        return serviceLinea.findAll();
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Linea findById(@PathVariable Integer id){
        return serviceLinea.findById(id);
    }

    @PostMapping("id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Linea create( @PathVariable Integer id, @RequestBody Linea linea){
        return serviceLinea.create(linea);
    }

    @PutMapping("id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Linea update( @PathVariable Integer id, @RequestBody Linea linea){
        return serviceLinea.updated(linea, id);
    }
    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById( @PathVariable  Integer id){
        serviceLinea.deleteById(id);
    }
}
