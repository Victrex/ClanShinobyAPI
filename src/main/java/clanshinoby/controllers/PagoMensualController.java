/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clanshinoby.controllers;

import clanshinoby.DTOs.PagoMensualDTO;
import clanshinoby.models.Alumno;
import clanshinoby.models.EstadoPago;
import clanshinoby.models.Monto;
import clanshinoby.models.PagoMensual;
import clanshinoby.servicesImpl.AlumnoServiceImpl;
import clanshinoby.servicesImpl.EstadoPagoServiceImpl;
import clanshinoby.servicesImpl.MontoServiceImpl;
import clanshinoby.servicesImpl.PagoMensualServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

/**
 *
 * @author PC
 */
@RestController
@RequestMapping("/pagoMensual")
public class PagoMensualController {
    @Autowired
    private PagoMensualServiceImpl pagoMensualService;
     
    @Autowired
    private MontoServiceImpl montoService;
    
    @Autowired
    private AlumnoServiceImpl alumnoService;
    
    @Autowired
    private EstadoPagoServiceImpl EstadoPagoService;
    
    @GetMapping("/")
    public List<PagoMensual> getAllPagoMensual(){
        return pagoMensualService.getAllPagoMensual();
    }
    //OBTENER TODOS LOS PAGOSMENSUALES DE UN ALUMNO
    @GetMapping("/alumno/{idAlumno}")
    public List<PagoMensual> getAllPagosByAlumno(@PathVariable Integer idAlumno) {
        return pagoMensualService.getAllPagosByAlumno(idAlumno);
    }
    // Endpoint para obtener todos los pagos mensuales de un alumno con un estado de pago determinado
    @GetMapping("/{idAlumno}/estadopago/{idEstadoPago}")
    public List<PagoMensual> obtenerPagosMensualesPorAlumnoYEstadoPago(@PathVariable Integer idAlumno, @PathVariable Integer idEstadoPago) {
        return pagoMensualService.obtenerPagosMensualesPorAlumnoYEstadoPago(idAlumno, idEstadoPago);
    }
    //obtener todos los registros del mes actual
    @GetMapping("/actualMes")
    public List<PagoMensual> getPagosByCurrentMonth() {
        return pagoMensualService.getPagosByCurrentMonth();
    }
    
    //obtener todos los pagos pendientes
    @GetMapping("/estado/{idEstadoPago}")
    public List<PagoMensual> obtenerPagosPorEstadoPago(@PathVariable Integer idEstadoPago) {
        return pagoMensualService.obtenerPagosPorEstado(idEstadoPago); // EstadoPago = 2
    }
    
    
    
    @PostMapping("/save")
    public PagoMensual guardarPagoMensual(@RequestBody PagoMensualDTO pagoMensualDTO){
        PagoMensual pg = new PagoMensual();
        Alumno alumno = this.alumnoService.getAlumnoById(pagoMensualDTO.getIdAlumno());
        Monto monto = this.montoService.getMontoById(pagoMensualDTO.getIdMonto());
        EstadoPago estadoPago = this.EstadoPagoService.getEstadoPagoById(pagoMensualDTO.getIdEstadoPago());
        
        pg.setFechaPago(pagoMensualDTO.getFechaPago());
        pg.setIdAlumno(alumno);
        pg.setIdMonto(monto);
        pg.setMontoPagado(pagoMensualDTO.getMontoPagado());
        pg.setMontoPendiente(pagoMensualDTO.getMontoPendiente());
        pg.setIdEstadoPago(estadoPago);
        return this.pagoMensualService.savePagoMensual(pg);
    }
    
    @PutMapping("/update/{id}")
    public PagoMensual UpdatePagoMensual(@PathVariable int id, @RequestBody PagoMensualDTO pagoMensualDTO){
        try {
            PagoMensual pg = this.pagoMensualService.getPagoMensualById(id);
            
            Alumno alumno = this.alumnoService.getAlumnoById(pagoMensualDTO.getIdAlumno());
        Monto monto = this.montoService.getMontoById(pagoMensualDTO.getIdMonto());
        EstadoPago estadoPago = this.EstadoPagoService.getEstadoPagoById(pagoMensualDTO.getIdEstadoPago());
        
        pg.setFechaPago(pagoMensualDTO.getFechaPago());
        pg.setIdAlumno(alumno);
        pg.setIdMonto(monto);
        pg.setMontoPagado(pagoMensualDTO.getMontoPagado());
        pg.setMontoPendiente(pagoMensualDTO.getMontoPendiente());
        pg.setIdEstadoPago(estadoPago);
        return this.pagoMensualService.updatePagoMensualById(id, pg);
            
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "El PagoMensual con el ID " + id + " no existe", e);
        }
    }
    
}
