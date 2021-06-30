package es.uadin.tienda.service.dto;

public class ArticuloDTO {

    private Long id;
    private String nombre;
    private byte[] imagen;
    private boolean activo;
    private String categoria;

    public ArticuloDTO() {
    }

    public ArticuloDTO(Long id, String nombre, byte[] imagen, boolean activo, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
        this.activo = activo;
        this.categoria = categoria;
    }
}
