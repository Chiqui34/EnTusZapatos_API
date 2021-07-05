package es.uadin.tienda.repository;

import es.uadin.tienda.model.ArticuloModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticuloRepository extends JpaRepository<ArticuloModel, Long>,
        JpaSpecificationExecutor<ArticuloModel> {

    Page<ArticuloModel> findAll(Specification<ArticuloModel> criteria, Pageable pageable);


}
