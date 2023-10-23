package com.borge.service_taller_donald.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Socio_Negocio")
public class SocioNegocio {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_socio_negocio")
  private Integer idSocioNegocio;
  @Column(name = "primer_nombre")
  private String primerNombre;
  @Column(name = "segundo_nombre")
  private String segundoNombre;
  @Column(name = "primer_apellido")
  private String primerApellido;
  @Column(name= "segundo_apellido")
  private String segundoApellido;
  @Column(name ="fecha_nacimiento")
  @Temporal(TemporalType.DATE)
  private String fechaNacimiento;
  private String cui;
  private String nit;
  @Column(name = "razon_social")
  private String razonSocial;
  private String genero;
  @JoinColumn(name = "id_tipo_socio_negocio")
  @ManyToOne
  private TipoSocioNegocio tipoSocioNegocio;
}
