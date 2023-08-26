/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clanshinoby.servicesImpl;

import clanshinoby.models.TipoSangre;
import clanshinoby.repositories.TipoSangreRepository;
import clanshinoby.services.TipoSangreService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
public class TipoSangreServiceImpl implements TipoSangreService{
    @Autowired
    private TipoSangreRepository tipoSangreRepository;

    @Override
    public TipoSangre getTipoSangreById(Integer id) {
        return this.tipoSangreRepository.findById(id).orElse(null);
    }

    @Override
    public List<TipoSangre> getAllTipoSangre() {
        return this.tipoSangreRepository.findAll();
    }


    
}
