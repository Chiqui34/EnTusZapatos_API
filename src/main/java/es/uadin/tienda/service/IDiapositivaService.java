package es.uadin.tienda.service;

import es.uadin.tienda.service.dto.DiapositivaDTO;

import java.util.List;

public interface IDiapositivaService {

    public List<DiapositivaDTO> obtenerDiapositivas();
    public DiapositivaDTO obtenerDiapositivaDTO(Long id);
    public DiapositivaDTO guardarDiapositiva(DiapositivaDTO imagenDiapositiva);
    public void eliminarDiapositiva(Long id);

}
