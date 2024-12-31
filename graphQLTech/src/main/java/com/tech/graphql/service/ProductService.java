package com.tech.graphql.service;

import com.tech.graphql.model.Product;
import com.tech.graphql.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).get();
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getProductByCategory(String category) {
        return productRepository.findByCategory(category);
    }

}
