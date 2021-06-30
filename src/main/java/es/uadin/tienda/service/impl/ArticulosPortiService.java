package es.uadin.tienda.service.impl;

import es.uadin.tienda.repository.ArticuloPortiRepository;
import es.uadin.tienda.model.ArticuloPorti;
import es.uadin.tienda.service.IArticulosPortiService;
import es.uadin.tienda.service.dto.ArticuloPortiDTO;
import es.uadin.tienda.service.mapper.ModelMapperUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

                                                                                                                                                                                                                                                                            @Service
public class ArticulosPortiService implements IArticulosPortiService {

    private ArticuloPortiRepository articuloPortiRepository;

    public ArticulosPortiService(ArticuloPortiRepository articuloPortiRepository) {
        this.articuloPortiRepository = articuloPortiRepository;
    }

    @Override
    public List<ArticuloPortiDTO> obtenerArticulosPorti() {
        List<ArticuloPorti> articulosPortiBD = this.articuloPortiRepository.findAll();
        return ModelMapperUtils.mapAll(articulosPortiBD, ArticuloPortiDTO.class);
    }

    @Override
    public ArticuloPortiDTO obtenerArticuloDTO(Long id) {
        Optional<ArticuloPorti> articuloBD = this.articuloPortiRepository.findById(id);

        if(articuloBD.isPresent()){
            return ModelMapperUtils.map(articuloBD.get(), ArticuloPortiDTO.class);
        } else {
            return null;
        }

    }

    @Override
    public ArticuloPortiDTO guardar(ArticuloPortiDTO articuloPorti) {
        ArticuloPorti articuloPortiBD = ModelMapperUtils.map(articuloPorti, ArticuloPorti.class);
        ArticuloPorti articuloGuardado = this.articuloPortiRepository.save(articuloPortiBD);

        return  ModelMapperUtils.map(articuloGuardado, ArticuloPortiDTO.class);
    }

    @Override
    public void borrar(Long id) {
        this.articuloPortiRepository.deleteById(id);

    }
}
