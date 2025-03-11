package com.zoo;

import com.roles.Pet;

public class Cat extends Feline implements Pet {
	
	private boolean isDomestic;
	final private boolean isAlive;
	
	public Cat(boolean isDomestic, double age) {
		super(age);
		this.isDomestic = isDomestic;
		super.setCommonName("Gato");
		isAlive = true;
	}

	final public boolean isDomestic() {
		return isDomestic;
	}

	public void setDomestic(boolean isDomestic) {
		this.isDomestic = isDomestic;
	}

	@Override
	final public String eat(String food) {
		return "El " + super.getCommonName() +  " come " + food;
	}
	
	@Override
	final public String noise() {
		return "El " + super.getCommonName() +  " hace miau";
	}

	@Override
	public String trick() {
		return "El " + super.getCommonName() +  " solo existe" ;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public double birthday() {
		super.setAge( super.getAge() + 1 );
		return super.getAge();
	}
	
}
