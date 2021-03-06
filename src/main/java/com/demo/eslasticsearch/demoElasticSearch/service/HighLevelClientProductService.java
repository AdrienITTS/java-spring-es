package com.demo.eslasticsearch.demoElasticSearch.service;

import com.demo.eslasticsearch.demoElasticSearch.entity.Product;

import java.util.List;
import java.util.Map;

public interface HighLevelClientProductService {

    Product getProduct(String id);

    Map<String, Long> aggregateTerm(String term);

    Product createProduct(Product product);

    List<Product> bulkInsert(List<Product> products);

    boolean deleteProduct(String id);

    boolean createProductIndex();
}
