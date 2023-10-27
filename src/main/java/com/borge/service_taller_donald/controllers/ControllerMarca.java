package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.Mano_Obra;
import com.borge.service_taller_donald.entities.Marca;
import com.borge.service_taller_donald.services.ServiceMarca;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marca")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ControllerMarca {
    private ServiceMarca serviceMarca;

    @GetMapping("/lista")
    @ResponseStatus(HttpStatus.OK)
    public List<Marca> findAll(){
        return serviceMarca.findAll();
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Marca findById(@PathVariable Integer id){
        return serviceMarca.findById(id);
    }

    @PostMapping("id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Marca create( @PathVariable Integer id, @RequestBody Marca marca){
        return serviceMarca.create(marca);
    }

    @PutMapping("id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Marca update( @PathVariable Integer id, @RequestBody Marca marca){
        return serviceMarca.updated(marca, id);
    }
    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById( @PathVariable  Integer id){
        serviceMarca.deleteById(id);
    }
}
