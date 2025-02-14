
package com.tienda.domain;

import jakarta.persistence.*; 
import java.io.Serializable; 
import lombok.Data;

@Data
@Entuty
@Table(name="categoria")

public class Categoria implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Colum(name="id_categoria")
    private Long idCategoria;
}
public Categoria() {
    }

    public Categoria(String categoria, boolean activo) {
        this.descripcion = categoria;
        this.activo = activo;
    }