package com.zoo;

public final class Leopard extends Feline {

	public Leopard(double age) {
		super(age);
	}

	@Override
	public String eat(String food) {
		return "El Leopardo come " + food;
	}
	

}
