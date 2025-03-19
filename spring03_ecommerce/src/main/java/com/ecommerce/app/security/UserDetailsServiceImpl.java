package com.ecommerce.app.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ecommerce.app.model.Customer;
import com.ecommerce.app.service.CustomerService;

//STEP 4 Leer el usuario de la DB
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	private final CustomerService customerService;

	public UserDetailsServiceImpl(CustomerService customerService) {
		
		this.customerService = customerService;
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			
		Customer existingCustomer = customerService.getCustomerByEmail(username);
		
		// Convertir mi Customer al tipo UserDetails
		UserDetails user = new UserDetailsImpl( existingCustomer  );
		
		return user;
	}

}
