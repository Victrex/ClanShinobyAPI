/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clanshinoby.controllers;

import clanshinoby.models.EstadoPago;
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
@RequestMapping("/estadoPago")
public class EstadoPagoController {
    @Autowired
    private EstadoPagoServiceImpl estadoPagoService;
    
    @GetMapping("/")
    public List<EstadoPago> getAllEstadoPago(){
        return estadoPagoService.getAllEstadoPago();
    }
    
    @GetMapping("/{id}")
    public EstadoPago getEstadoPagoById(@PathVariable Integer id){
        return estadoPagoService.getEstadoPagoById(id);
    }
}
