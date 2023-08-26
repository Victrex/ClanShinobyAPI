package clanshinoby.controllers;

import clanshinoby.models.Usuario;
import clanshinoby.servicesImpl.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
@RestController
@RequestMapping("/auth")
public class UsuarioController {
    @Autowired
    private UsuarioServiceImpl usuarioService;
    
    
    @GetMapping("/login")
    public Usuario obtenerUsuario(@PathVariable String correo, @PathVariable String contrasenia){
        return usuarioService.getUsuarioByCorreoAndContrasenia(correo, contrasenia);
    }        
} 

