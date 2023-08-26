/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clanshinoby.servicesImpl;

import clanshinoby.models.Genero;
import clanshinoby.repositories.GeneroRepository;
import clanshinoby.services.GeneroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
public class GeneroServiceImpl implements GeneroService{

    @Autowired
    GeneroRepository generoRepository;
    
    @Override
    public List<Genero> getAllGenero() {
        return this.generoRepository.findAll();
    }
    
    @Override
    public Genero getGeneroByID(Integer id) {
        return this.generoRepository.findById(id).orElse(null);
    }
    
}
