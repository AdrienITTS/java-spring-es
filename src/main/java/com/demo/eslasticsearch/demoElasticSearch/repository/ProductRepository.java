package com.demo.eslasticsearch.demoElasticSearch.repository;

import com.demo.eslasticsearch.demoElasticSearch.entity.Product;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ProductRepository extends ElasticsearchRepository<Product, String> {
    List<Product> findAllByName(String name);

    @Query("{\"match\":{\"name\":\"?0\"}}")
    List<Product> findAllByNameUsingAnnotations(String name);
}
