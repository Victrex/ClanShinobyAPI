/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clanshinoby.controllers;

import clanshinoby.DTOs.MontoDTO;
import clanshinoby.models.Monto;
import clanshinoby.services.MontoService;
import clanshinoby.servicesImpl.MontoServiceImpl;
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
@RequestMapping("/monto")
public class MontoController {
    
    @Autowired
    private MontoServiceImpl montoService;
    
    @GetMapping("/")
    public List<Monto> getAllMonto() {
        return montoService.getAllMonto();
    }
    
    @GetMapping("/{id}")
    public Monto getMontoById(@PathVariable Integer id) {
        return montoService.getMontoById(id);
    }
    
    @PostMapping("/save")
    public Monto saveMonto(@RequestBody MontoDTO montoDTO) {
        Monto monto = new Monto();
        monto.setMonto(montoDTO.getMonto());
        return montoService.saveMonto(monto);
    }
    
    @PutMapping("/update/{id}")
    public Monto updateById(@PathVariable Integer id, @RequestBody MontoDTO montoDTO) {
        Monto monto = montoService.getMontoById(id);
        monto.setMonto(montoDTO.getMonto());
        return this.montoService.updateById(id, monto);
    }
}
