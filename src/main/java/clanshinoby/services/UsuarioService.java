package clanshinoby.services;

import clanshinoby.models.Usuario;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author PC
 */

public interface UsuarioService {
    
    Usuario getUsuarioByCorreoAndContrasenia(String correo, String contrasenia);
}
