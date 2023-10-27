package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.Cita;
import com.borge.service_taller_donald.entities.Cliente;
import com.borge.service_taller_donald.services.ServiceCliente;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ControllerCliente {
    private ServiceCliente serviceCliente;

    @GetMapping("/lista")
    @ResponseStatus(HttpStatus.OK)
    public List<Cliente> findAll(){
        return serviceCliente.findAll();
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Cliente findById(@PathVariable Integer id){
        return serviceCliente.findById(id);
    }

    @PostMapping("id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Cliente create( @PathVariable Integer id, @RequestBody Cliente cliente){
        return serviceCliente.create(cliente);
    }

    @PutMapping("id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente update( @PathVariable Integer id, @RequestBody Cliente cliente){
        return serviceCliente.updated(cliente, id);
    }
    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById( @PathVariable  Integer id){
        serviceCliente.deleteById(id);
    }
}
