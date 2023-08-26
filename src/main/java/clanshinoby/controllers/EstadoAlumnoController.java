/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clanshinoby.controllers;

import clanshinoby.DTOs.EstadoAlumnoDTO;
import clanshinoby.models.Alumno;
import clanshinoby.models.Estado;
import clanshinoby.models.EstadoAlumno;
import clanshinoby.services.AlumnoService;
import clanshinoby.services.EstadoAlumnoService;
import clanshinoby.services.EstadoService;
import clanshinoby.servicesImpl.AlumnoServiceImpl;
import clanshinoby.servicesImpl.EstadoAlumnoServiceImpl;
import clanshinoby.servicesImpl.EstadoServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PC
 */
@RestController
@RequestMapping("/estadoAlumno")
public class EstadoAlumnoController {
    @Autowired
    private EstadoAlumnoServiceImpl estadoAlumnoService;

    @Autowired
    private EstadoServiceImpl estadoService;
    
    @Autowired
    private AlumnoServiceImpl alumnoService;
    
    // Endpoint para crear un nuevo estado de alumno
    @PostMapping("/save")
    public EstadoAlumno saveEstadoAlumno(@RequestBody EstadoAlumnoDTO estadoAlumnoDTO) {
        Alumno alumno = alumnoService.getAlumnoById(estadoAlumnoDTO.getIdAlumno());
        Estado estado = estadoService.getEstadoById(estadoAlumnoDTO.getIdEstado());

        EstadoAlumno estadoAlumno = new EstadoAlumno();
        estadoAlumno.setAlumno(alumno);
        estadoAlumno.setEstado(estado);

        return estadoAlumnoService.saveEstadoAlumno(estadoAlumno);
    }
    
    // Endpoint para obtener todos los estados de alumno
    @GetMapping("/")
    public List<EstadoAlumno> getAllEstadoAlumno() {
        return estadoAlumnoService.getAllEstadoAlumno();
    }

    // Endpoint para obtener un estado de alumno por su ID
    @GetMapping("/{id}")
    public EstadoAlumno getEstadoAlumnoById(@PathVariable int id) {
        return estadoAlumnoService.getEstadoAlumnoById(id);
    }

    


    @PutMapping("/update/{id}")
    public EstadoAlumno updateEstadoAlumnoById(@PathVariable int id, @RequestBody EstadoAlumnoDTO estadoAlumnoDTO) {
        EstadoAlumno estadoAlumno = this.estadoAlumnoService.getEstadoAlumnoById(id);
        
        Alumno alumno = alumnoService.getAlumnoById(estadoAlumnoDTO.getIdAlumno());
        Estado estado = estadoService.getEstadoById(estadoAlumnoDTO.getIdEstado());
        estadoAlumno.setAlumno(alumno);
        estadoAlumno.setEstado(estado);
        
        return estadoAlumnoService.updateEstadoAlumnoById(id, estadoAlumno);
    }
}
