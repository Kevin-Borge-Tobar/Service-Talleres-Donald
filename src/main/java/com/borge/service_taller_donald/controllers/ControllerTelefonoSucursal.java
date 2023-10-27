package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.TelefonoSocioNegocio;
import com.borge.service_taller_donald.entities.TelefonoSucursal;
import com.borge.service_taller_donald.services.ServiceTelefonoSucursal;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/telefonosucursal")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ControllerTelefonoSucursal {
    private ServiceTelefonoSucursal serviceTelefonoSucursal;

    @GetMapping("/lista")
    @ResponseStatus(HttpStatus.OK)
    public List<TelefonoSucursal> findAll(){
        return serviceTelefonoSucursal.findAll();
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public TelefonoSucursal findById(@PathVariable Integer id){
        return serviceTelefonoSucursal.findById(id);
    }

    @PostMapping("id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public TelefonoSucursal create( @PathVariable Integer id, @RequestBody TelefonoSucursal telefonoSucursal){
        return serviceTelefonoSucursal.create(telefonoSucursal);
    }

    @PutMapping("id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public TelefonoSucursal update( @PathVariable Integer id, @RequestBody TelefonoSucursal telefonoSucursal){
        return serviceTelefonoSucursal.updated(telefonoSucursal, id);
    }
    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById( @PathVariable  Integer id){
        serviceTelefonoSucursal.deleteById(id);
    }
}
