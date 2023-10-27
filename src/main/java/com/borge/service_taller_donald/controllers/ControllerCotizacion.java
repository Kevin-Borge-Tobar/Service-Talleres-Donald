package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.Cliente;
import com.borge.service_taller_donald.entities.Cotizacion;
import com.borge.service_taller_donald.services.ServiceCotizacion;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cotizacion")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ControllerCotizacion {
    private ServiceCotizacion serviceCotizacion;

    @GetMapping("/lista")
    @ResponseStatus(HttpStatus.OK)
    public List<Cotizacion> findAll(){
        return serviceCotizacion.findAll();
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Cotizacion findById(@PathVariable Integer id){
        return serviceCotizacion.findById(id);
    }

    @PostMapping("id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Cotizacion create( @PathVariable Integer id, @RequestBody Cotizacion cotizacion){
        return serviceCotizacion.create(cotizacion);
    }

    @PutMapping("id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Cotizacion update( @PathVariable Integer id, @RequestBody Cotizacion cotizacion){
        return serviceCotizacion.updated(cotizacion, id);
    }
    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById( @PathVariable  Integer id){
        serviceCotizacion.deleteById(id);
    }

}
