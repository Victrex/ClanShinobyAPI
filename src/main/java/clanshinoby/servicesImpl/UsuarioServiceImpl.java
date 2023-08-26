/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clanshinoby.servicesImpl;

import clanshinoby.models.Usuario;
import clanshinoby.repositories.UsuarioRepository;
import clanshinoby.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Override
    public Usuario getUsuarioByCorreoAndContrasenia(String correo, String contrasenia) {
        return usuarioRepository.findOneByCorreoAndContrasenia(correo, contrasenia);
    }
    
}
