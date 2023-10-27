package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.TipoDireccion;
import com.borge.service_taller_donald.entities.TipoMovimiento;
import com.borge.service_taller_donald.services.ServiceTipoMovimiento;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipomovimiento")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ControllerTipoMovimiento {
    private ServiceTipoMovimiento serviceTipoMovimiento;

    @GetMapping("/lista")
    @ResponseStatus(HttpStatus.OK)
    public List<TipoMovimiento> findAll(){
        return serviceTipoMovimiento.findAll();
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public TipoMovimiento findById(@PathVariable Integer id){
        return serviceTipoMovimiento.findById(id);
    }

    @PostMapping("id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public TipoMovimiento create( @PathVariable Integer id, @RequestBody TipoMovimiento tipoMovimiento){
        return serviceTipoMovimiento.create(tipoMovimiento);
    }

    @PutMapping("id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public TipoMovimiento update( @PathVariable Integer id, @RequestBody TipoMovimiento tipoMovimiento){
        return serviceTipoMovimiento.updated(tipoMovimiento, id);
    }
    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById( @PathVariable  Integer id){
        serviceTipoMovimiento.deleteById(id);
    }
}
