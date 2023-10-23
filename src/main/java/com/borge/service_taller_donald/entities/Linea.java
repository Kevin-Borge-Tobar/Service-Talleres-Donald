package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Linea")
public class Linea {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_linea")
  private Integer idLinea;
  @Column(name= "id_marca")
  private Integer idMarca;
  private  String descripcion;

}
