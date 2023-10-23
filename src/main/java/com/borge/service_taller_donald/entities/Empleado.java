package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Empleado")
public class Empleado {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_empleado")
  private Integer idEmpleado;
  @JoinColumn(name = "id_socio_negocio")
  @OneToOne
  private SocioNegocio socioNegocio;
}
