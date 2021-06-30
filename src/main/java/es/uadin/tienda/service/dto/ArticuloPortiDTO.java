package es.uadin.tienda.service.dto;

import lombok.Data;

@Data
public class ArticuloPortiDTO {

    private Long id;
    private String titulo;
    private String descripcion;
    private byte[] imagen;

    public ArticuloPortiDTO() {
    }

    public ArticuloPortiDTO(Long id, String titulo, String descripcion, byte[] imagen) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }
}
