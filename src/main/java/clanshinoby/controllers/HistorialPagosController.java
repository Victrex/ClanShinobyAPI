/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clanshinoby.controllers;

import clanshinoby.models.HistorialPagos;
import clanshinoby.servicesImpl.HistorialPagosServiceImpl;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PC
 */
@RestController
@RequestMapping("/historialPagos")
public class HistorialPagosController {
    @Autowired
    private HistorialPagosServiceImpl historialPagosService;

    // Endpoint para obtener todos los registros de historial de pagos
    @GetMapping("/getAll")
    public List<HistorialPagos> getAllHistorialPagos() {
        return historialPagosService.getAllHistorialPagos();
    }
    
    @GetMapping("/actual")
    public List<HistorialPagos> getAllHistorialPagosActual() {
        LocalDate mesActual = LocalDate.now();
        return historialPagosService.getAllHistorialPagosByMes(mesActual.getMonthValue(), mesActual.getYear());
    }
    
    @GetMapping("/anterior")
    public List<HistorialPagos> findAllByMonthAndYear() {
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaMesAnterior = fechaActual.minusMonths(1);
        return historialPagosService.getAllHistorialPagosByMesAnterior(fechaMesAnterior.getMonthValue(), fechaMesAnterior.getYear());
    }
    
    @GetMapping("/anio/{year}")
    public List<HistorialPagos> getAllByYear(@PathVariable int year) {
        return historialPagosService.getAllByYear(year);
    }
}
