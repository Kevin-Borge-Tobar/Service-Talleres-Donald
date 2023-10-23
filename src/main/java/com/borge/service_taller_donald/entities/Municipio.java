package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Municipio")
public class Municipio {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_municipio")
  private Integer idMunicipio;
  @ManyToOne()
  @JoinColumn(name = "id_departamento")
  private Departamento departamento;
  private String descripcion;

}
//EL primer atributo corresponde a la entidad y el segundo al atributo

