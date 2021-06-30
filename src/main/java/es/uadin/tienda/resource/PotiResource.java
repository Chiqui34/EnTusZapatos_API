package es.uadin.tienda.resource;

import es.uadin.tienda.service.dto.ArticuloPortiDTO;
import es.uadin.tienda.service.impl.ArticulosPortiService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class PotiResource {

    private ArticulosPortiService articulosPortiService;

    public PotiResource(ArticulosPortiService articulosPortiService) {
        this.articulosPortiService = articulosPortiService;
    }

    @GetMapping("/articulosPorti")
    public List<ArticuloPortiDTO> obtenerArticulosPorti(){
        List<ArticuloPortiDTO> resultado = new ArrayList<>();

        resultado = this.articulosPortiService.obtenerArticulosPorti();
        return  resultado;
    }

    @PostMapping("/articulosPorti")
    public ArticuloPortiDTO insertarArticuloPorti(@RequestBody ArticuloPortiDTO articuloPorti){
        return this.articulosPortiService.guardar(articuloPorti);
    }

    @PutMapping("/articulosPorti")
    public ArticuloPortiDTO  modificarArticuloPorti(@RequestBody ArticuloPortiDTO articuloPorti){
        return this.articulosPortiService.guardar(articuloPorti);
    }

    @GetMapping("/articulosPorti/{id}")
    public ArticuloPortiDTO obtenerArticuloPorti(@PathVariable Long id){
        return this.articulosPortiService.obtenerArticuloDTO(id);
    }

    @DeleteMapping("/articulosPorti/{id}")
    public void eliminarArticuloPorti(@PathVariable Long id){
        this.articulosPortiService.borrar(id);
    }

}
