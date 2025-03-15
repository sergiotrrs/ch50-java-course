package com.ecommerce.app.controller;

import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.app.model.Role;


@RestController
public interface RoleController {
	
    ResponseEntity<Role> getRoleById(Long id);
    
    ResponseEntity< Set<Role> > getAllRoles();
    
    ResponseEntity< Role > createRole(Role newRole);
    
    ResponseEntity< Role > updateRole(Role role, Long id);

    ResponseEntity< Void > deleteRole(Long id);
 
}
