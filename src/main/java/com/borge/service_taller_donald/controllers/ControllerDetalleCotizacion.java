package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.Asistencia;
import com.borge.service_taller_donald.entities.DetalleCotizacion;
import com.borge.service_taller_donald.services.ServiceDetalleCotizacion;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detallecotizacion")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ControllerDetalleCotizacion {
    private ServiceDetalleCotizacion serviceDetalleCotizacion;

    @GetMapping("/lista")
    @ResponseStatus(HttpStatus.OK)
    public List<DetalleCotizacion> findAll(){
        return serviceDetalleCotizacion.findAll();
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public DetalleCotizacion findById(@PathVariable Integer id){
        return serviceDetalleCotizacion.findById(id);
    }

    @PostMapping("id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public DetalleCotizacion create( @PathVariable Integer id, @RequestBody DetalleCotizacion detalleCotizacion){
        return serviceDetalleCotizacion.create(detalleCotizacion);
    }

    @PutMapping("id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public DetalleCotizacion update( @PathVariable Integer id, @RequestBody DetalleCotizacion detalleCotizacion){
        return serviceDetalleCotizacion.updated(detalleCotizacion, id);
    }
    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById( @PathVariable  Integer id){
        serviceDetalleCotizacion.deleteById(id);
    }
}
