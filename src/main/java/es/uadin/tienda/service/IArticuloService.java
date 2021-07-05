package es.uadin.tienda.service;

import es.uadin.tienda.repository.spec.SearchCriteria;
import es.uadin.tienda.service.dto.ArticuloDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IArticuloService {
    public List<ArticuloDTO> obtenerArticulos(SearchCriteria[] criteriaList);
    public Page<ArticuloDTO> obtenerArticulosPaginados(SearchCriteria[] searchCriteria, Pageable pageable);
    //public Page<ArticuloDTO> obtenerTodasPaginado(Pageable pageable);
    public ArticuloDTO obtenerArticuloDTO(Long id);
    public ArticuloDTO guardarArticulo(ArticuloDTO imagenArticulo);
    public void eliminarArticulo(Long id);
}
