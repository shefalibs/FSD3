package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Product;

/**
 * Created by jt on 1/10/17.
 */
public interface ProductRepository extends CrudRepository<Product, Long> {
}
