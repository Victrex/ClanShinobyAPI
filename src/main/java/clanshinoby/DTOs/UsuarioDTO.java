/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clanshinoby.DTOs;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class UsuarioDTO {
    @JsonProperty
    private Integer idUsuario;
    @JsonProperty
    private String usuario;
    @JsonProperty
    private String primerNombre;
    @JsonProperty
    private String primerApellido;
    @JsonProperty
    private String correo;
    // No incluir la contraseña en el DTO por razones de seguridad
    @JsonProperty
    private int idEmpresa;
}
