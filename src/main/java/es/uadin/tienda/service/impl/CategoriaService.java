package es.uadin.tienda.service.impl;

import es.uadin.tienda.model.CategoriaModel;
import es.uadin.tienda.model.DiapositivaModel;
import es.uadin.tienda.repository.CategoriaRepository;
import es.uadin.tienda.repository.DiapositivaRepository;
import es.uadin.tienda.service.ICategoriasService;
import es.uadin.tienda.service.dto.CategoriaDTO;
import es.uadin.tienda.service.dto.DiapositivaDTO;
import es.uadin.tienda.service.mapper.ModelMapperUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService implements ICategoriasService {

    private CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository){
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public List<CategoriaDTO> obtenerCategorias() {
        List<CategoriaModel> categoriaBD = this.categoriaRepository.findAll();
        return ModelMapperUtils.mapAll(categoriaBD, CategoriaDTO.class);
    }

    @Override
    public CategoriaDTO obtenerCategoriaDTO(Long id) {
        Optional<CategoriaModel> categoriaBD = this.categoriaRepository.findById(id);

        if(categoriaBD.isPresent()){
            return ModelMapperUtils.map(categoriaBD.get(), CategoriaDTO.class);
        } else {
            return null;
        }

    }

    @Override
    public CategoriaDTO guardarCategoria(CategoriaDTO categoria) {

        CategoriaModel categoriaBD = ModelMapperUtils.map(categoria, CategoriaModel.class);
        CategoriaModel categoriaGuardada = this.categoriaRepository.save(categoriaBD);

        return ModelMapperUtils.map(categoriaGuardada, CategoriaDTO.class);
    }

    @Override
    public void eliminarCategoria(Long id) {
        this.categoriaRepository.deleteById(id);
    }




}
