/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package clanshinoby.repositories;

import clanshinoby.models.HistorialPagos;
import java.time.LocalDate;
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
public interface HistorialPagosRepository extends JpaRepository<HistorialPagos, Integer> {
    List<HistorialPagos> findByFechaBetween(LocalDate start, LocalDate end);
    List<HistorialPagos> findAllByFechaBetween(LocalDate desde, LocalDate hasta);
    @Query(value = "SELECT * FROM historial_pagos WHERE MONTH(fecha) = :month AND YEAR(fecha) = :year", nativeQuery = true)
    List<HistorialPagos> findAllByMonthAndYear(@Param("month") int month, @Param("year") int year);
}
