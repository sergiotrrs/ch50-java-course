package com.ecommerce.app.service;

import com.ecommerce.app.model.Purchase;

public interface PurchaseService {
	
	Purchase createPurchase(Purchase purchase);
	Purchase getPurchaseById(Long id);
	Iterable<Purchase> getAllPurchasesByCustomerId(Long customerId);
	Iterable<Purchase> getAllPurchases();
	Purchase updatedPurchase(Purchase purchase, Long id);
	void deletePurchase(Long id);

}
