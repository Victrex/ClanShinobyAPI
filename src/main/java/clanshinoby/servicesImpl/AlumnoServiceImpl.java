/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clanshinoby.servicesImpl;

import clanshinoby.models.Alumno;
import clanshinoby.repositories.AlumnoRepository;
import clanshinoby.services.AlumnoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
public class AlumnoServiceImpl implements AlumnoService{
    @Autowired
    private AlumnoRepository alumnoRepository;

    @Override
    public Alumno saveAlumno(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    @Override
    public List<Alumno> getAllAlumnos() {
        return alumnoRepository.findAll();
    }

    @Override
    public Alumno getAlumnoById(Integer id) {
        return alumnoRepository.findById(id).orElse(null);
    }
    
    @Override
    public void deleteAlumnoById(Integer id) {
        alumnoRepository.deleteById(id);
    }

    @Override
    public Alumno updateAlumnoById(Integer id, Alumno alumno) {
        return alumnoRepository.save(alumno); 
    }
}
