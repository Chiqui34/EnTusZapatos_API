package es.uadin.tienda.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "categoria")
public class CategoriaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", unique = true, nullable = false)
    private String nombre;

    public CategoriaModel() {
    }

    public CategoriaModel(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
}
