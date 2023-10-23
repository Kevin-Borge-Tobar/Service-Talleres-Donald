package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Contrato_Laboral")
public class ContratoLaboral {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id_contrato_laboral")
  private Integer idContratoLaboral;
  @Column(name = "id_taller")
  private Integer idTaller;
  @Column(name = "id_empleado")
  private Integer idEmpleado;
  @Column(name="id_puesto_laboral")
  private Integer idPuestoLaboral;
  @Column(name="id_departamento_laboral")
  private Integer idDepartamentoLaboral;
  @Column(name = "fecha_emision")
  @Temporal(TemporalType.DATE)
  private Date fechaEmision;
  private Float salario;
  private String estado;
}
