package co.edu.ufps.product_service.Service;

import co.edu.ufps.product_service.entitie.*;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface ProductService {
    List<Product> getAllProducts();

    Product saveProduct(Product product);

    Product updateProduct(Long id, Product product);

    void deleteProduct(Long id);
}
