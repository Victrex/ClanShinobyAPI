/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clanshinoby.servicesImpl;

import clanshinoby.models.Cinta;
import clanshinoby.repositories.CintaRepository;
import clanshinoby.services.CintaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
public class CintaServiceImpl implements CintaService{
    @Autowired
    private CintaRepository cintaRepository;
    
    
    @Override
    public Cinta getCintaById(Integer id) {
        return cintaRepository.findById(id).orElse(null);
    }

    @Override
    public List<Cinta> getAllCinta() {
        return cintaRepository.findAll();
    }
    
}
