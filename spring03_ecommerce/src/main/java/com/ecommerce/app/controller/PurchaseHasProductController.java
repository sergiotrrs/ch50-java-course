package com.ecommerce.app.controller;

import org.springframework.http.*;

import com.ecommerce.app.model.PurchaseHasProduct;

public interface PurchaseHasProductController {
	
	ResponseEntity<PurchaseHasProduct> createPurchaseHasProduct(PurchaseHasProduct purchaseHasProducts);
	ResponseEntity< Iterable<PurchaseHasProduct>> getAllPurchaseHasProducts();
	ResponseEntity< PurchaseHasProduct> getPurchaseHasProductByCompositeId(Long purchaseId, Long productId);
	ResponseEntity< Iterable<PurchaseHasProduct>> getPurchaseHasProductsByPurchaseId(Long purchaseId);
	ResponseEntity<PurchaseHasProduct> updatePurchaseHasProduct(PurchaseHasProduct purchaseHasProducts, Long purchaseId, Long productId);
	ResponseEntity< Void > deletePurchaseHasProductByCompositeId(Long purchaseId, Long productId);
		
}
