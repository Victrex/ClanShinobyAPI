/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clanshinoby.DTOs;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author PC
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CintaDTO {
    @JsonProperty
    private Integer idCinta;
    @JsonProperty
    private String color;
    @JsonProperty
    private String kup;
}
