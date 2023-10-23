package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Tipo_Movimiento")
public class TipoMovimiento {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_tipo_movimiento", nullable = false)
  private Integer idTipoMovimiento;
  private String descripcion;
  private String naturaleza;

}
