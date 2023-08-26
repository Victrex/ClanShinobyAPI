/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clanshinoby.controllers;

import clanshinoby.DTOs.AlumnoDTO;
import clanshinoby.models.Alumno;
import clanshinoby.models.Celular;
import clanshinoby.models.Cinta;
import clanshinoby.models.Estado;
import clanshinoby.models.EstadoAlumno;
import clanshinoby.models.EstadoCivil;
import clanshinoby.models.Genero;
import clanshinoby.models.TipoSangre;
import clanshinoby.services.EstadoAlumnoService;
import clanshinoby.servicesImpl.AlumnoServiceImpl;
import clanshinoby.servicesImpl.CelularServiceImpl;
import clanshinoby.servicesImpl.CintaServiceImpl;
import clanshinoby.servicesImpl.EstadoAlumnoServiceImpl;
import clanshinoby.servicesImpl.EstadoCivilServiceImpl;
import clanshinoby.servicesImpl.EstadoServiceImpl;
import clanshinoby.servicesImpl.GeneroServiceImpl;
import clanshinoby.servicesImpl.TipoSangreServiceImpl;
import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

/**
 *
 * @author PC
 */
@RestController
@RequestMapping("/alumno")
public class AlumnoController {
    @Autowired
    private AlumnoServiceImpl alumnoService;
    @Autowired
    private GeneroServiceImpl generoService;
    @Autowired
    private CelularServiceImpl celularService;
    @Autowired
    private CintaServiceImpl cintaService;
    @Autowired
    private EstadoCivilServiceImpl estadoCivilService;
    @Autowired
    private TipoSangreServiceImpl tipoSangreService;
    @Autowired
    private EstadoAlumnoServiceImpl estadoAlumnoService;
    @Autowired
    private EstadoServiceImpl estadoService;
    
    @PostMapping("/save")
    public Alumno guardarAlumno(@RequestBody AlumnoDTO alumnoDTO) {
        Alumno al = new Alumno();
        Genero genero = this.generoService.getGeneroByID(alumnoDTO.getIdGenero());
        EstadoCivil estadoCivil = this.estadoCivilService.getEstadoCivilById(alumnoDTO.getIdEstadoCivil());
        Celular celularFlag = this.celularService.getCelularByNoCelular(alumnoDTO.getIdCelular());
        Celular celular = celularFlag;
        if(celularFlag==null){
            Celular newCelular = new Celular();
            newCelular.setNoCelular(alumnoDTO.getIdCelular());
             celularService.saveCelular(newCelular);
            celular = celularService.getCelularByNoCelular(alumnoDTO.getIdCelular());
        }else{
            celular = celularFlag;
        }
        Cinta cinta = this.cintaService.getCintaById(alumnoDTO.getIdCinta());
        TipoSangre tipoSangre = this.tipoSangreService.getTipoSangreById(alumnoDTO.getIdTipoSangre());
        
        al.setPrimerNombre(alumnoDTO.getPrimerNombre());
        al.setSegundoNombre(alumnoDTO.getSegundoNombre());
        al.setPrimerApellido(alumnoDTO.getPrimerApellido());
        al.setSegundoApellido(alumnoDTO.getSegundoApellido());
        al.setGenero(genero);
        al.setCodigoAlumno(alumnoDTO.codigoAlumno);
        al.setFechaNacimiento(alumnoDTO.getFechaNacimiento());
        al.setDireccion(alumnoDTO.getDireccion());
        al.setCiudad(alumnoDTO.getCiudad());
        al.setTelefono(alumnoDTO.getTelefono());
        al.setCelular(celular);
        al.setPeso(alumnoDTO.getPeso());
        al.setEstadoCivil(estadoCivil);
        al.setTipoSangre(tipoSangre);
        al.setEnfermedadCronica(alumnoDTO.getEnfermedadCronica());
        al.setCinta(cinta);

        return this.alumnoService.saveAlumno(al);
    }


    @GetMapping("/{id}")
    public Alumno getAlumnoById(@PathVariable Integer id) {
        return this.alumnoService.getAlumnoById(id);
    }

    @GetMapping("/")
    public ResponseEntity<List<Alumno>> getAllAlumnos() {
        return new ResponseEntity<>(alumnoService.getAllAlumnos(), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public Alumno UpdateteAlumno(@PathVariable int id, @RequestBody AlumnoDTO alumnoDTO) {
        try{
            Alumno al = this.alumnoService.getAlumnoById(id);

            Genero genero = this.generoService.getGeneroByID(alumnoDTO.getIdGenero());
            EstadoCivil estadoCivil = this.estadoCivilService.getEstadoCivilById(alumnoDTO.getIdEstadoCivil());
            Celular celularFlag = this.celularService.getCelularByNoCelular(alumnoDTO.getIdCelular());
            Celular celular = celularFlag;
            if(celularFlag==null){
                Celular newCelular = new Celular();
                newCelular.setNoCelular(alumnoDTO.getIdCelular());
                 celularService.saveCelular(newCelular);
                celular = celularService.getCelularByNoCelular(alumnoDTO.getIdCelular());
            }else{
                celular = celularFlag;
            }
            Cinta cinta = this.cintaService.getCintaById(alumnoDTO.getIdCinta());
            TipoSangre tipoSangre = this.tipoSangreService.getTipoSangreById(alumnoDTO.getIdTipoSangre());
            al.setPrimerNombre(alumnoDTO.getPrimerNombre());
            al.setSegundoNombre(alumnoDTO.getSegundoNombre());
            al.setPrimerApellido(alumnoDTO.getPrimerApellido());
            al.setSegundoApellido(alumnoDTO.getSegundoApellido());
            al.setGenero(genero);
            al.setCodigoAlumno(alumnoDTO.codigoAlumno);
            al.setFechaNacimiento(alumnoDTO.getFechaNacimiento());
            al.setDireccion(alumnoDTO.getDireccion());
            al.setCiudad(alumnoDTO.getCiudad());
            al.setTelefono(alumnoDTO.getTelefono());
            al.setCelular(celular);
            al.setPeso(alumnoDTO.getPeso());
            al.setEstadoCivil(estadoCivil);
            al.setTipoSangre(tipoSangre);
            al.setEnfermedadCronica(alumnoDTO.getEnfermedadCronica());
            al.setCinta(cinta);
            
            return this.alumnoService.updateAlumnoById(id, al);
        }catch (NoSuchElementException e) {
        // Manejo de la excepción en caso de que el registro no exista
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "El alumno con ID " + id + " no existe", e);
    }
        
    }

    @DeleteMapping("deleteAlumno/{id}")
    public ResponseEntity<Void> deleteAlumnoById(@PathVariable Integer id) {
        alumnoService.deleteAlumnoById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
