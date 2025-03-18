package com.ecommerce.app.util;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.ecommerce.app.model.Product;
import com.ecommerce.app.repository.ProductRepository;

@Component
@Order(2)
@Profile("loaderH2") // Para que se active cuando se use el perfil indicado
public class ProductDataLoader implements CommandLineRunner {

    @Autowired 
    ProductRepository productRepository;
    
    private static final Logger log = LoggerFactory.getLogger( ProductDataLoader.class );
    
    @Override
    public void run(String... args) throws Exception {
        productRepository.save(new Product(null, "jabón", "Con su aroma delicioso, como el amor de mamá", 25.0));
        productRepository.save(new Product(1L, "jabón suavitel", "Con su aroma delicioso, como el amor de mamá", 25.0));
        
        productRepository.save(new Product(null,"Quelites", "Ricos Quelites de Milpa Alta", 20.0));
        productRepository.save(new Product("Pc", "Gamer", 25000.21));
		productRepository.save(new Product("Mouse", "Razer blanco", 3500.21));
		productRepository.save(new Product("Teclado", "Hunts mini Razer", 2500.21));
		productRepository.save(new Product("Control xbox", "Elite blanco", 3500.21));
		productRepository.save(new Product("Monitor", "Curvo 27", 5500.21));
		productRepository.save(new Product("Pasta Barilla", "Pasta spaghetti 500g", 30.0));
		
		// Obtener el registro con ID 3
		Optional<Product> product= productRepository.findById(3L);// retorna un tipo optional de product
		
		if (product.isPresent()) {
			Product existingProduct = product.get();
			log.info(existingProduct.toString());
		} else {
			log.warn("No existe el producto con ID indicado");
		}
		
		
    }

}
