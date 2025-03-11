package org.generation;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapConceptos {

	public static void main(String[] args) {
		/*
		 * Una colección Map, es una relación clave(key): valor (value)
		 * que forma una tabla de datos
		 * 
		 *  - Nos funciona mejor para encontrar elementos
		 *  
		 *  Sintaxis:
		 *  HashMap< key, value > varName = new HashMap<>();
		 */
		// Instanciar la clase HashMap
		HashMap< Integer, String > funkos = new HashMap<>();

		// Agregar valores a la coleccion, put()
		funkos.put( 1, "Batman" ); 
		funkos.put( 1329, "Spiderman" ); 
		funkos.put( 875, "Prision Mike" ); 
		funkos.put( 1602, "Dundie" ); 
		funkos.put( 703, "Rachel" ); 
		funkos.put( 702, "Ross" ); 
		funkos.put( 1435, "GhostSpider" ); 
		System.out.println( funkos );
		
		// Reemplazar un elemento
		funkos.put( 1329, "Spiderman San Valentín");
		System.out.println( funkos );
		
		// Obtener un elemento, get( key)
		System.out.println("Funko 1435 " + funkos.get( 1435 ));
		
		// Eliminar un elemento, remove( key)
		System.out.println("Eliminado: " + funkos.remove(1602));
		
		// Iterar la colección, usando las keys
		for( Integer modelo : funkos.keySet() ) {
			System.out.println("Funko: " + modelo + " " + funkos.get( modelo ) );
		}
		
		// Iterar la colección con sus valores
		for( String nombreFunko : funkos.values() ) {
			System.out.println("=Funko: " + nombreFunko );
		}
		
		// Ordenar los key, usando la clase TreeMap
		TreeMap<Integer, String> funkosOrdenados = new TreeMap<>( funkos );
		System.out.println( funkosOrdenados);
		
		
	}

}
