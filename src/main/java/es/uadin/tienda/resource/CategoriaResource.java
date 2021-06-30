package es.uadin.tienda.resource;

import es.uadin.tienda.service.dto.CategoriaDTO;
import es.uadin.tienda.service.impl.CategoriaService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class CategoriaResource {

    private CategoriaService categoriaService;

    public CategoriaResource(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping("/categorias")
    public List<CategoriaDTO> obtenerListaCategorias(){
        List<CategoriaDTO> listaCategorias = new ArrayList<>();
        listaCategorias = this.categoriaService.obtenerCategorias();
        return listaCategorias;
    }

    @PostMapping("/categoria")
    public CategoriaDTO insertarCategoria(@RequestBody CategoriaDTO categoria){
        return this.categoriaService.guardarCategoria(categoria);
    }

    @PutMapping("/categoria")
    public CategoriaDTO modificarCategoria(@RequestBody CategoriaDTO categoria){
        return this.categoriaService.guardarCategoria(categoria);
    }

    @GetMapping("/categoria/{id}")
    public CategoriaDTO obtenerCategoriaa(@PathVariable Long id){
        return this.categoriaService.obtenerCategoriaDTO(id);
    }

    @DeleteMapping("/categoria/{id}")
    public void eliminarCategoria(@PathVariable Long id){
        this.categoriaService.eliminarCategoria(id);
    }
}
