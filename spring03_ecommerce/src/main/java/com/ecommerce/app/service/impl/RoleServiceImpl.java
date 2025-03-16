package com.ecommerce.app.service.impl;


import java.util.Optional;


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
		Optional<Role> existingRole = roleRepository.findByName(name);
		return existingRole.orElseThrow( ()-> new IllegalStateException("Role does not exist with name " + name) );
	}

	@Override
	public Iterable<Role> getAllRoles() {
		return roleRepository.findAll() ;
	}

	@Override
	public Role updateRole(Role role, Long id) {
		Role existingRole = getRoleById(id);
		existingRole.setName( role.getName() );
		existingRole.setDescription( role.getDescription() );
		return roleRepository.save(existingRole);
	}

	@Override
	public void deleteRole(Long id) {
		Role existingRole = getRoleById(id);
		roleRepository.delete(existingRole);
	}

}
