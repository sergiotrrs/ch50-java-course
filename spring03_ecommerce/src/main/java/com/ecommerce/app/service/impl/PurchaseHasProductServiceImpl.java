package com.ecommerce.app.service.impl;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ecommerce.app.model.Product;
import com.ecommerce.app.model.PurchaseHasProduct;
import com.ecommerce.app.model.embedded.PurchaseProductKey;
import com.ecommerce.app.repository.PurchaseHasProductRepository;
import com.ecommerce.app.service.ProductService;
import com.ecommerce.app.service.PurchaseHasProductService;

@Service
public class PurchaseHasProductServiceImpl implements PurchaseHasProductService {

	PurchaseHasProductRepository puHprRepository;
	ProductService productService;

	public PurchaseHasProductServiceImpl(PurchaseHasProductRepository puHprRepository, ProductService productService) {		
		this.puHprRepository = puHprRepository;
		this.productService = productService;
	}

	@Override
	public PurchaseHasProduct createOrderHasProduct(PurchaseHasProduct purchaseHasProduct) {
		// TODO evitar que el cliente envie el atribut Id de la llave compuesta
		PurchaseProductKey compositeKey = new PurchaseProductKey();
		compositeKey.setPurchaseId( purchaseHasProduct.getPurchase().getId() );
		compositeKey.setProductId( purchaseHasProduct.getProduct().getId() );
		purchaseHasProduct.setId( compositeKey );
		
		// Calcular purchaseSold a partir del precio del producto y cantidad		
		purchaseHasProduct.setPurchaseSold( calculateTotalPurchase(purchaseHasProduct) );
		return puHprRepository.save( purchaseHasProduct );
	}
	
	private BigDecimal calculateTotalPurchase(PurchaseHasProduct purchaseHasProduct) {
		Product existingProduct = getProductOfPurchase( purchaseHasProduct.getProduct().getId() );
		BigDecimal priceValue = new BigDecimal( existingProduct.getPrice().toString() );
		BigDecimal quantityValue = new BigDecimal( Integer.toString( purchaseHasProduct.getQuantity() ));
		BigDecimal total = priceValue.multiply(quantityValue);
		return total;
	}
	
	private Product getProductOfPurchase( Long id ) {
		return productService.getProductById( id );
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
		existingPuHpr.setQuantity( purchaseHasProduct.getQuantity() );
		existingPuHpr.setPurchaseSold( calculateTotalPurchase( existingPuHpr ));
		return puHprRepository.save( existingPuHpr );
	}

	@Override
	public void deletePurchaseHasProductByCompositeId(Long purchaseId, Long productId) {
		PurchaseHasProduct existingPuHpr = getPurchaseHasProductByCompositeId(purchaseId, productId);
		puHprRepository.delete(existingPuHpr);		
	}

	
}
