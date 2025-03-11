package com.roles;


/**
 *  Una interfaz es una declaración formal de un contrato, en la
 *  cuál los métodos no contienen implementaciones.
 *  Es similar a los métodos abstractos.
 *  
 *  Una clase puede implementar varias interfaces.
 *  
 *  Las interfaces son adecuadas para proporcionar funcionalidad
 *  a clases que no están relacionadas entre si.
 *  
 *  
 *  Para patrones de diseño, se suele utilizar interfaces.
 */
public interface Pet {
	// Los atributos en las interfaces son de tipo public, final y static
	// public final static boolean PET = true;
	public final boolean IS_PET = true;
	
	// Los métodos por default son de tipo public, abstract
	String trick(); 
	
	// A partir de la versión 8 de Java, se pueden tener
	// métodos con implementaciones.
	// Estos métodos deben ser default
	default String greeting() {
		return "Soy una mascota";
	}

}
