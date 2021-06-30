package es.uadin.tienda.service.impl;

import es.uadin.tienda.model.ArticuloModel;
import es.uadin.tienda.repository.ArticuloRepository;
import es.uadin.tienda.service.IArticuloService;
import es.uadin.tienda.service.dto.ArticuloDTO;
import es.uadin.tienda.service.mapper.ModelMapperUtils;
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
    public List<ArticuloDTO> obtenerArticulos() {
        List<ArticuloModel> articuloBD = this.articuloRepository.findAll();
        return ModelMapperUtils.mapAll(articuloBD, ArticuloDTO.class);
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
