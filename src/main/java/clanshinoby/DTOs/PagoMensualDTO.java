/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clanshinoby.DTOs;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author PC
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PagoMensualDTO {
    private int idPagoMensual;
    private LocalDate fechaPago;
    private int idAlumno;
    private int idMonto;
    private float montoPagado;
    private float montoPendiente;
    private int idEstadoPago;
}
