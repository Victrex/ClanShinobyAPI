/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package clanshinoby.services;

import clanshinoby.models.Cinta;
import java.util.List;

/**
 *
 * @author PC
 */
public interface CintaService {
    List<Cinta> getAllCinta();
    Cinta getCintaById(Integer id);
}
