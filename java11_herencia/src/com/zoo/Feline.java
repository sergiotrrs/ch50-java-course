package com.zoo;

public abstract class Feline extends Animal {

	public Feline(double age) {
		super("Feline", "Felidae", age);
	}
	
	/**
	 *  Sobreescritura de métodos (Override)
	 *  
	 *  Para que un método sea sobreescrito, este debe tener la misma
	 *  firma del método de la clase superior. La sobreescritura permite
	 *  personalizar el comportamiento heredado.
	 *  
	 *  @Override: Anotación que indica que el método está sobreescribiendo
	 *  el comportamiento de una método de la clase heredada.
	 *  Su propósito es hacer una validación en tiempo de
	 *  compilación para asegurarse que la subclase está
	 *  sobreescribiendo correctamente y coincide
	 *  con la firma del método.
	 */
	@Override
	public String noise() {
		return "GRRRRR";
	}
	
}
