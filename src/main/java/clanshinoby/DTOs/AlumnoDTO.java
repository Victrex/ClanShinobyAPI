/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clanshinoby.DTOs;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author PC
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlumnoDTO {
    @JsonProperty
    private int idAlumno;
    @JsonProperty
    private String primerNombre;
    @JsonProperty
    private String segundoNombre;
    @JsonProperty
    private String primerApellido;
    @JsonProperty
    private String segundoApellido;
    @JsonProperty
    public String codigoAlumno;
    @JsonProperty
    private int idGenero;
    @JsonProperty
    private String nombreGenero;
    @JsonProperty
    private LocalDate fechaNacimiento;
    @JsonProperty
    private String direccion;
    @JsonProperty
    private String ciudad;
    @JsonProperty
    private String telefono;
    @JsonProperty
    private String idCelular;
    @JsonProperty
    private int peso;
    @JsonProperty
    private int idEstadoCivil;
    @JsonProperty
    private int idTipoSangre;
    @JsonProperty
    private String enfermedadCronica;
    @JsonProperty
    private int idCinta;
    
}
