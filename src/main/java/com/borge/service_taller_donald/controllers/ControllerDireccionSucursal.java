package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.DireccionSocioNegocio;
import com.borge.service_taller_donald.entities.DireccionSucursal;
import com.borge.service_taller_donald.services.ServiceDireccionSucursal;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/direccionsucursal")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ControllerDireccionSucursal {
    private ServiceDireccionSucursal serviceDireccionSucursal;

    @GetMapping("/lista")
    @ResponseStatus(HttpStatus.OK)
    public List<DireccionSucursal> findAll(){
        return serviceDireccionSucursal.findAll();
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public DireccionSucursal findById(@PathVariable Integer id){
        return serviceDireccionSucursal.findById(id);
    }

    @PostMapping("id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public DireccionSucursal create( @PathVariable Integer id, @RequestBody DireccionSucursal direccionSucursal){
        return serviceDireccionSucursal.create(direccionSucursal);
    }

    @PutMapping("id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public DireccionSucursal update( @PathVariable Integer id, @RequestBody DireccionSucursal direccionSucursal){
        return serviceDireccionSucursal.updated(direccionSucursal, id);
    }
    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById( @PathVariable  Integer id){
        serviceDireccionSucursal.deleteById(id);
    }
}
