package com.ecommerce.app.controller;

import org.springframework.http.ResponseEntity;

import com.ecommerce.app.model.Purchase;

public interface PurchaseController {
	
	ResponseEntity<Purchase> getPurchaseById(Long id);
	ResponseEntity<Iterable<Purchase>> getAllPurchasesByCutomerId(Long customerId);
	ResponseEntity<Iterable<Purchase>> getAllPurchases();
	ResponseEntity<Purchase> createPurchase(Purchase purchase);
	ResponseEntity<Purchase> updatePurchase(Purchase purchase, Long id);
	ResponseEntity<Void> deletePurchase(Long id);
	

}
