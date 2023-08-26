/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clanshinoby.servicesImpl;

import clanshinoby.models.EstadoCivil;
import clanshinoby.repositories.EstadoCivilRepository;
import clanshinoby.services.EstadoCivilService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
public class EstadoCivilServiceImpl implements EstadoCivilService{
    
    @Autowired
    private EstadoCivilRepository estadoCivilRepository;
    
    

    @Override
    public List<EstadoCivil> getAllEstadoCivil() {
        return this.estadoCivilRepository.findAll();
    }

    @Override
    public EstadoCivil getEstadoCivilById(Integer id) {
        return this.estadoCivilRepository.findById(id).orElse(null);
    }
    
}
