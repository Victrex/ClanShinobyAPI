/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package clanshinoby.services;

import clanshinoby.DTOs.EstadoAlumnoDTO;
import clanshinoby.models.Estado;
import clanshinoby.models.EstadoAlumno;
import java.util.List;

/**
 *
 * @author PC
 */
public interface EstadoAlumnoService {
    List<EstadoAlumno> getAllEstadoAlumno();
    EstadoAlumno getEstadoAlumnoById(Integer id);
    EstadoAlumno saveEstadoAlumno(EstadoAlumno estadoAlumno);
    EstadoAlumno updateEstadoAlumnoById(Integer id, EstadoAlumno estadoAlumno);
}
