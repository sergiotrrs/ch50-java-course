package com.ecommerce.app.repository;

import java.util.Optional;
import java.util.Set;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.ecommerce.app.model.Role;

public interface RoleRepository extends CrudRepository<Role, Long>, PagingAndSortingRepository<Role, Long> {
    
    Optional<Role> findByName(String name);
    Set<Role> findByDescription(String description);
    
}