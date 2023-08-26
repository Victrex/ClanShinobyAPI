/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package clanshinoby.services;

import clanshinoby.DTOs.MontoDTO;
import clanshinoby.models.Monto;
import java.util.List;

/**
 *
 * @author PC
 */
public interface MontoService {
    List<Monto> getAllMonto();
    Monto saveMonto(Monto monto);
    Monto updateById(Integer id, Monto monto);
    Monto getMontoById(Integer id);
}
