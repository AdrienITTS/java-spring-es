package com.demo.eslasticsearch.demoElasticSearch.controller;

import com.demo.eslasticsearch.demoElasticSearch.entity.Product;
import com.demo.eslasticsearch.demoElasticSearch.service.HighLevelClientProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/high-level-client")
@RequiredArgsConstructor
public class HighLevelClientController {

    private final HighLevelClientProductService highLevelClientProductService;

    @GetMapping("{id}")
    public Product getProductById(@PathVariable String id) {
        return highLevelClientProductService.getProduct(id);
    }

    @GetMapping("aggregate/{term}")
    public Map<String, Long> aggregateByTerms(@PathVariable String term) {
        return highLevelClientProductService.aggregateTerm(term);
    }

    @PostMapping("/product/_create-index")
    public boolean createIndex(){
        return highLevelClientProductService.createProductIndex();
    }


}
