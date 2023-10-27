package com.borge.service_taller_donald.controllers;


import com.borge.service_taller_donald.entities.Cita;
import com.borge.service_taller_donald.entities.ContratoLaboral;
import com.borge.service_taller_donald.services.IServiceCita;
import lombok.AllArgsConstructor;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("/cita")
@CrossOrigin(origins = "http://localhost:4200")
public class ControllerCita {
  private IServiceCita serviceCita;

  @GetMapping("/lista")
  @ResponseStatus(HttpStatus.OK)

  public List<Cita> findAll() {
    return serviceCita.findAll();
  }

  @GetMapping("/id/{id}")
  public ResponseEntity<?> findById(@PathVariable Integer id) {
    Map<String, Object> response = new HashMap<>();
    Cita cita = null;
    try {
      cita = serviceCita.findById(id);
    } catch (DataAccessException e) {
      response.put("message", "Error al conectar con la db");
      response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
      return new ResponseEntity<>(response, HttpStatus.NO_CONTENT);
    }

    cita = serviceCita.findById(id);
    if (cita == null) {
      response.put("message", "El cliente con id: ".concat(id.toString().concat(" no existe en la db")));
      return new ResponseEntity<>(response, HttpStatus.NO_CONTENT);
    } else {
      return new ResponseEntity<>(cita, HttpStatus.OK);
    }

  }

  @PostMapping("id/{id}")
  public ResponseEntity<?> create(@RequestBody Cita cita) {
    Map<String, Object> response = new HashMap<>();

    try {
      serviceCita.create(cita);
    } catch (DataAccessException e) {
      response.put("message", "Error al realizar el insert");
      response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
      return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    if (cita == null) {
      response.put("message", "error al guardar la cita ");
      return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    } else {
      return new ResponseEntity<>(cita, HttpStatus.CREATED);
    }
  }

  @PutMapping("id/{id}")
  public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody Cita cita) {
    Map<String, Object> response = new HashMap<>();
    Cita citaActual = serviceCita.findById(id);
    try {
      serviceCita.create(cita);
    } catch (DataAccessException e) {
      response.put("message", "Error al actualizar la cita ");
      response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
      return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    if (citaActual == null) {
      response.put("message", "No existe la cita en la db");
      return new ResponseEntity<>(response, HttpStatus.NOT_MODIFIED);
    }

    return new ResponseEntity<>(cita, HttpStatus.OK);
  }

  @DeleteMapping("/id/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public ResponseEntity<?> deleteById( @PathVariable  Integer id){
    Map<String, Object> response = new HashMap<>();
    try {
      serviceCita.deleteById(id);
    } catch (DataAccessException e) {
      response.put("message", "Error al eliminar ");
      response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
      return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    response.put("message", "cliente eliminado con exito");
    return new ResponseEntity<>(response, HttpStatus.OK);
  }

}
