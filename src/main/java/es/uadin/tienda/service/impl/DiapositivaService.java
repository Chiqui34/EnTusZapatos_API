package es.uadin.tienda.service.impl;

import es.uadin.tienda.model.DiapositivaModel;
import es.uadin.tienda.repository.DiapositivaRepository;
import es.uadin.tienda.service.IDiapositivaService;
import es.uadin.tienda.service.dto.DiapositivaDTO;
import es.uadin.tienda.service.mapper.ModelMapperUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DiapositivaService implements IDiapositivaService {

    private DiapositivaRepository diapositivaRepository;

    public DiapositivaService(DiapositivaRepository diapositivaRepository){
        this.diapositivaRepository = diapositivaRepository;
    }

    @Override
    public List<DiapositivaDTO> obtenerDiapositivas() {
            List<DiapositivaModel> diapositivaBD = this.diapositivaRepository.findAll();
        return ModelMapperUtils.mapAll(diapositivaBD, DiapositivaDTO.class);
    }

    @Override
    public DiapositivaDTO obtenerDiapositivaDTO(Long id) {
        Optional<DiapositivaModel> diapositivaBD = this.diapositivaRepository.findById(id);

        if(diapositivaBD.isPresent()){
            return ModelMapperUtils.map(diapositivaBD.get(), DiapositivaDTO.class);
        } else {
            return null;
        }

    }

    @Override
    public DiapositivaDTO guardarDiapositiva(DiapositivaDTO diapositiva) {

        DiapositivaModel diapositivaBD = ModelMapperUtils.map(diapositiva, DiapositivaModel.class);
        DiapositivaModel diapositivaGuardada = this.diapositivaRepository.save(diapositivaBD);

        return ModelMapperUtils.map(diapositivaGuardada, DiapositivaDTO.class);
    }

    @Override
    public void eliminarDiapositiva(Long id) {
        this.diapositivaRepository.deleteById(id);
    }
}
