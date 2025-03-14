package com.ecommerce.app.service.impl;

import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.ecommerce.app.model.Product;
import com.ecommerce.app.repository.ProductRepository;
import com.ecommerce.app.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
		
	private final ProductRepository productRepository;
	
	ProductServiceImpl(ProductRepository productRepository){
		this.productRepository = productRepository;
	}

	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductDescription(String description) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductPrice(Double price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Product> getAllProducts(int pageNumber, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Product> getAllProducts() {
		return (Set<Product>) productRepository.findAll();
	}

	@Override
	public Product updateProduct(Product product, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(Long id) {
		// TODO Auto-generated method stub
		
	}

}
