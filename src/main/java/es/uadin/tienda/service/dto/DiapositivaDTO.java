package es.uadin.tienda.service.dto;

import lombok.Data;

@Data
public class DiapositivaDTO {

    private Long id;
    private String titulo;
    private byte[] imagen;
    private boolean activo;

    public DiapositivaDTO() {
    }

    public DiapositivaDTO(Long id, String titulo, byte[] imagen, boolean activo) {
        this.id = id;
        this.titulo = titulo;
        this.imagen = imagen;
        this.activo = activo;
    }
}
