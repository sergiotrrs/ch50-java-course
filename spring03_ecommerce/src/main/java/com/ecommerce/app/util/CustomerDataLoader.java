package com.ecommerce.app.util;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.ecommerce.app.model.Customer;
import com.ecommerce.app.repository.CustomerRepository;


/**
* CommandLineRunner es una interfaz en Spring Boot que se 
* usa para ejecutar código específico una vez que la 
* aplicación ha iniciado completamente. Es particularmente 
* útil para ejecutar tareas de inicialización o configuración 
* cuando se arranca la aplicación.
* 
* @Order(n) se utiliza para controlar el orden de ejecución 
* de los beans que implementan interfaces como CommandLineRunner 
* o ApplicationRunner
*/
@Component
@Order(1)
@Profile("loaderH2") // Para que se active cuando se use el perfil indicado
public class CustomerDataLoader implements CommandLineRunner {
	
	@Autowired
	CustomerRepository customerRepository;
	
	/**
	 *  - Logger permite definir niveles( TRACE, DEBBUG, INFO, WARN, ERROR).
	 *  - Redirigir el log a archivos, bases de datos o consola.
	 *  - Personalizar el formato.
	 *  - Se integra mejor con otras herramientas para un monitoreo avanzado
	 */
	private static final Logger log = LoggerFactory.getLogger( CustomerDataLoader.class );

	@Override
	public void run(String... args) throws Exception {
		
		customerRepository.save(new Customer("Ale", "Ordaz", "ale@gmail.com", "12345678") );
		customerRepository.save(new Customer("Vale", "Aceves", "vale@gmail.com", "12345678"));
		customerRepository.save(new Customer("Ana", "Cruz", "ana@gmail.com", "12345678"));
		customerRepository.save(new Customer("Andy", "Eunice", "andy@gmail.com", "12345678"));
		customerRepository.save(new Customer("Kati", "Sandoval", "kati@gmail.com", "12345678"));
		customerRepository.save(new Customer("Aure", "Robles", "aure@gmail.com", "12345678"));
		customerRepository.save(new Customer("Fri", "González", "fri@gmail.com", "12345678"));
		customerRepository.save(new Customer("Eri", "González", "eri@gmail.com", "12345678"));
		customerRepository.save(new Customer("José", "Meza", "jose@gmail.com", "12345678"));
		customerRepository.save(new Customer("Alan", "Flores", "alan@gmail.com", "12345678"));
		customerRepository.save(new Customer("Ferchis", "Hernández", "ferchis@gmail.com", "12345678"));
		
		// Obtener el cliente con ID 3
		Optional<Customer> optionalCustomer  = customerRepository.findById( 100L );
		
		if( optionalCustomer.isPresent() ) {
			Customer existingCustomer = optionalCustomer.get();
			log.info( existingCustomer.toString() );
		} else {
			log.warn("No existe el cliente con ID indicado");
		}
		
		
		/*
		cS.createCustomer(new Customer("Jack", "Bauer", "jack@gmail.com", "12345678"));
		cS.createCustomer(new Customer("Chloe", "O'Brian", "chloe@gmail.com", "87654321"));
		cS.createCustomer(new Customer("Tony", "Almeida", "tony@gmail.com", "23456789"));
		cS.createCustomer(new Customer("Kim", "Bauer", "kim@gmail.com", "98765432"));
		cS.createCustomer(new Customer("David", "Palmer", "david@gmail.com", "45678912"));
		cS.createCustomer(new Customer("Michelle", "Dessler", "michelle@gmail.com", "56789123"));
		cS.createCustomer(new Customer("George", "Mason", "george@gmail.com", "67891234"));
		cS.createCustomer(new Customer("Nina", "Myers", "nina@gmail.com", "78912345"));
		cS.createCustomer(new Customer("Bill", "Buchanan", "bill@gmail.com", "89123456"));
		cS.createCustomer(new Customer("Mike", "Novick", "mike@gmail.com", "91234567"));
		*/
	}

}
