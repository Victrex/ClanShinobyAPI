/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clanshinoby.models;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author PC
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Inscripcion")
public class Inscripcion implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idinscripcion")
    private Integer idInscripcion;
    
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idalumno")
    @JsonIncludeProperties({"idAlumno", "primerNombre","primerApellido"})
    private Alumno alumno;
}
