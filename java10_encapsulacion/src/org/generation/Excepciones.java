package org.generation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Una excepción es una situación no esperada
 * durante la ejecución de un programa.
 * 
 * Existen dos tipos de excepciones.
 * 
 * A) Checked Exceptions: Son  excepciones que se heredan
 * de la clase Exceptions. Se tiene que declarar la excepción
 * en la firma del método o bien manejar la excepción con 
 * el bloque try-catch.
 * 
 * B) Unchecked Exceptions: Son excepciones que se heredan
 * de la clase RuntimeException. No se está obligado a procesarlas.
 * Es opcional el uso de try-catch o declar en la firma del método.
 * 
 * Las excepciones de Error, son arrojadas por la JVM, son errores
 * de los que no se pueden recuperar.
 * 
 * Manejo de excepciones con el bloque try-catch
 * 
 * Sintaxis:
 * 
 *  try{
 *  
 *  }
 *  catch(exception e  ){
 *  
 *  }
 * 
 * try: bloque que contendrá sentencias que pudieran generar una excepción.
 * catch: se ejecutará si ocurre una excepción en try
 * finally: se ejecutará después de try o catch.
 * 
 * El stacktrace de una excepción es el conjunto
 * de mensajes desde el origen de la excepción
 * hasta la última clase que recibe la excepción.
 * 
 * 
 */
public class Excepciones {

	public static void main(String[] args)  {
		System.out.println("Inicio de mi programa");
		// declarar un array de 2 dimensiones con los valores [5, 6]
		int[] numbers= {5,6};
		
		try {
			readFileWithException();
			// int number = numbers[5];
			char caracter = "Hola".charAt(100);
			System.out.println("Dentro del bloque try");
		} catch ( FileNotFoundException e ) {
			System.out.println("El archivo no se encuentra");
			e.printStackTrace();
		} catch( ArrayIndexOutOfBoundsException e ) {
			System.out.println("Pilas, te estás confundiendo con JS");
			e.printStackTrace();
		} catch( Exception e ) {
			System.out.println("Sucedió algo inesperado");
			e.printStackTrace();
		} finally {
		
			System.out.println("Fin de mi programa");
		}
		
		

	}
	
	public static void readFileWithException() throws FileNotFoundException  {
		File file = new File("myFile.txt");
		Scanner sc = new Scanner( file );
		sc.close();

	}
	
	
	
	

}
