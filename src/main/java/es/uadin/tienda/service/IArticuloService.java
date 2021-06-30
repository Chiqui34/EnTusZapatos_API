package es.uadin.tienda.service;

import es.uadin.tienda.service.dto.ArticuloDTO;

import java.util.List;

public interface IArticuloService {
    public List<ArticuloDTO> obtenerArticulos();
    public ArticuloDTO obtenerArticuloDTO(Long id);
    public ArticuloDTO guardarArticulo(ArticuloDTO imagenArticulo);
    public void eliminarArticulo(Long id);
}
