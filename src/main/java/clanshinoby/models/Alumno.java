package clanshinoby.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author PC
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "Alumno")
public class Alumno implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idalumno")
    private Integer idAlumno;

    @Column(name = "primernombre", nullable = false)
    private String primerNombre;

    @Column(name = "segundonombre")
    private String segundoNombre;

    @Column(name = "primerapellido", nullable = false)
    private String primerApellido;

    @Column(name = "segundoapellido")
    private String segundoApellido;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idgenero", nullable = false)
    @JsonIncludeProperties({"idGenero","genero"})
    private Genero genero;

    @Column(name = "fechanacimiento", nullable = false)
    private LocalDate fechaNacimiento;

    @Column(name = "direccion", nullable = false)
    private String direccion;

    @Column(name = "ciudad", nullable = false)
    private String ciudad;
    
    @Column(name = "codigoalumno", nullable = false)
    private String codigoAlumno;

    @Column(name = "telefono")
    private String telefono;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idcelular", nullable = false)
    @JsonIncludeProperties({"idCelular","noCelular"})
    private Celular celular;

    @Column(name = "peso", nullable = false)
    private Integer peso;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idestadocivil", nullable = false)
    @JsonIncludeProperties({"idEstadoCivil", "estadoCivil"})
    private EstadoCivil estadoCivil;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idtiposangre", nullable = false)
    @JsonIncludeProperties({"idTipoSangre", "tipoSangre"})
    private TipoSangre tipoSangre;

    @Column(name = "enfermedadcronica")
    private String enfermedadCronica;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idcinta", nullable = false)
    @JsonIncludeProperties({"idCinta", "color", "kup"})
    private Cinta cinta;
    
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy = "alumno")
    @JoinColumn(name = "idestadoalumno", nullable = false)
    @JsonIncludeProperties({"idEstadoAlumno", "estado"})
    private EstadoAlumno estadoAlumno;
    
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy = "alumno")
    @JoinColumn(name = "idinscripcion", nullable = false)
    @JsonIncludeProperties({"idInscripcion", "fechaInscripcion"})
    private Inscripcion inscripcion;
    
}
