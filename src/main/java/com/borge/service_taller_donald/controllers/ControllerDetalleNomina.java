package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.DetalleMaterial;
import com.borge.service_taller_donald.entities.DetalleNomina;
import com.borge.service_taller_donald.services.ServiceDetalleNomina;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detallenomina")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ControllerDetalleNomina {
    private ServiceDetalleNomina serviceDetalleNomina;

    @GetMapping("/lista")
    @ResponseStatus(HttpStatus.OK)
    public List<DetalleNomina> findAll(){
        return serviceDetalleNomina.findAll();
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public DetalleNomina findById(@PathVariable Integer id){
        return serviceDetalleNomina.findById(id);
    }

    @PostMapping("id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public DetalleNomina create( @PathVariable Integer id, @RequestBody DetalleNomina detalleNomina){
        return serviceDetalleNomina.create(detalleNomina);
    }

    @PutMapping("id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public DetalleNomina update( @PathVariable Integer id, @RequestBody DetalleNomina detalleNomina){
        return serviceDetalleNomina.updated(detalleNomina, id);
    }
    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById( @PathVariable  Integer id){
        serviceDetalleNomina.deleteById(id);
    }
}
