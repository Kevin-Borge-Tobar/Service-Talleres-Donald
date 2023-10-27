package com.borge.service_taller_donald.controllers;


import com.borge.service_taller_donald.entities.Mano_Obra;
import com.borge.service_taller_donald.entities.Material;
import com.borge.service_taller_donald.services.ServiceMaterial;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/material")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ControllerMaterial {
    private ServiceMaterial serviceMaterial;

    @GetMapping("/lista")
    @ResponseStatus(HttpStatus.OK)
    public List<Material> findAll(){
        return serviceMaterial.findAll();
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Material findById(@PathVariable Integer id){
        return serviceMaterial.findById(id);
    }

    @PostMapping("id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Material create( @PathVariable Integer id, @RequestBody Material material){
        return serviceMaterial.create(material);
    }

    @PutMapping("id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Material update( @PathVariable Integer id, @RequestBody Material material){
        return serviceMaterial.updated(material, id);
    }
    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById( @PathVariable  Integer id){
        serviceMaterial.deleteById(id);
    }
}
