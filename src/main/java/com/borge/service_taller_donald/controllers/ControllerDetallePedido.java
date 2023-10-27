package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.DetalleNomina;
import com.borge.service_taller_donald.entities.DetallePedido;
import com.borge.service_taller_donald.services.ServiceDetallePedido;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detallepedido")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ControllerDetallePedido {
    private ServiceDetallePedido serviceDetallePedido;

    @GetMapping("/lista")
    @ResponseStatus(HttpStatus.OK)
    public List<DetallePedido> findAll(){
        return serviceDetallePedido.findAll();
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public DetallePedido findById(@PathVariable Integer id){
        return serviceDetallePedido.findById(id);
    }

    @PostMapping("id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public DetallePedido create( @PathVariable Integer id, @RequestBody DetallePedido detallePedido){
        return serviceDetallePedido.create(detallePedido);
    }

    @PutMapping("id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public DetallePedido update( @PathVariable Integer id, @RequestBody DetallePedido detallePedido){
        return serviceDetallePedido.updated(detallePedido, id);
    }
    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById( @PathVariable  Integer id){
        serviceDetallePedido.deleteById(id);
    }
}
