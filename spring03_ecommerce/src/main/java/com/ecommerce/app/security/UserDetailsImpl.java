package com.ecommerce.app.security;

import java.util.*;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.ecommerce.app.model.Customer;
import com.ecommerce.app.model.Role;

//STEP 5 Convertir un tipo Customer a UserDetails
public class UserDetailsImpl implements UserDetails {
	
	private Customer customer;
	
	public UserDetailsImpl(Customer customer) {
		this.customer = customer;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		List<GrantedAuthority> authorities = new ArrayList<>( );
		
		for(Role role : customer.getRoles()  ) {
			authorities.add( new SimpleGrantedAuthority("ROLE_" + role.getName().toUpperCase() ));
		}
		
		return authorities;
	}

	@Override
	public String getPassword() {
		return customer.getPassword();
	}

	@Override
	public String getUsername() {
		return customer.getEmail();
	}
	
	public Long getId() {
		return customer.getId();
	}

}
