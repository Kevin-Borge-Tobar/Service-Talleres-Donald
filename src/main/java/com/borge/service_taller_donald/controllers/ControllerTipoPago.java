package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.TipoMovimiento;
import com.borge.service_taller_donald.entities.TipoPago;
import com.borge.service_taller_donald.services.ServiceTipoPago;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipopago")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ControllerTipoPago {
    private ServiceTipoPago serviceTipoPago;

    @GetMapping("/lista")
    @ResponseStatus(HttpStatus.OK)
    public List<TipoPago> findAll(){
        return serviceTipoPago.findAll();
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public TipoPago findById(@PathVariable Integer id){
        return serviceTipoPago.findById(id);
    }

    @PostMapping("id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public TipoPago create( @PathVariable Integer id, @RequestBody TipoPago tipoPago){
        return serviceTipoPago.create(tipoPago);
    }

    @PutMapping("id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public TipoPago update( @PathVariable Integer id, @RequestBody TipoPago tipoPago){
        return serviceTipoPago.updated(tipoPago, id);
    }
    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById( @PathVariable  Integer id){
        serviceTipoPago.deleteById(id);
    }
}
