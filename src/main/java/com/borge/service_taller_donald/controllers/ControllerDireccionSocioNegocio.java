package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.DetallePedido;
import com.borge.service_taller_donald.entities.DireccionSocioNegocio;
import com.borge.service_taller_donald.services.ServiceDireccionSocioNegocio;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/direccionsocionegocio")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ControllerDireccionSocioNegocio {
    private ServiceDireccionSocioNegocio serviceDireccionSocioNegocio;

    @GetMapping("/lista")
    @ResponseStatus(HttpStatus.OK)
    public List<DireccionSocioNegocio> findAll(){
        return serviceDireccionSocioNegocio.findAll();
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public DireccionSocioNegocio findById(@PathVariable Integer id){
        return serviceDireccionSocioNegocio.findById(id);
    }

    @PostMapping("id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public DireccionSocioNegocio create( @PathVariable Integer id, @RequestBody DireccionSocioNegocio direccionSocioNegocio){
        return serviceDireccionSocioNegocio.create(direccionSocioNegocio);
    }

    @PutMapping("id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public DireccionSocioNegocio update( @PathVariable Integer id, @RequestBody DireccionSocioNegocio direccionSocioNegocio){
        return serviceDireccionSocioNegocio.updated(direccionSocioNegocio, id);
    }
    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById( @PathVariable  Integer id){
        serviceDireccionSocioNegocio.deleteById(id);
    }
}
