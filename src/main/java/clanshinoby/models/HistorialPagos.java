/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clanshinoby.models;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import java.io.Serializable;
import java.time.LocalDate;
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

/**
 *
 * @author PC
 */
@Entity
@Table(name = "historialpagos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HistorialPagos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idhistorialpagos")
    private int idHistorialPagos;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idalumno", nullable = false)
    @JsonIncludeProperties({"idAlumno", "primerNombre", "primerApellido", "codigoAlumno","cinta", "estadoAlumno"})
    private Alumno alumno;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @Column(name = "montopagado", nullable = false)
    private float montoPagado;
}
