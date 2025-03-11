package org.generation;

public class ConditionalIf {

	public static void main(String[] args) {
		/**
		 * 
		 * Flujos de control: las sentencias de flujo de control interrumpen el flujo de
		 * ejecución empleando toma de decisiones, bucles y ramificaciones lo que
		 * permite que el programa ejecute condicionalmente bloques de código
		 * particulares.
		 * 
		 * Sintaxis de la condicional if Si la condicional es verdadera, se ejecuta la
		 * instrucción de if
		 * 
		 * if ( condicional ) sentencia;
		 * 
		 * if ( condicional ) { 
		 *    sentencias; 
		 * }
		 * 
		 * if ( condicional ) sentencia; 
		 * else sentencia_Si_condicional_es_falsa;
		 * ------------------------------------------------------ 
		 * if ( condicional )
		 *   sentencia; 
		 * else if ( nueva_condicional) 
		 *   sentencia; 
		 * else if ( n_condición )
		 *   sentencia; 
		 * else 
		 *   sentencia;
		 * 
		 */

		/*
		 * Verifica la edad de una persona. Si es mayor o igual de 18 imprimir:
		 * "Puede votar", caso contrario: "No puede votar"
		 */
		int age = 15;
		
		if( age >= 18 ) 
			System.out.println( "It is able to vote Its age is " + age );
		else 
			System.out.println( "It isn't able to vote because its age is " + age );
		
		/*
		 * De una variable tipo int, evaluar si está en el rango de 1 a 10, si es así
		 * desplegar en consola "La selección está en el rango" En caso contrario
		 * "La selección está fuera de rango"
		 */
		int rango = 5;
		if( rango >= 1 && rango <= 10 )
			System.out.println( "La selección está en el rango del 1 al 10" );
		else
			System.out.println( "La selección está fuera del rango del 1 al 10" );

		
		
		rango = 2;
		// Se imprime o no?
		if (rango == 15);{
			System.out.println("Número es igual"); // se imprime
		}
		
		/*
		 * Operador ternario.
		 * 
		 * Sintaxis: expresión ? respuesta_si_es_true : si_es_false
		 *
		 * Realizar el ejercicio anterior usado el operador ternario
		 */

		// Refactorizar el ejercicio anterior usando el operador ternario

		rango = 7;
		String msj = rango >= 1 && rango <= 10 ? "La seleccion esta en el rango" : "La seleccion esta fuera de rango";
		System.out.println( msj );
		
	}

}
