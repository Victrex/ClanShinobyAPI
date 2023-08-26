/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clanshinoby.controllers;

import clanshinoby.models.Cinta;
import clanshinoby.servicesImpl.CintaServiceImpl;
import clanshinoby.servicesImpl.EstadoPagoServiceImpl;
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
@RequestMapping("/cinta")
public class CintaController {
    @Autowired
    private CintaServiceImpl CintaService;
    
    @GetMapping("/{id}")
    public Cinta getCintaById(@PathVariable Integer id) {
        return CintaService.getCintaById(id);
    }
    
    @GetMapping("/")
    public List<Cinta> getAllCinta() {
        return CintaService.getAllCinta();
    }
}
