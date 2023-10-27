package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.DocumentoFiscal;
import com.borge.service_taller_donald.entities.Mano_Obra;
import com.borge.service_taller_donald.services.ServiceMano_Obra;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mano_obra")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ControllerMano_Obra {
    private ServiceMano_Obra serviceMano_obra;

    @GetMapping("/lista")
    @ResponseStatus(HttpStatus.OK)
    public List<Mano_Obra> findAll(){
        return serviceMano_obra.findAll();
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mano_Obra findById(@PathVariable Integer id){
        return serviceMano_obra.findById(id);
    }

    @PostMapping("id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Mano_Obra create( @PathVariable Integer id, @RequestBody Mano_Obra mano_obra){
        return serviceMano_obra.create(mano_obra);
    }

    @PutMapping("id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Mano_Obra update( @PathVariable Integer id, @RequestBody Mano_Obra mano_obra){
        return serviceMano_obra.updated(mano_obra, id);
    }
    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById( @PathVariable  Integer id){
        serviceMano_obra.deleteById(id);
    }
}
