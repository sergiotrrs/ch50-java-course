package com.banregio;

import java.util.ArrayList;
import java.util.List;

public class AtmTest {

	public static void main(String[] args) {

		// Atm cajero1 = new Atm();
		// Atm cajero2 = new Atm();

		Atm cajero1 = new Atm("T-800", 450_000);
		Atm cajero2 = new Atm("T-1000", 500_000);
		Atm cajero3 = new Atm(600_000);
		Atm cajero4 = Atm.createAirPortAtm();

		cajero4.setModel("t-888");
		
		try {
			cajero4.setBalance(-3000);
		} catch (IllegalArgumentException e) {
			System.out.println("No puedes establecer un balance negativo");
			e.printStackTrace();
		} finally {
			System.out.println("Se omitirá este valor");
		}

		System.out.println(cajero1.toString());
		System.out.println(cajero2);
		System.out.println(cajero3);
		System.out.println(cajero4);

		ArrayList<Atm> cajeros = new ArrayList<>(List.of(cajero1, cajero2));

	}

}
