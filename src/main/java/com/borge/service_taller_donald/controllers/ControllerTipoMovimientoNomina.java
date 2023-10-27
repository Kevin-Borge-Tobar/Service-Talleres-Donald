package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.TipoMovimiento;
import com.borge.service_taller_donald.entities.TipoMovimientoNomina;
import com.borge.service_taller_donald.services.ServiceTipoMovimientoNomina;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipomovimientonomina")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ControllerTipoMovimientoNomina {
    private ServiceTipoMovimientoNomina serviceTipoMovimientoNomina;

    @GetMapping("/lista")
    @ResponseStatus(HttpStatus.OK)
    public List<TipoMovimientoNomina> findAll(){
        return serviceTipoMovimientoNomina.findAll();
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public TipoMovimientoNomina findById(@PathVariable Integer id){
        return serviceTipoMovimientoNomina.findById(id);
    }

    @PostMapping("id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public TipoMovimientoNomina create( @PathVariable Integer id, @RequestBody TipoMovimientoNomina tipoMovimientoNomina){
        return serviceTipoMovimientoNomina.create(tipoMovimientoNomina);
    }

    @PutMapping("id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public TipoMovimientoNomina update( @PathVariable Integer id, @RequestBody TipoMovimientoNomina tipoMovimientoNomina){
        return serviceTipoMovimientoNomina.updated(tipoMovimientoNomina, id);
    }
    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById( @PathVariable  Integer id){
        serviceTipoMovimientoNomina.deleteById(id);
    }
}
