package com.demo.eslasticsearch.demoElasticSearch.controller;

import com.demo.eslasticsearch.demoElasticSearch.entity.Product;
import com.demo.eslasticsearch.demoElasticSearch.service.SpringDataProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/spring-data")
@RequiredArgsConstructor
public class SpringDataController {

    private final SpringDataProductService springDataProductService;

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return springDataProductService.createProduct(product);
    }

    @GetMapping("/{id}")
    public Optional<Product> getById(@PathVariable String id) {
        return springDataProductService.getProduct(id);
    }

    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable String id) {
        springDataProductService.deleteProduct(id);
        return true;
    }

    @PostMapping("/_bulk")
    public List<Product> insertBulk(@RequestBody List<Product> products) {
        return (List<Product>) springDataProductService.insertBulk(products);
    }

    @GetMapping("/name/{name}")
    public List<Product> findAllByName(@PathVariable String name) {
        return springDataProductService.getProductsByName(name);
    }

    @GetMapping("name/{name}/annotations")
    public List<Product> findAllByNameAnnotations(@PathVariable String name) {
        return springDataProductService.getProductsByNameUsingAnnotation(name);
    }
}
