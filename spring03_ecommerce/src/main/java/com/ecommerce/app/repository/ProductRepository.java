package com.ecommerce.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.ecommerce.app.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long>, PagingAndSortingRepository<Product, Long> {
    
    Iterable<Product> findByName(String name);
    Iterable<Product> findByDescription(String description);
    Iterable<Product> findByPrice(Double price);
    
    // Page<Product> findAllByActiveTrue(Pageable pageable);
    // Page<Product> findAllByActiveFalse(Pageable pageable);
}