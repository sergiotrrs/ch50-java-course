package com.ecommerce.app.controller.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ecommerce.app.controller.PurchaseHasProductController;
import com.ecommerce.app.model.PurchaseHasProduct;
import com.ecommerce.app.service.PurchaseHasProductService;

@RestController
@RequestMapping("api/v1/purchases-has-products")
@CrossOrigin(origins = "*")
public class PurchaseHasProductControllerImpl implements PurchaseHasProductController {

	private final PurchaseHasProductService puHprService;

	public PurchaseHasProductControllerImpl(PurchaseHasProductService puHprService) {
		this.puHprService = puHprService;
	}
	
	@Override
	@PostMapping
	public ResponseEntity<PurchaseHasProduct> createPurchaseHasProduct(@RequestBody PurchaseHasProduct purchaseHasProducts) {
		PurchaseHasProduct savedPurchaseHasProduct = puHprService.createOrderHasProduct(purchaseHasProducts);
		return ResponseEntity.status(201).body(savedPurchaseHasProduct);
	}

	@Override
	@GetMapping
	public ResponseEntity< Iterable<PurchaseHasProduct>> getAllPurchaseHasProducts() {
		Iterable<PurchaseHasProduct> purchasesHasProducts = puHprService.getPurchaseHasProducts();
		return ResponseEntity.ok(purchasesHasProducts);
	}

	@Override
	@GetMapping("/query") // localhost:8080/api/v1/purchases-has-products/query?purchaseId=1&productId=3 
	public ResponseEntity< PurchaseHasProduct> getPurchaseHasProductByCompositeId(
			@RequestParam(name = "purchaseId") Long purchaseId,
			@RequestParam(name = "productId") Long productId
			) {
		PurchaseHasProduct purchaseHasProducts = puHprService.getPurchaseHasProductByCompositeId(purchaseId, productId);
		return ResponseEntity.ok(purchaseHasProducts);
	}

	@Override
	@GetMapping("/purchase/{id}") // localhost:8080/api/v1/purchases-has-products/purchase/1
	public ResponseEntity< Iterable<PurchaseHasProduct>> getPurchaseHasProductsByPurchaseId(
			@PathVariable("id") Long purchaseId
			) {
		Iterable<PurchaseHasProduct> purchaseHasProducts = puHprService.getPurchaseHasProductsByPurchaseId(purchaseId);
		return ResponseEntity.ok(purchaseHasProducts);
	}

	@Override
	public ResponseEntity<PurchaseHasProduct> updatePurchaseHasProduct(PurchaseHasProduct purchaseHasProducts,
			Long purchaseId, Long productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Void> deletePurchaseHasProductByCompositeId(Long purchaseId, Long productId) {
		// TODO Auto-generated method stub
		return null;
	}

}
