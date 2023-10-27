package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.TipoPago;
import com.borge.service_taller_donald.entities.TipoTelefono;
import com.borge.service_taller_donald.services.ServiceTipoTelefono;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipotelefono")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ControllerTipoTelefono {
    private ServiceTipoTelefono serviceTipoTelefono;

    @GetMapping("/lista")
    @ResponseStatus(HttpStatus.OK)
    public List<TipoTelefono> findAll(){
        return serviceTipoTelefono.findAll();
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public TipoTelefono findById(@PathVariable Integer id){
        return serviceTipoTelefono.findById(id);
    }

    @PostMapping("id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public TipoTelefono create( @PathVariable Integer id, @RequestBody TipoTelefono tipoTelefono){
        return serviceTipoTelefono.create(tipoTelefono);
    }

    @PutMapping("id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public TipoTelefono update( @PathVariable Integer id, @RequestBody TipoTelefono tipoTelefono){
        return serviceTipoTelefono.updated(tipoTelefono, id);
    }
    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById( @PathVariable  Integer id){
        serviceTipoTelefono.deleteById(id);
    }
}
