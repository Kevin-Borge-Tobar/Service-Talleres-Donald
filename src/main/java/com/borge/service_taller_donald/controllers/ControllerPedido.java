package com.borge.service_taller_donald.controllers;

import com.borge.service_taller_donald.entities.OrdenTrabajo;
import com.borge.service_taller_donald.entities.Pedido;
import com.borge.service_taller_donald.services.ServicePedido;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedido")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ControllerPedido {
    private ServicePedido servicePedido;

    @GetMapping("/lista")
    @ResponseStatus(HttpStatus.OK)
    public List<Pedido> findAll(){
        return servicePedido.findAll();
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Pedido findById(@PathVariable Integer id){
        return servicePedido.findById(id);
    }

    @PostMapping("id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Pedido create( @PathVariable Integer id, @RequestBody Pedido pedido){
        return servicePedido.create(pedido);
    }

    @PutMapping("id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Pedido update( @PathVariable Integer id, @RequestBody Pedido pedido){
        return servicePedido.updated(pedido, id);
    }
    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById( @PathVariable  Integer id){
        servicePedido.deleteById(id);
    }
}
