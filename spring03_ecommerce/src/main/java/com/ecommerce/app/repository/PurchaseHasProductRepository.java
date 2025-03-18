package com.ecommerce.app.repository;

import java.time.LocalDateTime;

import org.springframework.data.repository.CrudRepository;

import com.ecommerce.app.model.PurchaseHasProduct;
import com.ecommerce.app.model.embedded.PurchaseProductKey;

public interface PurchaseHasProductRepository extends CrudRepository<PurchaseHasProduct, PurchaseProductKey> {

	Iterable<PurchaseHasProduct> findAllByPurchaseId(Long purchaseId );
	Iterable<PurchaseHasProduct> findAllByPurchasePurchaseDate(LocalDateTime purchaseDate );
	void deleteByPurchaseIdAndProductId(Long purchaseId,  Long productId);
	
}
