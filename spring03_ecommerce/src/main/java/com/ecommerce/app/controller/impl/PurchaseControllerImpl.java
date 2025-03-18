package com.ecommerce.app.controller.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ecommerce.app.controller.PurchaseController;
import com.ecommerce.app.model.Purchase;
import com.ecommerce.app.service.PurchaseService;

@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/purchases")
@RestController
public class PurchaseControllerImpl implements PurchaseController {

	private final PurchaseService purchaseService;
	
	public PurchaseControllerImpl(PurchaseService purchaseService) {
		this.purchaseService = purchaseService;
	}
	
	@Override
	@GetMapping("{id}")
	public ResponseEntity<Purchase> getPurchaseById(@PathVariable("id")Long id) {
		return ResponseEntity.ok( purchaseService.getPurchaseById(id) );
	}

	@Override
	@GetMapping("/customers/{id}")
	public ResponseEntity<Iterable<Purchase>> getAllPurchasesByCutomerId(@PathVariable("id")Long customerId) {
		return ResponseEntity.ok( purchaseService.getAllPurchasesByCustomerId(customerId) ); 
	}

	@Override
	@GetMapping
	public ResponseEntity<Iterable<Purchase>> getAllPurchases() {
		return ResponseEntity.ok( purchaseService.getAllPurchases() );
	}

	@Override
	@PostMapping
	public ResponseEntity<Purchase> createPurchase(@RequestBody Purchase purchase) {
		return ResponseEntity.status(201).body( purchaseService.createPurchase(purchase) );
	}

	@Override
	@PutMapping("{id}")
	public ResponseEntity<Purchase> updatePurchase(@RequestBody Purchase purchase,@PathVariable("id") Long id) {
		return ResponseEntity.ok( purchaseService.updatedPurchase(purchase, id) );
	}

	@Override
	@DeleteMapping("{id}")
	public ResponseEntity<Void> deletePurchase(Long id) {
		purchaseService.deletePurchase(id); 
		return ResponseEntity.noContent().build();
	}

}
