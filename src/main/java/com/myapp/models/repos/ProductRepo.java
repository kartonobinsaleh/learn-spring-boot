package com.myapp.models.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.myapp.models.entities.Product;

public interface ProductRepo extends CrudRepository<Product, Long> {
    List<Product> findByNameContains(String name);
}
