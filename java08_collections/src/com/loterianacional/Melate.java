package com.loterianacional;

import java.util.*;

public class Melate {
	
	public static void main(String[] args) {
		Melate melate = new Melate();
		Set valores = melate.listaDeNumeros();
	}
	
	/*
	 * Crear una funcion que genere 6 numeros aleatorios
	 * del 1 al 46.
	 * El retorno de la función debe ser una colección
	 * Que contengan los 6 números ordenados
	 * de forma ascendente.
	 * Importante: Los números no se deben repetir.
	 * 
	 * Ej. [4,12,14,22,30,41]
	 */
	
	/**
	 * 
	 * @param minimo
	 * @param maximo
	 * @return
	 */
	int generarNumero(int minimo, int maximo){
	int numero = (int)Math.floor(Math.random()*maximo-minimo+1);
	return numero;
	}
	
	int generarNumero(int maximo) {
		return generarNumero(1, maximo);
	}
	
	int generarNumero() {
		return generarNumero(1,46);
	}
	
	TreeSet<Integer> listaDeNumeros(){
		TreeSet<Integer> NumerosMelate = new TreeSet<>();
		while(NumerosMelate.size() < 6) {
			NumerosMelate.add(generarNumero());
		}
		
		return NumerosMelate;
	}

}
