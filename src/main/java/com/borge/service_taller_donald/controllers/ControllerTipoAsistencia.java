package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.TelefonoSocioNegocio;
import com.borge.service_taller_donald.entities.TipoAsistencia;
import com.borge.service_taller_donald.services.ServiceTipoAsistencia;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipoasistencia")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ControllerTipoAsistencia {
    private ServiceTipoAsistencia serviceTipoAsistencia;

    @GetMapping("/lista")
    @ResponseStatus(HttpStatus.OK)
    public List<TipoAsistencia> findAll(){
        return serviceTipoAsistencia.findAll();
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public TipoAsistencia findById(@PathVariable Integer id){
        return serviceTipoAsistencia.findById(id);
    }

    @PostMapping("id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public TipoAsistencia create( @PathVariable Integer id, @RequestBody TipoAsistencia tipoAsistencia){
        return serviceTipoAsistencia.create(tipoAsistencia);
    }

    @PutMapping("id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public TipoAsistencia update( @PathVariable Integer id, @RequestBody TipoAsistencia tipoAsistencia){
        return serviceTipoAsistencia.updated(tipoAsistencia, id);
    }
    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById( @PathVariable  Integer id){
        serviceTipoAsistencia.deleteById(id);
    }
}
