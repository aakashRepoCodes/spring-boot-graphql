package com.tech.graphql.controller;

import com.tech.graphql.model.Product;
import com.tech.graphql.service.ProductService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProductController {


    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @QueryMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @QueryMapping
    public Product getProduct(@Argument String id) {
        return productService.getProductById(Long.parseLong(id));
    }

    @QueryMapping
    public List<Product> getProductByCategory(@Argument String category) {
        return productService.getProductByCategory(category);
    }

}
