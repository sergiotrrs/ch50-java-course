package com.ecommerce.app.controller.impl;

import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.ecommerce.app.controller.RoleController;
import com.ecommerce.app.model.Role;
import com.ecommerce.app.service.RoleService;

@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/roles")
public class RoleControllerImpl implements RoleController {

	private final RoleService roleService;

	public RoleControllerImpl(RoleService roleService) {
		this.roleService = roleService;
	}

	@Override
	public ResponseEntity<Role> getRoleById(Long id) {
		return ResponseEntity.ok(roleService.getRoleById(id));
	}

	@Override
	public ResponseEntity<Set<Role>> getAllRoles() {
		return ResponseEntity.ok(roleService.getAllRoles());
	}

	@Override
	public ResponseEntity<Role> createRole(Role newRole) {
		return ResponseEntity.status(201).body(roleService.createRole(newRole));
	}

	@Override
	public ResponseEntity<Role> updateRole(Role role, Long id) {
		return ResponseEntity.ok(roleService.updateRole(role, id));
	}

	@Override
	public ResponseEntity<Void> deleteRole(Long id) {
		roleService.deleteRole(id);
		return ResponseEntity.noContent().build();
	}

}
