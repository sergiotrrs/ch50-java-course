package com.ecommerce.app.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.ecommerce.app.model.Role;

public interface RoleRepository extends CrudRepository<Role, Long>, PagingAndSortingRepository<Role, Long> {
    
    Optional<Role> findByName(String name);
    Iterable<Role> findByDescriptionContaining(String description);
    
}