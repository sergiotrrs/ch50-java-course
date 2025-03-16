package com.ecommerce.app.service;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.ecommerce.app.model.Role;

@Service
public interface RoleService {
	
	Role createRole(Role role);
	Role getRoleById(Long id);
	Role getRoleByName(String name);
	Set<Role> getAllRoles();
	Role updateRole(Role role, Long id);
	void deleteRole(Long id);
	
}
