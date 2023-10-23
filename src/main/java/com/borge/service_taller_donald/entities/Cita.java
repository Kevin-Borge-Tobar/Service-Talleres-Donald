package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Cita")
public class Cita {
  @Id
  @GeneratedValue
  @Column(name = "id_cita")
  private Integer idCita;
  @Column(name = "id_sucursal")
  private Integer idSucursal;
  @Column(name = "id_cliente")
  private Integer idCliente;
  @Column(name = "id_automovil")
  private  Integer idAutomovil;
  @Column(name = "id_empleado")
  private Integer idEmpleado;
  @Column(name="fecha_emision")
  @Temporal(TemporalType.DATE)
  private Date fechaEmision;
  @Column(name="fecha_recepcion")
  @Temporal(TemporalType.DATE)
  private Date fechaRecepcion;
}
