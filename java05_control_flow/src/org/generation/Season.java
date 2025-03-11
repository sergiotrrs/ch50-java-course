package org.generation;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		/*
		 * Determinar la estación.
		 * 
		 * 1.- Solicitar al usuario que ingrese un mes como numero. Ejemplo: 1, 12, etc.
		 * 2.- Determinar la estación del año de acuerdo al mes ingresado 3.- Imprimir
		 * la estación correspondiente: Primavera, Verano, Otoño, Invierno
		 * 
		 * donde: - Primavera: Marzo, Abril, Mayo - Verano: Junio, Julio, Agosto -
		 * Otoño: Septiembre, Octubre, Novimiembre - Invierno: Diciembre, Enero, Febrero
		 * 
		 * Evaluar los meses usando if-else-if
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el número del mes");
		int mes = 0;
		if( sc.hasNextInt() ) {
			mes = sc.nextInt();
			sc.nextLine();
			if (mes == 12 || mes == 1 || mes == 2) {
				System.out.println("Invierno");
			} else if (mes >= 3 && mes <= 5) {
				System.out.println("Primavera");
			} else if (mes >= 6 && mes <= 8) {
				System.out.println("Verano");
			} else if (mes >= 9 && mes <= 11) {
				System.out.println("Otoño");
			} else {
				System.out.println("Ingrese un número válido");
			}
			
		} else {
			System.out.println("No se puede procesar el valor introducido");
		}
		
		sc.close();

	}

}
