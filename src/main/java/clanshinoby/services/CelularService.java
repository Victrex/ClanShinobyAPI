/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package clanshinoby.services;

import clanshinoby.models.Celular;
import clanshinoby.repositories.CelularRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author PC
 */
public interface CelularService {
    List<Celular> getAllCelular();
    Celular getCelularById(int idCelular);
    Celular saveCelular(Celular celular);
    Celular updateCelularById(Integer id, Celular celular);
    void deleteCelularById(Integer id);
    Celular getCelularByNoCelular(String noCelular);
}
