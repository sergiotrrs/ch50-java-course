package com.ecommerce.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.ecommerce.app.model.Purchase;

public interface PurchaseRepository extends CrudRepository<Purchase, Long> {
	
	Iterable<Purchase> findAllByCustomerId(Long customerId);

}
