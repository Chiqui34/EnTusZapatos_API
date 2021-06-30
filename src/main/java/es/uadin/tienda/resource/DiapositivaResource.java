package es.uadin.tienda.resource;

import es.uadin.tienda.service.dto.DiapositivaDTO;
import es.uadin.tienda.service.impl.DiapositivaService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class DiapositivaResource {

    private DiapositivaService diapositivaService;

    public DiapositivaResource(DiapositivaService diapositivaService){
        this.diapositivaService = diapositivaService;
    }

    @GetMapping("/diapositivas")
    public List<DiapositivaDTO> obtenerListaDiapositiva(){
        List<DiapositivaDTO> listaDiapositiva = new ArrayList<>();
        listaDiapositiva = this.diapositivaService.obtenerDiapositivas();
        return listaDiapositiva;
    }

    @PostMapping("/diapositiva")
    public DiapositivaDTO insertarDiapositiva(@RequestBody DiapositivaDTO diapositiva){
        return this.diapositivaService.guardarDiapositiva(diapositiva);
    }

    @PutMapping("/diapositiva")
    public DiapositivaDTO modificarDiapositiva(@RequestBody DiapositivaDTO diapositiva){
        return this.diapositivaService.guardarDiapositiva(diapositiva);
    }

    @GetMapping("/diapositiva/{id}")
    public DiapositivaDTO obtenerDiapositiva(@PathVariable Long id){
        return this.diapositivaService.obtenerDiapositivaDTO(id);
    }

    @DeleteMapping("/diapositiva/{id}")
    public void eliminarDiapositiva(@PathVariable Long id){
        this.diapositivaService.eliminarDiapositiva(id);
    }

}
