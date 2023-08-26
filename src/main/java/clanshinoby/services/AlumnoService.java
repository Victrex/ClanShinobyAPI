/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package clanshinoby.services;

/**
 *
 * @author PC
 */
import clanshinoby.models.Alumno;

import java.util.List;

public interface AlumnoService {
    Alumno saveAlumno(Alumno alumno);

    List<Alumno> getAllAlumnos();

    Alumno getAlumnoById(Integer id);

    Alumno updateAlumnoById(Integer id, Alumno alumno);

    void deleteAlumnoById(Integer id);
}
