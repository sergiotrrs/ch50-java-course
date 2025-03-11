package com.banregio;

import java.util.ArrayList;

public class AtmTest {

	public static void main(String[] args) {
		
		Atm.bankName = "Banregio";
		Atm.printBankName();
		
		Atm cajero1 = new Atm();
		cajero1.balance = 450_000;
		cajero1.model = "T-800";
		cajero1.serialNumber = 1008;
		
		// Crear 2 cajeros, inicializar sus atributos
		Atm cajero2 = new Atm();
		cajero2.balance = 127_000;
		cajero2.model = "T_700";
		cajero2.serialNumber = 468;
		
		Atm cajero3 = new Atm();
		cajero3.balance = 250_982;
		cajero3.model = "T_850";
		cajero3.serialNumber = 384;
		
		ArrayList< Atm > sucursal = new ArrayList<>(); 
		sucursal.add(cajero1);
		sucursal.add(cajero2);
		sucursal.add(cajero3);
		
		imprimirBalanceDeCajeros( sucursal );
			
	} // main
	
	static void imprimirBalanceDeCajeros(ArrayList<Atm> cajeros ) {
		
		for (Atm atm : cajeros ) {
			System.out.println( atm.checkBalance() );
		}
		
		
	}

} // class AtmTest
