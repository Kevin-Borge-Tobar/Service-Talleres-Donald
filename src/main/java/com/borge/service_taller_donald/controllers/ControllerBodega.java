package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.Automovil;
import com.borge.service_taller_donald.entities.Bodega;
import com.borge.service_taller_donald.services.ServiceBodega;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bodega")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ControllerBodega {
    private ServiceBodega serviceBodega;

    @GetMapping("/lista")
    @ResponseStatus(HttpStatus.OK)
    public List<Bodega> findAll(){
        return serviceBodega.findAll();
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Bodega findById(@PathVariable Integer id){
        return serviceBodega.findById(id);
    }

    @PostMapping("id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Bodega create( @PathVariable Integer id, @RequestBody Bodega bodega){
        return serviceBodega.create(bodega);
    }

    @PutMapping("id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Bodega update( @PathVariable Integer id, @RequestBody Bodega bodega){
        return serviceBodega.updated(bodega, id);
    }
    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById( @PathVariable  Integer id){
        serviceBodega.deleteById(id);
    }
}
