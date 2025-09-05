package com.myapp.models.repos;

import org.springframework.data.repository.CrudRepository;

import com.myapp.models.entities.Product;

public interface ProductRepo extends CrudRepository<Product, Long> {

}
