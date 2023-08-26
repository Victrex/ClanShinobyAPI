/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clanshinoby.servicesImpl;

import clanshinoby.DTOs.MontoDTO;
import clanshinoby.models.Monto;
import clanshinoby.repositories.MontoRepository;
import clanshinoby.services.MontoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
public class MontoServiceImpl implements MontoService{
    @Autowired
    private MontoRepository montoRepository;
    
    
    @Override
    public List<Monto> getAllMonto() {
        return montoRepository.findAll();
    }

    @Override
    public Monto saveMonto(Monto monto) {
        return montoRepository.save(monto);
    }

    @Override
    public Monto updateById(Integer id, Monto monto) {
        return montoRepository.save(monto);
    }

    @Override
    public Monto getMontoById(Integer id) {
        return montoRepository.findById(id).orElse(null);
    }
    
}
