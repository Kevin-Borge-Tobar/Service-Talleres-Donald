package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.OrdenTrabajo;
import com.borge.service_taller_donald.entities.TelefonoSocioNegocio;
import com.borge.service_taller_donald.entities.TelefonoSucursal;
import com.borge.service_taller_donald.services.ServiceTelefonoSocioNegocio;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/telefonosocionegocio")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ControllerTelefonoSocioNegocio {
    private ServiceTelefonoSocioNegocio serviceTelefonoSocioNegocio;

    @GetMapping("/lista")
    @ResponseStatus(HttpStatus.OK)
    public List<TelefonoSocioNegocio> findAll(){
        return serviceTelefonoSocioNegocio.findAll();
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public TelefonoSocioNegocio findById(@PathVariable Integer id){
        return serviceTelefonoSocioNegocio.findById(id);
    }

    @PostMapping("id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public TelefonoSocioNegocio create( @PathVariable Integer id, @RequestBody TelefonoSocioNegocio telefonoSocioNegocio){
        return serviceTelefonoSocioNegocio.create(telefonoSocioNegocio);
    }

    @PutMapping("id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public TelefonoSocioNegocio update( @PathVariable Integer id, @RequestBody TelefonoSocioNegocio telefonoSocioNegocio){
        return serviceTelefonoSocioNegocio.updated(telefonoSocioNegocio, id);
    }
    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById( @PathVariable  Integer id){
        serviceTelefonoSocioNegocio.deleteById(id);
    }
}
