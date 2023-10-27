package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.Material;
import com.borge.service_taller_donald.entities.MovimientoMaterial;
import com.borge.service_taller_donald.services.ServiceMovimientoMaterial;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimientomaterial")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ControllerMoviminetoMaterial {
    private ServiceMovimientoMaterial serviceMovimientoMaterial;

    @GetMapping("/lista")
    @ResponseStatus(HttpStatus.OK)
    public List<MovimientoMaterial> findAll(){
        return serviceMovimientoMaterial.findAll();
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MovimientoMaterial findById(@PathVariable Integer id){
        return serviceMovimientoMaterial.findById(id);
    }

    @PostMapping("id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public MovimientoMaterial create( @PathVariable Integer id, @RequestBody MovimientoMaterial movimientoMaterial){
        return serviceMovimientoMaterial.create(movimientoMaterial);
    }

    @PutMapping("id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public MovimientoMaterial update( @PathVariable Integer id, @RequestBody MovimientoMaterial movimientoMaterial){
        return serviceMovimientoMaterial.updated(movimientoMaterial, id);
    }
    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById( @PathVariable  Integer id){
        serviceMovimientoMaterial.deleteById(id);
    }
}
