/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clanshinoby.servicesImpl;

import clanshinoby.models.EstadoPago;
import clanshinoby.repositories.EstadoPagoRepository;
import clanshinoby.services.EstadoPagoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
public class EstadoPagoServiceImpl implements EstadoPagoService{
    @Autowired
    private EstadoPagoRepository estadoPagoRepository;
    
    @Override
    public List<EstadoPago> getAllEstadoPago() {
        return estadoPagoRepository.findAll();
    }

    @Override
    public EstadoPago getEstadoPagoById(Integer id) {
        return estadoPagoRepository.findById(id).orElse(null);
    }
    
}
