package com.ecommerce.app.service.impl;

import org.springframework.stereotype.Service;

import com.ecommerce.app.model.Purchase;
import com.ecommerce.app.repository.PurchaseRepository;
import com.ecommerce.app.service.PurchaseService;

@Service
public class PurchaseServiceImpl implements PurchaseService {
	
	private final PurchaseRepository purchaseRepository;
	
	public PurchaseServiceImpl(PurchaseRepository purchaseRepository) {
		this.purchaseRepository = purchaseRepository;
	}

	@Override
	public Purchase createPurchase(Purchase purchase) {
		purchase.setId(null);
		return purchaseRepository.save(purchase);
	}

	@Override
	public Purchase getPurchaseById(Long id) {		
		return purchaseRepository.findById(id)
				.orElseThrow( ()-> new IllegalStateException("Purchase does not exist with id " + id));
	}

	@Override
	public Iterable<Purchase> getAllPurchasesByCustomerId(Long customerId) {
		return purchaseRepository.findAllByCustomerId(customerId);
	}

	@Override
	public Iterable<Purchase> getAllPurchases() {
		return purchaseRepository.findAll();
	}

	@Override
	public Purchase updatedPurchase(Purchase purchase, Long id) {
		Purchase existingPurchase =  getPurchaseById(id);
		existingPurchase.setPurchaseDate(purchase.getPurchaseDate());
		return purchaseRepository.save(existingPurchase);
	}

	@Override
	public void deletePurchase(Long id) {
		Purchase existingPurchase =  getPurchaseById(id);
		purchaseRepository.delete(existingPurchase);
	}

}
