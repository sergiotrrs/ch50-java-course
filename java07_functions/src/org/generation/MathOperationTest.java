package org.generation;

import java.util.Scanner;

public class MathOperationTest {

	public static void main(String[] args) {
	
		String name = new String("hola");
		
		/*
		 * A partir de las version 10 de java se puede
		 * disponer de la palabra reservadada 'var'.
		 * 
		 * sirve para inferir tipos de datos de 
		 * variables locales.
		 */
		var sc = new Scanner( System.in );
		
		MathOperation op1 = new MathOperation();
		var op2 = new MathOperation();
		
		float resultado1 = op1.sumar(10, 10.5F );
		System.out.println("Resultado 1: " + resultado1 );
		
		/*
		 *  La abstracción es un principio que oculta 
		 *  los detalles de implementación y expone 
		 *  solo la funcionalidad esencial de un objeto. 
		 * 
		 *  En Java, se logra mediante:
		 * - Clases abstractas (que pueden contener 
		 *  métodos abstractos y concretos).
		 * - Interfaces (que definen un contrato 
		 *  para las clases que las implementan).
		 */
		double resultado2 = op1.sumar(5, "5" );
		System.out.println("Resultado 2: " + resultado2 );
		
		
		double resultado3 = op1.sumar("5", "5" );
		System.out.println("Resultado 3: " + resultado3 );
		

	}

}
