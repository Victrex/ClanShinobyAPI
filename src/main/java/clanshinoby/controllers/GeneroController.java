/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clanshinoby.controllers;


import clanshinoby.models.Genero;
import clanshinoby.servicesImpl.GeneroServiceImpl;
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
@RequestMapping("/genero")
public class GeneroController {
    @Autowired
    private GeneroServiceImpl GeneroService;
    
    @GetMapping("/{id}")
    public Genero getCintaById(@PathVariable Integer id) {
        return GeneroService.getGeneroByID(id);
    }
    
    @GetMapping("/")
    public List<Genero> getAllCinta() {
        return GeneroService.getAllGenero();
    }
}
