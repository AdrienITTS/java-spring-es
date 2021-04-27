package com.demo.eslasticsearch.demoElasticSearch.service;

import com.demo.eslasticsearch.demoElasticSearch.entity.Product;

import java.util.List;
import java.util.Map;

public interface ElasticsearchRestTemplateService {

    Product getProductById(String id);

    List<Product> getProductsByName(String name);

   Map<String, Long> aggregateTerm(String term);
}
