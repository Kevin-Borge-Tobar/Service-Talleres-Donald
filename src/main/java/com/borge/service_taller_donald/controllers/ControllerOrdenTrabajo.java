package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.MovimientoMaterial;
import com.borge.service_taller_donald.entities.OrdenTrabajo;
import com.borge.service_taller_donald.services.ServiceOrdenTrabajo;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ordentrabajo")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ControllerOrdenTrabajo {
    private ServiceOrdenTrabajo serviceOrdenTrabajo;

    @GetMapping("/lista")
    @ResponseStatus(HttpStatus.OK)
    public List<OrdenTrabajo> findAll(){
        return serviceOrdenTrabajo.findAll();
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public OrdenTrabajo findById(@PathVariable Integer id){
        return serviceOrdenTrabajo.findById(id);
    }

    @PostMapping("id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public OrdenTrabajo create( @PathVariable Integer id, @RequestBody OrdenTrabajo ordenTrabajo){
        return serviceOrdenTrabajo.create(ordenTrabajo);
    }

    @PutMapping("id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public OrdenTrabajo update( @PathVariable Integer id, @RequestBody OrdenTrabajo ordenTrabajo){
        return serviceOrdenTrabajo.updated(ordenTrabajo, id);
    }
    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById( @PathVariable  Integer id){
        serviceOrdenTrabajo.deleteById(id);
    }
}
