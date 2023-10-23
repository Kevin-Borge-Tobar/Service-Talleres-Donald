package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Resumen_Nomina")
public class ResumenNomina {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_resumen_nomina")
  private Integer idResumenNomina;
  @Column(name = "id_nomina")
  private Integer idNomina;
  @Column(name = "id_sucursal")
  private Integer idSucursal;
  @Column(name = "id_empleado")
  private Integer idEmpleado;
  private  Float salario;
  private  Float anticipo;
  @Column(name="bonificacion_incentivo")
  private Float bonificacionIncentivo;
  private Float viaticos;
  private Float otros;
  private Float iggs;
  private Float isr;
  @Column(name="seguro_medico")
  private Float seguroMedico;
  @Column(name="otros_descuentos")
  private Float otrosDescuentos;
  @Column(name="total_descuentos")
  private Float totalDescuentos;
  private Float liquido;


}
