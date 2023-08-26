/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clanshinoby.servicesImpl;

import clanshinoby.models.Alumno;
import clanshinoby.models.EstadoPago;
import clanshinoby.models.PagoMensual;
import clanshinoby.repositories.PagoMensualRepository;
import clanshinoby.services.PagoMensualService;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
public class PagoMensualServiceImpl implements PagoMensualService{

    @Autowired
    private PagoMensualRepository pagoMensualRepository;

    @Autowired
    private AlumnoServiceImpl alumnoService;

    @Autowired
    private EstadoPagoServiceImpl estadoPagoService;
    
    @Override
    public List<PagoMensual> getAllPagoMensual() {
        return pagoMensualRepository.findAll();
    }

    @Override
    public PagoMensual savePagoMensual(PagoMensual pagoMensual) {
        return pagoMensualRepository.save(pagoMensual);
    }

    @Override
    public PagoMensual getPagoMensualById(Integer Id) {
        return pagoMensualRepository.findById(Id).orElse(null);
    }

    @Override
    public PagoMensual updatePagoMensualById(Integer id, PagoMensual pagoMensual) {
        return pagoMensualRepository.save(pagoMensual);
    }

    @Override
    public void deletePagoMensualById(Integer id) {
        pagoMensualRepository.deleteById(id);
    }

    @Override
    public List<PagoMensual> getPagoMensualByIdAlumno(Integer id) {
        return pagoMensualRepository.findAllByIdAlumno(id);
    }

    @Override
    public List<PagoMensual> getAllPagoMensualByIdEstado(Integer id) {
        return pagoMensualRepository.findAllByIdEstadoPago(id);
    }

    @Override
    public List<PagoMensual> getAllPagosByAlumno(Integer idAlumno) {
        return pagoMensualRepository.findByidAlumno_idAlumno(idAlumno);
    }


    
    @Override
    public List<PagoMensual> obtenerPagosPorEstado(Integer idEstadoPago) {
        EstadoPago estadoPago = estadoPagoService.getEstadoPagoById(idEstadoPago);
        return pagoMensualRepository.findByIdEstadoPago(estadoPago);
    }

    @Override
    public List<PagoMensual> obtenerPagosMensualesPorAlumnoYEstadoPago(Integer idAlumno, Integer idEstadoPago) {
        Alumno alumno = alumnoService.getAlumnoById(idAlumno);
        EstadoPago estadoPago = estadoPagoService.getEstadoPagoById(idEstadoPago);
        return pagoMensualRepository.findByidAlumnoAndIdEstadoPago(alumno, estadoPago);
    }
    @Override
    public List<PagoMensual> getPagosByCurrentMonth() {
        LocalDate currentDate = LocalDate.now();
        Integer currentMonth = currentDate.getMonthValue();
        Integer currentYear = currentDate.getYear();
        return pagoMensualRepository.findPagosByMonthAndYear(currentMonth, currentYear);
    }
    
}
