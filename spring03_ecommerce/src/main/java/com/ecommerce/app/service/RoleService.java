package com.ecommerce.app.service;

import java.util.Set;

import org.springframework.data.domain.Page;

import com.ecommerce.app.model.Role;

public interface RoleService {
	
	Role createRole(Role role);
	Role getRoleById(Long id);
	Role getRoleByName(String name);
	Set<Role> getAllRoles();
	Role updateRole(Role product, Long id);
	void deleteRole(Long id);
	
}
