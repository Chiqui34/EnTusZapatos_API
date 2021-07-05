package es.uadin.tienda.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "articulo")
public class ArticuloModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", unique = true, nullable = false)
    private String nombre;

    @Lob
    @Column(name = "imagen")
    private byte[] imagen;

    @Column(name = "activo")
    private boolean activo;

    @Column(name = "idcategoria")
    private Long idCategoria;

    public ArticuloModel() {
    }

    public ArticuloModel(Long id, String nombre, byte[] imagen, boolean activo, Long idCategoria) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
        this.activo = activo;
        this.idCategoria = idCategoria;
    }
}
