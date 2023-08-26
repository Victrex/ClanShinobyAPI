/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package clanshinoby.repositories;

import clanshinoby.models.Alumno;
import clanshinoby.models.EstadoPago;
import clanshinoby.models.PagoMensual;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author PC
 */
@Repository
public interface PagoMensualRepository extends JpaRepository<PagoMensual, Integer>{
    List<PagoMensual> findAllByIdAlumno(int idAlumno);
    List<PagoMensual> findAllByIdEstadoPago(int idEstadoPago);
    List<PagoMensual> findByidAlumno_idAlumno(Integer idAlumno);
    List<PagoMensual> findByidAlumnoAndIdEstadoPago(Alumno alumno, EstadoPago estadoPago);
    List<PagoMensual> findByIdEstadoPago(EstadoPago estadoPago);

    @Query("SELECT p FROM PagoMensual p WHERE YEAR(p.fechaPago) = :year AND MONTH(p.fechaPago) = :month")
    List<PagoMensual> findPagosByMonthAndYear(@Param("month") Integer month, @Param("year") Integer year);

}
