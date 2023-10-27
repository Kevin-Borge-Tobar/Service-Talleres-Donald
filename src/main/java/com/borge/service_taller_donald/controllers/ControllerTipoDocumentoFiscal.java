package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.TipoDireccion;
import com.borge.service_taller_donald.entities.TipoDocumentoFiscal;
import com.borge.service_taller_donald.services.ServiceTipoDocumentoFiscal;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipodocumentofiscal")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ControllerTipoDocumentoFiscal {
    private ServiceTipoDocumentoFiscal serviceTipoDocumentoFiscal;

    @GetMapping("/lista")
    @ResponseStatus(HttpStatus.OK)
    public List<TipoDocumentoFiscal> findAll(){
        return serviceTipoDocumentoFiscal.findAll();
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public TipoDocumentoFiscal findById(@PathVariable Integer id){
        return serviceTipoDocumentoFiscal.findById(id);
    }

    @PostMapping("id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public TipoDocumentoFiscal create( @PathVariable Integer id, @RequestBody TipoDocumentoFiscal tipoDocumentoFiscal){
        return serviceTipoDocumentoFiscal.create(tipoDocumentoFiscal);
    }

    @PutMapping("id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public TipoDocumentoFiscal update( @PathVariable Integer id, @RequestBody TipoDocumentoFiscal tipoDocumentoFiscal){
        return serviceTipoDocumentoFiscal.updated(tipoDocumentoFiscal, id);
    }
    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById( @PathVariable  Integer id){
        serviceTipoDocumentoFiscal.deleteById(id);
    }
}
