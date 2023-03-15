package org.riccskn.service;

import org.riccskn.model.ProductModel;
import org.riccskn.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    public ProductModel addProduct(ProductModel productModel) {
        repository.save(productModel);
        return productModel;
    }

    public List<ProductModel> getAllProducts() {
       return repository.findAll();
    }

    public void deleteAll() {
        repository.deleteAll();
    }

}
