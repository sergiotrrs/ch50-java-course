package com.ecommerce.app.service;

import java.util.Set;

import org.springframework.data.domain.Page;

import com.ecommerce.app.model.Product;

public interface ProductService {
	 
	Product createProduct(Product product);
	Product getProductById(Long id);
	Product getProductName(String name);
	Product getProductDescription(String description);
	Product getProductPrice(Double price);
	Page<Product> getAllProducts(int pageNumber, int pageSize);
	Set<Product> getAllProducts();
	Product updateProduct(Product product, Long id);
	void deleteProduct(Long id);
	
}