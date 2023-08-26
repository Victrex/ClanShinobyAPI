/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clanshinoby.servicesImpl;

import clanshinoby.models.HistorialPagos;
import clanshinoby.repositories.HistorialPagosRepository;
import clanshinoby.services.HistorialPagosService;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
public class HistorialPagosServiceImpl implements HistorialPagosService {
    @Autowired
    private HistorialPagosRepository historialPagosRepository;
    @Override
    public List<HistorialPagos> getAllHistorialPagos() {
        return historialPagosRepository.findAll();
    }

    @Override
    public List<HistorialPagos> getHistorialPagosByMonth() {
        LocalDate now = LocalDate.now();
        LocalDate startOfMonth = now.withDayOfMonth(1);
        LocalDate endOfMonth = now.withDayOfMonth(now.lengthOfMonth());
        return historialPagosRepository.findByFechaBetween(startOfMonth, endOfMonth);
    }
    @Override
    public List<HistorialPagos> getAllHistorialPagosByMes(int mes, int anio) {
        LocalDate desde = LocalDate.of(anio, mes, 1);
        LocalDate hasta = LocalDate.of(anio, mes, desde.lengthOfMonth());
        return historialPagosRepository.findAllByFechaBetween(desde, hasta);
    }
    

    @Override
    public List<HistorialPagos> getAllHistorialPagosByMesAnterior(int mes, int anio) {
        LocalDate desde = LocalDate.of(anio, mes, 1);
        LocalDate hasta = LocalDate.of(anio, mes, desde.lengthOfMonth());
        return historialPagosRepository.findAllByFechaBetween(desde, hasta);
    }
    
    @Override
    public List<HistorialPagos> getAllByYear(int year) {
        LocalDate inicioAnio = LocalDate.of(year, 1, 1);
        LocalDate finAnio = LocalDate.of(year, 12, 31);
        return historialPagosRepository.findAllByFechaBetween(inicioAnio, finAnio);
    }
}
