package es.uadin.tienda.repository;

import es.uadin.tienda.model.ArticuloPorti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticuloPortiRepository extends JpaRepository<ArticuloPorti, Long> {
}
