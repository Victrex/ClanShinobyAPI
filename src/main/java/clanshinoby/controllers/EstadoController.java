/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clanshinoby.controllers;

import clanshinoby.models.Estado;
import clanshinoby.services.EstadoService;
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
@RequestMapping("/estados")
public class EstadoController {
    @Autowired
    private EstadoService estadoService;


    @GetMapping("/")
    public List<Estado> getAllEstados() {
        return estadoService.getAllEstados();
    }

    @GetMapping("/{id}")
    public Estado getEstadoById(@PathVariable int id) {
        return estadoService.getEstadoById(id);
    }
}
