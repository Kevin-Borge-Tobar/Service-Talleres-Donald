package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.TipoAsistencia;
import com.borge.service_taller_donald.entities.TipoDiagnostico;
import com.borge.service_taller_donald.services.ServiceTipoDiagnostico;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipodiagnostico")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ControllerTipoDiagnostico {
    private ServiceTipoDiagnostico serviceTipoDiagnostico;

    @GetMapping("/lista")
    @ResponseStatus(HttpStatus.OK)
    public List<TipoDiagnostico> findAll(){
        return serviceTipoDiagnostico.findAll();
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public TipoDiagnostico findById(@PathVariable Integer id){
        return serviceTipoDiagnostico.findById(id);
    }

    @PostMapping("id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public TipoDiagnostico create( @PathVariable Integer id, @RequestBody TipoDiagnostico tipoDiagnostico){
        return serviceTipoDiagnostico.create(tipoDiagnostico);
    }

    @PutMapping("id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public TipoDiagnostico update( @PathVariable Integer id, @RequestBody TipoDiagnostico tipoDiagnostico){
        return serviceTipoDiagnostico.updated(tipoDiagnostico, id);
    }
    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById( @PathVariable  Integer id){
        serviceTipoDiagnostico.deleteById(id);
    }
}
