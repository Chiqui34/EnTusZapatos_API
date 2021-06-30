package es.uadin.tienda.repository;

import es.uadin.tienda.model.DiapositivaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiapositivaRepository extends JpaRepository<DiapositivaModel, Long>{
}
