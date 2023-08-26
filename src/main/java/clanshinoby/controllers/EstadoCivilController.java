/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clanshinoby.controllers;

import clanshinoby.models.EstadoCivil;
import clanshinoby.servicesImpl.EstadoAlumnoServiceImpl;
import clanshinoby.servicesImpl.EstadoCivilServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PC
 */
@RestController
@RequestMapping("/estadoCivil")
public class EstadoCivilController {
    @Autowired
    EstadoCivilServiceImpl estadoCivilService;
    
    @GetMapping("/")
    public List<EstadoCivil> getAllEstadoCivil(){
        return this.estadoCivilService.getAllEstadoCivil();
    }
    @GetMapping("/{id}")
    public EstadoCivil getEstadoCivilById(@PathVariable Integer id){
        return this.estadoCivilService.getEstadoCivilById(id);
    }
}
