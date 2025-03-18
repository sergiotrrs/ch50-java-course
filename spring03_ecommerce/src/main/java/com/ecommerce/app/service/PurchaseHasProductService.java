package com.ecommerce.app.service;

import com.ecommerce.app.model.PurchaseHasProduct;

public interface PurchaseHasProductService {
	
	PurchaseHasProduct createOrderHasProduct(PurchaseHasProduct purchaseHasProduct);
	Iterable<PurchaseHasProduct> getPurchaseHasProducts();	
	PurchaseHasProduct getPurchaseHasProductByCompositeId(Long purchaseId, Long productId);	
	Iterable<PurchaseHasProduct> getPurchaseHasProductsByPurchaseId(Long purchaseId);		
	PurchaseHasProduct updatePurchaseHasProductByCompositeId(PurchaseHasProduct purchaseHasProduct, long purchaseId, long productId);
	void deletePurchaseHasProductByCompositeId(Long purchaseId, Long productId);

}
