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
import lombok.Generated;
import lombok.NoArgsConstructor;
import net.bytebuddy.implementation.bind.annotation.AllArguments;

/**
 *
 * @author PC
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name="pagomensual")
public class PagoMensual implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idpagomensual")
    private Integer idPagoMensual;
    
    @Column(name="fechapago")
    private LocalDate fechaPago;
    
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name="idalumno", nullable = false)
    @JsonIncludeProperties({"idAlumno", "primerNombre", "primerApellido", "codigoAlumno"})
    private Alumno idAlumno;
    
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name="idmonto", nullable = false)
    @JsonIncludeProperties({"idMonto", "monto"})
    private Monto idMonto;
    
    @Column(name="montopagado")
    private float montoPagado;
    
    @Column(name="montopendiente")
    private float montoPendiente;
    
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name="idestadopago", nullable = false)
    @JsonIncludeProperties({"idEstadoPago", "estadoPago"})
    private EstadoPago idEstadoPago;
    
}
