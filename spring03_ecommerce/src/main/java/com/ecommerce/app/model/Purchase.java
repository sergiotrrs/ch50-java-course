package com.ecommerce.app.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;

@Entity
@Table(name="purchases")
public class Purchase {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="purchase_date")
	private LocalDateTime purchaseDate;

	@ManyToOne
	@JoinColumn(name = "fk_customer_id")
	@JsonIgnoreProperties({"firstName","lastName", "password", "birthDate", "active","roles", "createdAt"})
	private Customer customer;
		
	public Purchase() {	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDateTime purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}