package es.uadin.tienda.service.impl;

import es.uadin.tienda.model.ArticuloModel;
import es.uadin.tienda.repository.ArticuloRepository;
import es.uadin.tienda.repository.spec.ArticuloSpecification;
import es.uadin.tienda.repository.spec.SearchCriteria;
import es.uadin.tienda.service.IArticuloService;
import es.uadin.tienda.service.dto.ArticuloDTO;
import es.uadin.tienda.service.mapper.ModelMapperUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticuloService implements IArticuloService {

    private ArticuloRepository articuloRepository;

    public ArticuloService(ArticuloRepository articuloRepository){
        this.articuloRepository = articuloRepository;
    }

    @Override
    public List<ArticuloDTO> obtenerArticulos(SearchCriteria[] criteriaList) {
        ArticuloSpecification specArticulo = new ArticuloSpecification();

        for(SearchCriteria criteria: criteriaList){
            specArticulo.add(criteria);
        }
        List<ArticuloModel> articuloBD = this.articuloRepository.findAll(specArticulo);
        return ModelMapperUtils.mapAll(articuloBD, ArticuloDTO.class);
    }

    @Override
    public Page<ArticuloDTO> obtenerArticulosPaginados(SearchCriteria[] criteriaList, Pageable pageable) {
        ArticuloSpecification specArticulo = new ArticuloSpecification();

        for(SearchCriteria criteria: criteriaList){
            specArticulo.add(criteria);
        }
        Page<ArticuloModel> articuloBD = this.articuloRepository.findAll(specArticulo, pageable);
        Page<ArticuloDTO> dtoPage = articuloBD.map(articulo -> ModelMapperUtils.map(articulo, ArticuloDTO.class));
        return dtoPage;
    }

    @Override
    public ArticuloDTO obtenerArticuloDTO(Long id) {
        Optional<ArticuloModel> articuloBD = this.articuloRepository.findById(id);
        if(articuloBD.isPresent()){
            return ModelMapperUtils.map(articuloBD.get(), ArticuloDTO.class);
        } else {
            return null;
        }
    }

    @Override
    public ArticuloDTO guardarArticulo(ArticuloDTO articulo) {

        ArticuloModel articuloBD = ModelMapperUtils.map(articulo, ArticuloModel.class);
        ArticuloModel articuloGuardar = this.articuloRepository.save(articuloBD);

        return ModelMapperUtils.map(articuloGuardar, ArticuloDTO.class);
    }

    @Override
    public void eliminarArticulo(Long id) {
        this.articuloRepository.deleteById(id);
    }
}
