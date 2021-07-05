package es.uadin.tienda.resource;

import es.uadin.tienda.repository.spec.SearchCriteria;
import es.uadin.tienda.service.dto.ArticuloDTO;
import es.uadin.tienda.service.impl.ArticuloService;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

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



    @PostMapping("/articulos-spec")
    public Page<ArticuloDTO> obtenerArticulos(@RequestBody SearchCriteria[] criteria, Pageable pageable){
        return this.articuloService.obtenerArticulosPaginados(criteria, pageable);
    }
/*
    @PostMapping("/articulos-specs")
    public List<ArticuloDTO> obtenerArticulos(@RequestBody SearchCriteria[] criteria){
        List<ArticuloDTO> resultado = new ArrayList<>();

        return this.articuloService.obtenerArticulos(criteria);
    }
*/
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
