package com.ecommerce.app.repository;

import java.util.Set;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.ecommerce.app.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long>, PagingAndSortingRepository<Product, Long> {
    
    Set<Product> findByName(String name);
    Set<Product> findByDescription(String description);
    Set<Product> findByPrice(Double price);
    
    // Page<Product> findAllByActiveTrue(Pageable pageable);
    // Page<Product> findAllByActiveFalse(Pageable pageable);
}