package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.DireccionSocioNegocio;
import com.borge.service_taller_donald.entities.DocumentoFiscal;
import com.borge.service_taller_donald.services.ServiceDocumentoFiscal;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/documentofiscal")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ControllerDocumentoFiscal {
    private ServiceDocumentoFiscal serviceDocumentoFiscal;

    @GetMapping("/lista")
    @ResponseStatus(HttpStatus.OK)
    public List<DocumentoFiscal> findAll(){
        return serviceDocumentoFiscal.findAll();
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public DocumentoFiscal findById(@PathVariable Integer id){
        return serviceDocumentoFiscal.findById(id);
    }

    @PostMapping("id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public DocumentoFiscal create( @PathVariable Integer id, @RequestBody DocumentoFiscal documentoFiscal){
        return serviceDocumentoFiscal.create(documentoFiscal);
    }

    @PutMapping("id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public DocumentoFiscal update( @PathVariable Integer id, @RequestBody DocumentoFiscal documentoFiscal){
        return serviceDocumentoFiscal.updated(documentoFiscal, id);
    }
    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById( @PathVariable  Integer id){
        serviceDocumentoFiscal.deleteById(id);
    }
}
