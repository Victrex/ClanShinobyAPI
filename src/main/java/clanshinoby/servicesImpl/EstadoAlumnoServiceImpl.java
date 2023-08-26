/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clanshinoby.servicesImpl;

import clanshinoby.DTOs.EstadoAlumnoDTO;
import clanshinoby.models.Estado;
import clanshinoby.models.EstadoAlumno;
import clanshinoby.models.EstadoCivil;
import clanshinoby.repositories.EstadoAlumnoRepository;
import clanshinoby.repositories.EstadoCivilRepository;
import clanshinoby.repositories.EstadoRepository;
import clanshinoby.services.AlumnoService;
import clanshinoby.services.EstadoAlumnoService;
import clanshinoby.services.EstadoCivilService;
import clanshinoby.services.EstadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
public class EstadoAlumnoServiceImpl implements EstadoAlumnoService{
    
    @Autowired
    private EstadoAlumnoRepository estadoAlumnoRepository;

    @Override
    public List<EstadoAlumno> getAllEstadoAlumno() {
        return estadoAlumnoRepository.findAll();
    }

    @Override
    public EstadoAlumno getEstadoAlumnoById(Integer id) {
         return estadoAlumnoRepository.findById(id).orElse(null); 
    }

    @Override
    public EstadoAlumno saveEstadoAlumno(EstadoAlumno estadoAlumno) {
        return estadoAlumnoRepository.save(estadoAlumno); 
    }


    @Override
    public EstadoAlumno updateEstadoAlumnoById(Integer id, EstadoAlumno estadoAlumno) {
        return estadoAlumnoRepository.save(estadoAlumno);  
    }
    
}
