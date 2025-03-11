package org.generation;

import java.util.Scanner;

public class SeasonUsingSwitch {

	public static void main(String[] args) {
		// Refactorizar el ejercicio de Season
		// usando la condicional switch
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el mes: ");
		String mes = sc.nextLine();
		String mesName;

		switch (mes) {

		case "12", "1", "2":
			mesName = "primavera";
			break;
		case "3", "4", "5":
			mesName = "verano";
			break;
		case "6", "7", "8":
			mesName = "otoño";
			break;
		case "9", "10", "11":
			mesName = "invierno";
			break;
		default:
			mesName = "Mes invalido";

		}
		System.out.println("Estacion " + mesName);
	}

}
