package org.generation;

/**
 *  Las funciones(métodos) son fundamentales por:
 *  
 *  - Reutilización del código.
 *  - Organizar el código.
 *  - Facilidad de depuración.
 *  - Mejora la legibilidad.
 *  - Abstracción: encapsular la lógica de una tarea
 */
public class MathOperation {
	
	/*
	 *  https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html
	 *  Sintaxis de un método:
	 *  
	 *   <modificadores_de_acceso> <tipo_retorno> nombreMétodo( parámetros ) <lista_de_excepciones> {
	 *   
	 *      // cuerpo del método
	 *   }
	 *   
	 *   Modificadores de acceso: public, protected, default, private.
	 *   Tipo retorno: Especifica el tipo de valor que el método devolverá( return ).
	 *   		Si el método no devuelve ningún valor(String, int, etc), 
	 *   		se usa la palabra reservada "void".
	 *   Nombre del método: Se recomienda comenzar el nombre con un verbo, 
	 *   		seguido por un adjetivo, sustantivo, etc. Usar la convención camelCase.
	 *   Parámetros: Lista de parámetros separados por coma.
	 *   
	 *   La firma del método es como:
	 *   nombreMétodo( double, int, double, double  )
	 *   
	 *   
	 */
	
	
	/**
	 * Sobrecarga 1
	 * Sumatoria de dos números de punto flotante
	 * @param numeroA operando 1
	 * @param numeroB operando 2
	 * @return resultado de la sumatoria de A más B
	 */
	float sumar( float numeroA, float numeroB ) {
		return numeroA + numeroB;
	}
	
	/**
	 * Sobrecarga 2
	 * El polimorfismo en tiempo de compilación en Java 
	 * se conoce como sobrecarga de métodos (Method Overloading). 
	 * Ocurre cuando múltiples métodos en una misma clase 
	 * tienen el mismo nombre pero diferentes firmas 
	 * (diferente número o tipo de parámetros).
	 */
	double sumar( float a, String b ) {
		return sumar( a, Float.parseFloat(b) );
	}
	
	/**
	 * Sobrecarga 3
	 */
	double sumar( String a, float b ) {
		return sumar( Float.parseFloat(a), b );
	}
	
	/**
	 * Sobrecarga 4
	 */
	double sumar( String a, String b ) {
        return sumar( Float.parseFloat(a), Float.parseFloat(b) );
    }

}
