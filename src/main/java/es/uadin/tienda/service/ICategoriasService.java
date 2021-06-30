package es.uadin.tienda.service;

import es.uadin.tienda.service.dto.CategoriaDTO;
import es.uadin.tienda.service.dto.DiapositivaDTO;

import java.util.List;

public interface ICategoriasService {

    public List<CategoriaDTO> obtenerCategorias();
    public CategoriaDTO obtenerCategoriaDTO(Long id);
    CategoriaDTO guardarCategoria(CategoriaDTO categoria);
    public void eliminarCategoria(Long id);

}
