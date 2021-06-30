package es.uadin.tienda.service.dto;

import lombok.Data;

@Data
public class CategoriaDTO {

    private Long id;
    private String nombre;

    public CategoriaDTO() {
    }

    public CategoriaDTO(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
}
