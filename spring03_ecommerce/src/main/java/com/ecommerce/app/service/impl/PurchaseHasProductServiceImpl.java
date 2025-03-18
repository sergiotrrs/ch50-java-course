package com.ecommerce.app.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ecommerce.app.model.PurchaseHasProduct;
import com.ecommerce.app.model.embedded.PurchaseProductKey;
import com.ecommerce.app.repository.PurchaseHasProductRepository;
import com.ecommerce.app.service.PurchaseHasProductService;

@Service
public class PurchaseHasProductServiceImpl implements PurchaseHasProductService {

	PurchaseHasProductRepository puHprRepository;
	
	public PurchaseHasProductServiceImpl(PurchaseHasProductRepository puHprRepository) {
		this.puHprRepository = puHprRepository;
	}

	@Override
	public PurchaseHasProduct createOrderHasProduct(PurchaseHasProduct purchaseHasProduct) {
		return puHprRepository.save( purchaseHasProduct );
	}

	@Override
	public Iterable<PurchaseHasProduct> getPurchaseHasProducts() {
		return puHprRepository.findAll();
	}

	@Override
	public PurchaseHasProduct getPurchaseHasProductByCompositeId(Long purchaseId, Long productId) {
		PurchaseProductKey purchaseProductKey = new PurchaseProductKey(purchaseId, productId);
		Optional<PurchaseHasProduct> optionalPuHpr = puHprRepository.findById(purchaseProductKey);
		if( optionalPuHpr.isEmpty()) {
			new IllegalStateException (
					"OrderHasProduct does not exist with order Id: " +
			purchaseId + " and product Id " + productId);
		}
		return optionalPuHpr.get();
	}

	@Override
	public Iterable<PurchaseHasProduct> getPurchaseHasProductsByPurchaseId(Long purchaseId) {
		return puHprRepository.findAllByPurchaseId(purchaseId);
	}

	@Override
	public PurchaseHasProduct updatePurchaseHasProductByCompositeId(PurchaseHasProduct purchaseHasProduct,
			long purchaseId, long productId) {
		PurchaseHasProduct existingPuHpr = getPurchaseHasProductByCompositeId(purchaseId, productId);
		existingPuHpr.setPurchaseSold( purchaseHasProduct.getPurchaseSold() );
		existingPuHpr.setQuantity( purchaseHasProduct.getQuantity() );
		return puHprRepository.save( existingPuHpr );
	}

	@Override
	public void deletePurchaseHasProductByCompositeId(Long purchaseId, Long productId) {
		PurchaseHasProduct existingP = getPurchaseHasProductByCompositeId(purchaseId, productId);
		puHprRepository.delete(existingP);		
	}

	
}
