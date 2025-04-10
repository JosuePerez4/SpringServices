package co.edu.ufps.product_service.repository;

import co.edu.ufps.product_service.entitie.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
