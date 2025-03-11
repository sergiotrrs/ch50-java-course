package org.generation;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		/*
		 * La clase Scanner en Java se utiliza para 
		 * leer datos de entrada de diferentes fuentes, 
		 * como la consola, archivos o flujos de texto. 
		 * Es especialmente útil para interactuar con 
		 * el usuario mediante la consola.
		 * 
		 * La clase Scanner en Java es una clase útil 
		 * que se encuentra en el paquete java.util
		 * 
		 */
		int myNumber;
		Scanner sc; // declarando la variable
		// 1.- instanciando la clase scanner
		// 2.- asignando el objeto creado a la variable
		sc = new Scanner( System.in );  
		
		System.out.print("Escribe tu nombre? ");
		
		/*
		 * Lee una línea completa de entrada como cadena de texto.
		 * Devuelve todo el texto de la línea, excluyendo el
		 * carácter de salto de línea(\n).
		 * 
		 * Buffer: Memoria temporal donde se almacenan los datos
		 * de entrada antes de ser procesados.
		 */
		String name= sc.nextLine();
		System.out.println("Hola " + name );
		
		
		
		System.out.print("Dime tu num de suerte: ");
		if( sc.hasNextInt()  ) {
			int number = sc.nextInt(); // lee un valor entero del buffer
			System.out.println("Numero de suerte " + number );
		} else {
			System.out.println("No puedo procesar ese valor ");
		}
		
		 /*
		  * Se recomienda usar nextLine() adicional para
		  * capturar el salto de línea que quedó tras la entrada de nextInt()
		  */
		sc.nextLine();
		System.out.print("Escribe tu cancion? ");
		String song = sc.nextLine();
		System.out.println("Excelente melodia " + song );
		
		sc.close();

	}

}
