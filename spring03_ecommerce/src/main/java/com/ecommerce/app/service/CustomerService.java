package com.ecommerce.app.service;


import org.springframework.data.domain.Page;

import com.ecommerce.app.model.Customer;

/**
 *  Una interfaz es una declaración formal de un contrato, en la
 *  cuál los métodos no contienen implementaciones.
 *  Es similar a los métodos abstractos.
 *  
 *  Una clase puede implementar varias interfaces.
 *  
 *  Las interfaces son adecuadas para proporcionar funcionalidad
 *  a clases que no están relacionadas entre si.
 *  
 *  En las interfaces los métodos por default son de tipo public
 *  y abstract.
 *  
 *  Para patrones de diseño, se suele utilizar interfaces.
 */
public interface CustomerService {
	 
	Customer createCustomer(Customer customer);
	Customer getCustomerById(Long id);
	Customer getCustomerByEmail(String email);
	Page<Customer> getAllUsers(boolean isActive, int pageNumber, int pageSize);
	Customer updateCustomer(Customer customer, Long id);
	void deleteCustomer(Long id);
}

