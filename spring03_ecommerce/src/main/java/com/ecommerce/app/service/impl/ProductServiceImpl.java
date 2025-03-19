package com.ecommerce.app.service.impl;

import java.util.Collection;
import java.util.LinkedHashSet;
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
		return productRepository.findById(id).orElseThrow( ()-> new IllegalStateException("Product does not exist with id " + id));
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
		/*
		 *  roleRepository.findAll() devuelve un Iterable<Role>, 
		 *  pero no sabemos qué implementación exacta está usando. 
		 *  Puede ser un List<Role>, un Set<Role>, o incluso una 
		 *  implementación propia de Iterable.
		 *  
		 *  Set<Role> roleSet = (Set<Role>) roleIterable;
		 *  es un cast inválido porque roleIterable puede ser un 
		 *  List<Role> en la práctica. Como List y Set son tipos 
		 *  incompatibles, Java lanza un ClassCastException.
		 *  
		 *  Para convertir un Iterable<T> en un Set<T>, no puedes 
		 *  hacer un cast directo, sino que debes extraer 
		 *  los elementos y construir un Set explícitamente
		 * 
		 *  Lo anterior es necesario por que el método se especificó
		 *  con el retorno de Set<Product>. Si se hubiera
		 *  especificado como Iterable<Product> no sería
		 *  necesario las siguientes expresiones:
		 */
		Iterable<Product> productsIterable = productRepository.findAll();
		return new LinkedHashSet<>( (Collection<Product>)productsIterable  );

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
