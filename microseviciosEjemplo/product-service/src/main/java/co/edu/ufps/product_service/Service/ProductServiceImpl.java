package co.edu.ufps.product_service.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ufps.product_service.entitie.Product;
import co.edu.ufps.product_service.repository.ProductRepository;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    @Override
    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public Product updateProduct(Long id, Product updatedProduct) {
        return repository.findById(id).map(product -> {
            product.setNombre(updatedProduct.getNombre());
            product.setPrecio(updatedProduct.getPrecio());
            return repository.save(product);
        }).orElseThrow(() -> new RuntimeException("Producto no encontrado con id: " + id));
    }

    @Override
    public void deleteProduct(Long id) {
        repository.deleteById(id);
    }
}
