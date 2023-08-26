/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clanshinoby.servicesImpl;

import clanshinoby.models.Celular;
import clanshinoby.repositories.CelularRepository;
import clanshinoby.services.CelularService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
public class CelularServiceImpl implements CelularService{
    @Autowired
    private CelularRepository celularRepository; 

    @Override
    public Celular getCelularById(int idCelular) {
        return this.celularRepository.findById(idCelular).orElse(null);
    }

    @Override
    public List<Celular> getAllCelular() {
        return this.celularRepository.findAll();
    }
    
    @Override
    public Celular getCelularByNoCelular(String noCelular) {
        return celularRepository.findByNoCelular(noCelular);
    }

    @Override
    public Celular saveCelular(Celular celular) {
        return this.celularRepository.save(celular);
    }

    @Override
    public Celular updateCelularById(Integer id, Celular celular) {
        return this.celularRepository.save(celular);
    }
    @Override
    public void deleteCelularById(Integer id) {
        celularRepository.deleteById(id);
    }
    
    
}
