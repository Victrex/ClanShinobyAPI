package clanshinoby.models;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "Usuario")
public class Usuario implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idusuario")
    private Integer idUsuario;
    
    @Column(name = "usuario", nullable = false)
    private String usuario;
    
    @Column(name = "primernombre", nullable = false)
    private String primerNombre;

    @Column(name = "primerapellido", nullable = false)
    private String primerApellido;
    
    @Column(name = "correo", nullable = false)
    private String correo;

    @Column(name = "contrasenia", nullable = false)
    private String contrasenia;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idempresa", nullable = false)
    @JsonIncludeProperties({"idEmpresa","nombre"})
    private Empresa idEmpresa;
    
}
