package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tipo_Movimiento_Nomina")
public class TipoMovimientoNomina {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_tipo_movimiento_nomina", nullable = false)
  private Integer idTipoMovimientoNomina;
  private String descripcion;
  private String naturaleza;
  @Column(name="afecto_igss")
  private String afectoIggs;
  @Column(name="afecto_isr")
  private String afectoIsr;

}
