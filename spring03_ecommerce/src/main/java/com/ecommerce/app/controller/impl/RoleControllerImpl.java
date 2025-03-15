package com.ecommerce.app.controller.impl;

import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecommerce.app.controller.RoleController;
import com.ecommerce.app.model.Role;

@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/roles")
public class RoleControllerImpl implements RoleController {

	@Override
	public ResponseEntity<Role> getRoleById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Set<Role>> getAllRoles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Role> createRole(Role newRole) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Role> updateRole(Role role, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Void> deleteRole(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
