package org.riccskn.controller;


import org.riccskn.model.ProductModel;
import org.riccskn.repository.ProductRepository;
import org.riccskn.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    ProductService service;
    @Autowired
    private ProductRepository productRepository;


    @PostMapping
    public ResponseEntity<ProductModel> createProduct(@RequestBody ProductModel product) {
        return new ResponseEntity<>(service.addProduct(product), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ProductModel>> getAllProducts() {
        return ResponseEntity.ok(service.getAllProducts());
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteAllProducts() {
        service.deleteAll();
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
