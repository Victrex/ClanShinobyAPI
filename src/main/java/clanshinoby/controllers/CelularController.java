/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clanshinoby.controllers;

import clanshinoby.DTOs.CelularDTO;
import clanshinoby.models.Celular;
import clanshinoby.servicesImpl.CelularServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
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
@RequestMapping("/cel")
public class CelularController {
    @Autowired
    private CelularServiceImpl celularService;
    
    
    @GetMapping("/")
    public List<Celular> getAllCelular() {
        return this.celularService.getAllCelular();
    }
    
    @GetMapping("/one/{noCelular}")
    public Celular getCelularByNoCelular(@PathVariable String noCelular) {
        return celularService.getCelularByNoCelular(noCelular);
    }
    
    @PostMapping("/save")
    public Celular guardarCelular(@RequestBody CelularDTO celularDTO){
        Celular cel = new Celular();
        cel.setNoCelular(celularDTO.getNoCelular());
        return this.celularService.saveCelular(cel);
    }
    
    @GetMapping("/{id}")
    public Celular getCelularById(@PathVariable Integer id){
        return this.celularService.getCelularById(id);
    }
    
    @PutMapping("/update/{id}")
    public Celular updateCelular(@PathVariable int id, @RequestBody CelularDTO celularDTO){
        Celular cel = this.celularService.getCelularById(id);
        cel.setNoCelular(celularDTO.getNoCelular());
        return this.celularService.updateCelularById(id, cel);
    }
    @DeleteMapping("deleteCelular/{id}")
    public ResponseEntity<Void> deleteCelularById(@PathVariable Integer id) {
        celularService.deleteCelularById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
