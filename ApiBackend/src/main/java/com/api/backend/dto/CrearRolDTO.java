package com.api.backend.dto;

import lombok.Getter;
import lombok.Setter;

/** @author Norberto
 */
@Getter @Setter 
public class CrearRolDTO {
    private String nombre;

    public CrearRolDTO() {
    }

    public CrearRolDTO(String nombre) {
        this.nombre = nombre;
    }
    
}

