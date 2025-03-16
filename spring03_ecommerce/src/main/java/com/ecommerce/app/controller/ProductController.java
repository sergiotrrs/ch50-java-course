package com.ecommerce.app.controller;


import java.util.Set;

import org.springframework.http.ResponseEntity;

import com.ecommerce.app.model.Product;

public interface ProductController {
	
	Product getProductById(Long id);
	
    ResponseEntity<Product> getProductByIdUsynResponsEntity(Long id);
    
    ResponseEntity< Set<Product> > getAllProducts();
    
    ResponseEntity< Product > createProduct(Product newProduct);
    
    ResponseEntity< Product > updateProduct(Product product, Long id);

    ResponseEntity< Void > deleteProduct(Long id);
 
}
