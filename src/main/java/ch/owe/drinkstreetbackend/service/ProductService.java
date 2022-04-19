package ch.owe.drinkstreetbackend.service;

import ch.owe.drinkstreetbackend.model.Product;
import ch.owe.drinkstreetbackend.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
