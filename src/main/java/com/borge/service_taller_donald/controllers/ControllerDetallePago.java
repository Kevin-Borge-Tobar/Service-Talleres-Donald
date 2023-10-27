package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.DetalleNomina;
import com.borge.service_taller_donald.entities.DetallePago;
import com.borge.service_taller_donald.services.ServiceDetallePago;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detallepago")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ControllerDetallePago {
    private ServiceDetallePago serviceDetallePago;

    @GetMapping("/lista")
    @ResponseStatus(HttpStatus.OK)
    public List<DetallePago> findAll(){
        return serviceDetallePago.findAll();
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public DetallePago findById(@PathVariable Integer id){
        return serviceDetallePago.findById(id);
    }

    @PostMapping("id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public DetallePago create( @PathVariable Integer id, @RequestBody DetallePago detallePago){
        return serviceDetallePago.create(detallePago);
    }

    @PutMapping("id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public DetallePago update( @PathVariable Integer id, @RequestBody DetallePago detallePago){
        return serviceDetallePago.updated(detallePago, id);
    }
    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById( @PathVariable  Integer id){
        serviceDetallePago.deleteById(id);
    }
}
