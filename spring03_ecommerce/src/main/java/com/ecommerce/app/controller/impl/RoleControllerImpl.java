package com.ecommerce.app.controller.impl;

import java.util.Set;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
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
	@GetMapping("{id}")
	public ResponseEntity<Role> getRoleById(@PathVariable("id") Long id) {
		return ResponseEntity.ok(roleService.getRoleById(id));
	}

	@Override
	@GetMapping
	public ResponseEntity<Set<Role>> getAllRoles() {
		return ResponseEntity.ok(roleService.getAllRoles());
	}

	@Override
	@PostMapping
	public ResponseEntity<Role> createRole(@RequestBody Role newRole) {
		return ResponseEntity.status(201).body(roleService.createRole(newRole));
	}

	@Override
	@PutMapping("{id}")
	public ResponseEntity<Role> updateRole(@RequestBody Role role, @PathVariable("id") Long id) {
		return ResponseEntity.ok(roleService.updateRole(role, id));
	}

	@Override
	@DeleteMapping("{id}")
	public ResponseEntity<Void> deleteRole(@PathVariable("id") Long id) {
		roleService.deleteRole(id);
		return ResponseEntity.noContent().build();
	}

}
