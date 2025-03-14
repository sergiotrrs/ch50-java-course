package com.ecommerce.app.controller.impl;

import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.app.controller.ProductController;
import com.ecommerce.app.model.Product;
import com.ecommerce.app.service.ProductService;

@RestController
public class ProductControllerImpl implements ProductController {

	private final ProductService productService;
	
	public ProductControllerImpl(ProductService productService) {
		this.productService = productService;
	}

	@Override
	public Product getProductById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Product> getProductByIdUsynResponsEntity(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@GetMapping("/api/v1/products")
	@Override
	public ResponseEntity<Set<Product>> getAllProducts() {
		Set<Product> products = productService.getAllProducts();
		return ResponseEntity.ok( products  );
	}

	@Override
	public ResponseEntity<Product> createProduct(Product newProduct) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Product> updateProduct(Product product, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Void> deleteProduct(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
