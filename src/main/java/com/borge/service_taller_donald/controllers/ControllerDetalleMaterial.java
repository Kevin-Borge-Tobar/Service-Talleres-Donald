package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.DetalleCotizacion;
import com.borge.service_taller_donald.entities.DetalleMaterial;
import com.borge.service_taller_donald.services.ServiceDetalleMaterial;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/detallematerial")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ControllerDetalleMaterial {
    private ServiceDetalleMaterial serviceDetalleMaterial;

    @GetMapping("/lista")
    @ResponseStatus(HttpStatus.OK)
    public List<DetalleMaterial> findAll(){
        return serviceDetalleMaterial.findAll();
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public DetalleMaterial findById(@PathVariable Integer id){
        return serviceDetalleMaterial.findById(id);
    }

    @PostMapping("id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public DetalleMaterial create( @PathVariable Integer id, @RequestBody DetalleMaterial detalleMaterial){
        return serviceDetalleMaterial.create(detalleMaterial);
    }

    @PutMapping("id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public DetalleMaterial update( @PathVariable Integer id, @RequestBody DetalleMaterial detalleMaterial){
        return serviceDetalleMaterial.updated(detalleMaterial, id);
    }
    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById( @PathVariable  Integer id){
        serviceDetalleMaterial.deleteById(id);
    }
}
