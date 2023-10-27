package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.DetalleCotizacion;
import com.borge.service_taller_donald.entities.DetalleManoObra;
import com.borge.service_taller_donald.services.ServiceDetalleManoObra;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detallemanoobra")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ControllerDetalleManoObra {
    private ServiceDetalleManoObra serviceDetalleManoObra;

    @GetMapping("/lista")
    @ResponseStatus(HttpStatus.OK)
    public List<DetalleManoObra> findAll(){
        return serviceDetalleManoObra.findAll();
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public DetalleManoObra findById(@PathVariable Integer id){
        return serviceDetalleManoObra.findById(id);
    }

    @PostMapping("id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public DetalleManoObra create( @PathVariable Integer id, @RequestBody DetalleManoObra detalleManoObra){
        return serviceDetalleManoObra.create(detalleManoObra);
    }

    @PutMapping("id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public DetalleManoObra update( @PathVariable Integer id, @RequestBody DetalleManoObra detalleManoObra){
        return serviceDetalleManoObra.updated(detalleManoObra, id);
    }
    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById( @PathVariable  Integer id){
        serviceDetalleManoObra.deleteById(id);
    }
}
