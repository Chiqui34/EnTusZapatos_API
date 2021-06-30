package es.uadin.tienda.repository;

import es.uadin.tienda.model.ArticuloModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticuloRepository extends JpaRepository<ArticuloModel, Long > {
}
