package es.uadin.tienda.resource;

import es.uadin.tienda.service.dto.ArticuloDTO;
import es.uadin.tienda.service.dto.DiapositivaDTO;
import es.uadin.tienda.service.impl.ArticuloService;
import es.uadin.tienda.service.impl.DiapositivaService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ArticuloResource {

    private ArticuloService articuloService;

    public ArticuloResource(ArticuloService articuloService){
        this.articuloService = articuloService;
    }
    @GetMapping("/articulos")
    public List<ArticuloDTO> obtenerListaArticulos(){
        List<ArticuloDTO> listaArticulos = new ArrayList<>();
        listaArticulos = this.articuloService.obtenerArticulos();
        return listaArticulos;
    }

    @PostMapping("/articulo")
    public ArticuloDTO insertarArticulo(@RequestBody ArticuloDTO articulo){
        return this.articuloService.guardarArticulo(articulo);
    }

    @PutMapping("/articulo")
    public ArticuloDTO modificarArticuilo(@RequestBody ArticuloDTO articulo){
        return this.articuloService.guardarArticulo(articulo);
    }

    @GetMapping("/articulo/{id}")
    public ArticuloDTO obtenerArticulo(@PathVariable Long id){
        return this.articuloService.obtenerArticuloDTO(id);
    }

    @DeleteMapping("/articulo/{id}")
    public void eliminarArticulo(@PathVariable Long id){
        this.articuloService.eliminarArticulo(id);
    }
}
