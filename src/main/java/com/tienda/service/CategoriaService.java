package com.tienda.service;

import com.tienda.domain.Categoria; 
import java.util.List;

public interface CategoriaService {

    //Se obtiene 
    public Lis<Categoria> getCategorias(boolean activos);
}
