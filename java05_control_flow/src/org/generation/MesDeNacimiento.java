package org.generation;

import java.util.Scanner;

public class MesDeNacimiento {

	public static void main(String[] args) {
		// Switch usa el método equals para comparar los Strings.
		/**
		 * Leer usando la clase Scanner un mes (1 - 12) e indicar el mes en texto.
		 * ej:entrada-> "Escribe tu mes de nacimiento: " 12 salida-> Naciste en
		 * diciembre.
		 * 
		 */
		Scanner sc = new Scanner( System.in);
		System.out.println("Escribe tu mes de nacimiento: ");
		
		String month = sc.nextLine();
		// int month = sc.nextInt();
		String monthName;
		
		switch( month ) {
		
		case "1": 
			monthName = "Enero";
			break;
		case "2":
			monthName = "Febrero";
			break;
		case "3": 
			monthName = "Marzo";
			break;
		case "4":
			monthName = "Abril";
			break;
		case "5", "6", "7", "8", "9", "10", "11", "12":
			monthName = "En proceso de obtenerlo";
			break;
		default:
			monthName = "Mes invalido";
		
		}
		System.out.println("El mes es " + monthName);

	}

}
