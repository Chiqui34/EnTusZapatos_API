package es.uadin.tienda.service;

import es.uadin.tienda.service.dto.ArticuloPortiDTO;

import java.util.List;

public interface IArticulosPortiService {

    public List<ArticuloPortiDTO> obtenerArticulosPorti();
    public ArticuloPortiDTO obtenerArticuloDTO(Long id);
    public ArticuloPortiDTO guardar(ArticuloPortiDTO articuloPorti);
    public void borrar(Long id);

}
