package com.ecommerce.app.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.ecommerce.app.model.Product;
import com.ecommerce.app.repository.ProductRepository;

/*
*  Mockito es una biblioteca de pruebas unitarias
*  que se utiliza para simular objetos y comportamiento
*  de pruebas unitarias.
*  
*  Proporciona una forma sencilla y flexible de crear objetos
*  simulados(mocks) que se utilizan como sustitutos de los objetos
*  reales en las pruebas.
*  
*  En este ejercicio se simulará el objeto productRepository
*  Para que entregue el valor que necesita el servicio de getCustomerById
*  de las clase CustomerService.
*/

//Lo siguiente inicializará automáticamente los objetos mock y
//las anotaciones de Mockito en la clase prueba
@ExtendWith(MockitoExtension.class)
public class ProductServiceImplTest {
	
	// Inyectar automáticamente los objetos mocks en la clase bajo prueba.
	@InjectMocks
	private ProductServiceImpl productService;
	
	// Crea un objeto mock de una clase o interfaz determinada.
	// Este objeto mock puede ser utilizado para simular el
	// comportamiento de la clase o interfaz durante
	// la ejecución de la prueba unitaria.
	@Mock
	private ProductRepository productRepository;
	
	@Test
	void getProductById() {
		// Crear un objeto de prueba de product
		Product productMock = new Product(10L, "Bicicleta", "Bici", 3050.20 );
		
		// Definifir el comportamiento esperado de un mock
		// ¿Qué va a realizar el objeto simulado?
		Mockito.when( productRepository.findById(10L) ).thenReturn( Optional.of(productMock) );
		
		// ---------------Invocar el método a probar -------------------------
		Product existingProduct = productService.getProductById( 10L );
		
		// Realizar comparaciones
		assertEquals( 10L , existingProduct.getId(), "El id debe ser 10" );
		assertEquals( "Bicicleta" , existingProduct.getName(), "El nombre debe ser Bicicleta" );
		assertEquals( 3050.20 , existingProduct.getPrice(), "El precio debe ser 3050.20" );		
		
	}
	
	@Test
	void getAllProducts() {
		// Crear un objeto de prueba de product
		Product productMock1 = new Product(10L, "Bicicleta", "Bici", 3050.20 );
		Product productMock2 = new Product(11L, "Moto", "Moto", 20000.50 );
		
		// Definifir el comportamiento esperado de un mock
		// ¿Qué va a realizar el objeto simulado?
		Mockito.when( productRepository.findAll() ).thenReturn( Set.of(productMock1, productMock2) );
		
		// ---------------Invocar el método a probar -------------------------
		Set<Product> existingProducts = productService.getAllProducts();
		
		// Realizar comparaciones
		assertEquals( 2 , existingProducts.size(), "Debería tener 2 objetos" );		
		
	}
	

}
