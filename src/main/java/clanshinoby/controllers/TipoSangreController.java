/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clanshinoby.controllers;

import clanshinoby.models.TipoSangre;
import clanshinoby.servicesImpl.TipoSangreServiceImpl;
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
@RequestMapping("/tipoSangre")
public class TipoSangreController {
    @Autowired
    private TipoSangreServiceImpl tipoSangreService;
    
    @GetMapping("/")
    public List<TipoSangre> getAllTipoSangre(){
        return tipoSangreService.getAllTipoSangre();
    }
    
    @GetMapping("/{id}")
    public TipoSangre getTipoSangreById(@PathVariable Integer id){
        return this.tipoSangreService.getTipoSangreById(id);
    }
}
