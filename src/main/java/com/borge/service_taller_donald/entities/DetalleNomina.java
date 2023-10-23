package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Detalle_Nomina")
public class DetalleNomina {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_detalle_Nomina", nullable = false)
  private Integer idDetalleNomina;
  @Column(name = "id_nomina")
  private Integer idNomina;
  @Column(name = "id_sucursal")
  private Integer idSucursal;
  @Column(name = "id_empleado")
  private Integer idEmpleado;
  @Column(name = "id_tipo_movimiento_nomina")
  private Integer idTipoMovimientoNomina;
  private String valor;
}
