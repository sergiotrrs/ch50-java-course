package com.ecommerce.app.service.impl;

import java.util.Optional;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.ecommerce.app.model.Role;
import com.ecommerce.app.repository.RoleRepository;
import com.ecommerce.app.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
	
	private final RoleRepository roleRepository;
	
	public RoleServiceImpl(RoleRepository roleRepository) {
		this.roleRepository = roleRepository;
	}

	@Override
	public Role createRole(Role role) {
		role.setId(null);
		return roleRepository.save(role);
	}

	@Override
	public Role getRoleById(Long id) {
		Optional<Role> existingRole = roleRepository.findById(id);
		return existingRole.orElseThrow( ()-> new IllegalStateException("Role does not exist with id " + id) );
	}

	@Override
	public Role getRoleByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Role> getAllRoles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role updateRole(Role product, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteRole(Long id) {
		// TODO Auto-generated method stub
		
	}

}
