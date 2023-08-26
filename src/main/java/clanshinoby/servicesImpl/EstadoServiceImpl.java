/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clanshinoby.servicesImpl;

import clanshinoby.models.Estado;
import clanshinoby.models.EstadoCivil;
import clanshinoby.repositories.EstadoCivilRepository;
import clanshinoby.repositories.EstadoRepository;
import clanshinoby.services.EstadoCivilService;
import clanshinoby.services.EstadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
public class EstadoServiceImpl implements EstadoService{
    
    @Autowired
    private EstadoRepository estadoRepository;

    @Override
    public List<Estado> getAllEstados() {
        return estadoRepository.findAll();
    }

    @Override
    public Estado getEstadoById(Integer id) {
        return estadoRepository.findById(id).orElse(null);
    }
    
}
