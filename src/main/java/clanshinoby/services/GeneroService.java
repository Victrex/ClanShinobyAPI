/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package clanshinoby.services;

import clanshinoby.models.Genero;
import java.util.List;

/**
 *
 * @author PC
 */
public interface GeneroService {
    List<Genero> getAllGenero();
    Genero getGeneroByID(Integer id);
}
