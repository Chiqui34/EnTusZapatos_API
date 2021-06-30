package es.uadin.tienda.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "banner")
public class ArticuloPorti {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo", unique = true, nullable = false)
    private String titulo;

    @Column(name = "descripcion")
    private String descripcion;

    @Lob
    @Column(name = "imagen")
    private byte[] imagen;

    public ArticuloPorti() {
    }

    public ArticuloPorti(Long id, String titulo, String descripcion, byte[] imagen) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }
}
