package com.ecommerce.app.controller;


import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.app.model.Customer;
import com.ecommerce.app.service.CustomerService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/customers") // localhost:8080/api/v1 
public class CustomerController {

	CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	/**
	 * La anotación @PathVariable en Spring MVC se utiliza para 
	 * extraer valores de la URL de una solicitud HTTP y vincularlos 
	 * a los parámetros de un método de controlador. Esto permite que 
	 * los parámetros dinámicos en la URL se pasen a los métodos del 
	 * controlador, facilitando la creación de rutas RESTful y 
	 * permitiendo la captura de valores específicos directamente 
	 * desde la URL.
	 * 
	 * Los valores dinámicos se definen en la URL de la solicitud 
	 * utilizando llaves {}. Estos valores pueden ser extraídos y 
	 * utilizados en los métodos del controlador.
	 */
	@GetMapping("{id}") // http:localhost:8080/api/v1/customers/{id} 
	Customer getUserById(@PathVariable("id") Long id){
		Customer existingCustomer = customerService.getCustomerById(id);
		return existingCustomer;
	}
	
	
	/**
	 * La anotación @RequestParam en Spring MVC se utiliza para 
	 * extraer parámetros de consulta de una solicitud HTTP y 
	 * vincularlos a los parámetros de un método del controlador. 
	 * Los parámetros de consulta son aquellos que se encuentran 
	 * en la URL después del signo de interrogación ? y suelen 
	 * utilizarse para pasar datos adicionales en las solicitudes GET.
	 */
	@GetMapping // http:localhost:8080/api/v1/customers?active=false&size=10&firstname="Estafany"
	Page<Customer> getAllUsers(
			@RequestParam(
					name="active", 
					required = false,
					defaultValue = "true"
					) boolean isActive,
			@RequestParam(
					name="size", 
					required = false,
					defaultValue = "5"
					) int pageSize,
			@RequestParam(
					name="page", 
					required = false,
					defaultValue = "0"
					) int pageNumber
			){
		return customerService.getAllUsers(isActive, pageNumber, pageSize);
	}
	
	/**
	 * La anotación @RequestBody en Spring MVC se utiliza para 
	 * vincular automáticamente el cuerpo de una solicitud HTTP 
	 * a un objeto en un método de controlador. Esta anotación 
	 * permite que los datos JSON (o XML) enviados en el cuerpo 
	 * de la solicitud se deserialicen y se conviertan en una 
	 * instancia de una clase Java que se puede utilizar en el 
	 * método del controlador.
	 * 
	 * La clase ResponseEntity en Spring es una estructura 
	 * para definir y controlar la respuesta HTTP de un controlador 
	 * REST. Te permite personalizar aspectos como el código de 
	 * estado HTTP, los encabezados y el cuerpo de la respuesta.
	 * 
	 */
	@PostMapping // http:localhost:8080/api/v1/customers
	ResponseEntity<Customer> createCustomer(@RequestBody Customer newCustomer) {
	   Customer registeredCustomer = customerService.createCustomer(newCustomer);
	   //return new ResponseEntity<>(registeredCustomer, HttpStatus.CREATED);
	   return ResponseEntity.status(201).body(registeredCustomer);
	}
	
	
	@PutMapping("{id}") // http:localhost:8080/api/v1/customers/{id}
	ResponseEntity<Customer> updateCustomer(@PathVariable("id") Long id ,@RequestBody Customer customer) {
		Customer updatedCustomer = customerService.updateCustomer(customer, id);
		return ResponseEntity.ok(updatedCustomer);
	}
	
	@DeleteMapping("{id}") // http:localhost:8080/api/v1/customers/{id}
	ResponseEntity<Void> deleteCustomer(@PathVariable("id") Long id){
		customerService.deleteCustomer(id);
		return ResponseEntity.noContent().build(); // Status 204
		// Como no hay cuerpo en la respuesta, 
		// se debe llamar a .build() para finalizar la construcción del ResponseEntity.
	}
}
