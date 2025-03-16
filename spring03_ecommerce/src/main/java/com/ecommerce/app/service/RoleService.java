package com.ecommerce.app.service;

import com.ecommerce.app.model.Role;


public interface RoleService {
	
	Role createRole(Role role);
	Role getRoleById(Long id);
	Role getRoleByName(String name);
	Iterable<Role> getAllRoles();
	Role updateRole(Role role, Long id);
	void deleteRole(Long id);
	
}
