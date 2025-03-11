package org.generation;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		/**
		 * Ciclo Do-While
		 * Ejecuta un bloque de código al menos una vez
		 * antes de evaluar la condición.
		 * 
		 * Sintaxis:
		 *     
		 *    do {
		 *    
		 *     Instrucciones;
		 *     
		 *    } while (condición);
		 * 
		 */
		
		/*
		* Mostrar en la consola un mensaje de bienvenida
		* Posteriormente preguntar al usuario si desea
		* seguir activo, si la respuesta es "sí" volver a mostrar
		* el mensaje de bienvenida, en caso contrario despedirse
		* y terminar el programa
		*/
		Scanner sc = new Scanner(System.in);
		String respuesta;
		 do {
			 System.out.println("Bienvenido/a");
			 System.out.println("¿Desea seguir activo/a?");
			 respuesta = sc.nextLine();
		 } while (respuesta.equalsIgnoreCase("Si"));
		 
		 sc.close();

		

	}

}
