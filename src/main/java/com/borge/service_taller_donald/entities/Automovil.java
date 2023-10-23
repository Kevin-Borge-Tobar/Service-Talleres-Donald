package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "automovil")
public class Automovil {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id_automovil")
  private Integer idAutomovil;
  @Column(name="id_Linea")
  private Integer idLinea;
  @Column(name="id_marca")
  private Integer idMarca;
  private String placa;
  private String vin;
  private String motor;
  private String modelo;
  private String color;
}
