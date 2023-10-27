package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.DetalleMaterial;
import com.borge.service_taller_donald.entities.DetalleMovimientoMaterial;
import com.borge.service_taller_donald.services.ServiceDetalleMovimientoMaterial;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detallemovimientomaterial")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ControllerDetalleMovimientoMaterial {
    private ServiceDetalleMovimientoMaterial serviceDetalleMovimientoMaterial;

    @GetMapping("/lista")
    @ResponseStatus(HttpStatus.OK)
    public List<DetalleMovimientoMaterial> findAll(){
        return serviceDetalleMovimientoMaterial.findAll();
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public DetalleMovimientoMaterial findById(@PathVariable Integer id){
        return serviceDetalleMovimientoMaterial.findById(id);
    }

    @PostMapping("id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public DetalleMovimientoMaterial create( @PathVariable Integer id, @RequestBody DetalleMovimientoMaterial detalleMovimientoMaterial){
        return serviceDetalleMovimientoMaterial.create(detalleMovimientoMaterial);
    }

    @PutMapping("id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public DetalleMovimientoMaterial update( @PathVariable Integer id, @RequestBody DetalleMovimientoMaterial detalleMovimientoMaterial){
        return serviceDetalleMovimientoMaterial.updated(detalleMovimientoMaterial, id);
    }
    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById( @PathVariable  Integer id){
        serviceDetalleMovimientoMaterial.deleteById(id);
    }

}
