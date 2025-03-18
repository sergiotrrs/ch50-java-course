package com.ecommerce.app.controller;


import org.springframework.http.ResponseEntity;

import com.ecommerce.app.model.Role;


public interface RoleController {
	
    ResponseEntity<Role> getRoleById(Long id);
    ResponseEntity< Iterable<Role> > getAllRoles();
    ResponseEntity< Role > createRole(Role newRole);
    ResponseEntity< Role > updateRole(Role role, Long id);
    ResponseEntity< Void > deleteRole(Long id);
 
}
