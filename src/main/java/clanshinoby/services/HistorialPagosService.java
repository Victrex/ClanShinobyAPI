/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package clanshinoby.services;

import clanshinoby.DTOs.HistorialPagosDTO;
import clanshinoby.models.HistorialPagos;
import java.util.List;

/**
 *
 * @author PC
 */
public interface HistorialPagosService {
    List<HistorialPagos> getAllHistorialPagos();
    List<HistorialPagos> getHistorialPagosByMonth();
    List<HistorialPagos> getAllHistorialPagosByMes(int mes, int anio);
    List<HistorialPagos> getAllHistorialPagosByMesAnterior(int mes, int anio);
    List<HistorialPagos> getAllByYear(int year);
}
