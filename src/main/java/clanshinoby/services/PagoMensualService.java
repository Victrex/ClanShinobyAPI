/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clanshinoby.services;

import clanshinoby.models.Alumno;
import clanshinoby.models.PagoMensual;
import java.util.List;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author PC
 */
public interface PagoMensualService {
    List<PagoMensual> getAllPagoMensual();
    PagoMensual savePagoMensual(PagoMensual PagoMensual);
    PagoMensual getPagoMensualById(Integer Id);
    PagoMensual updatePagoMensualById(Integer id, PagoMensual pagoMensual);
    void deletePagoMensualById(Integer id);
    List<PagoMensual> getPagoMensualByIdAlumno(Integer id);
    List<PagoMensual> getAllPagoMensualByIdEstado(Integer id);
    List<PagoMensual> getAllPagosByAlumno(Integer idAlumno);
    
    List<PagoMensual> obtenerPagosPorEstado(Integer idEstadoPago);
    List<PagoMensual> obtenerPagosMensualesPorAlumnoYEstadoPago(Integer idAlumno, Integer idEstadoPago);
    List<PagoMensual> getPagosByCurrentMonth();
}
