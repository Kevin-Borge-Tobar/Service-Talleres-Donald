package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.TipoAsistencia;
import com.borge.service_taller_donald.entities.TipoDireccion;
import com.borge.service_taller_donald.services.ServiceTipoDireccion;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipodireccion")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ControllerTipoDireccion {
    private ServiceTipoDireccion serviceTipoDireccion;

    @GetMapping("/lista")
    @ResponseStatus(HttpStatus.OK)
    public List<TipoDireccion> findAll(){
        return serviceTipoDireccion.findAll();
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public TipoDireccion findById(@PathVariable Integer id){
        return serviceTipoDireccion.findById(id);
    }

    @PostMapping("id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public TipoDireccion create( @PathVariable Integer id, @RequestBody TipoDireccion tipoDireccion){
        return serviceTipoDireccion.create(tipoDireccion);
    }

    @PutMapping("id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public TipoDireccion update( @PathVariable Integer id, @RequestBody TipoDireccion tipoDireccion){
        return serviceTipoDireccion.updated(tipoDireccion, id);
    }
    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById( @PathVariable  Integer id){
        serviceTipoDireccion.deleteById(id);
    }
}
