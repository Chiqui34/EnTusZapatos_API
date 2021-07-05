package es.uadin.tienda.service.dto;

import lombok.Data;

@Data
public class ArticuloDTO {

    private Long id;
    private String nombre;
    private byte[] imagen;
    private boolean activo;
    private Long idCategoria;

    public ArticuloDTO() {
    }

    public ArticuloDTO(Long id, String nombre, byte[] imagen, boolean activo, Long idCategoria) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
        this.activo = activo;
        this.idCategoria = idCategoria;
    }
}
