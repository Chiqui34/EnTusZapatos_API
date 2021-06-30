package es.uadin.tienda.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "diapositiva")
public class DiapositivaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo", unique = true, nullable = false)
    private String titulo;

    @Lob
    @Column(name = "imagen")
    private byte[] imagen;

    @Column(name = "activo")
    private boolean activo;

    public DiapositivaModel() {
    }

    public DiapositivaModel(Long id, String titulo, byte[] imagen, boolean activo) {
        this.id = id;
        this.titulo = titulo;
        this.imagen = imagen;
        this.activo = activo;
    }
}
