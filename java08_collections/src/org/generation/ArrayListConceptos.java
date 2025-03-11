package org.generation;

import java.util.ArrayList;

public class ArrayListConceptos {

	public static void main(String[] args) {
		/*
		 * Array List.
		 * https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
		 * 
		 * Una colección List es una colección ...
		 *  - Es una colección ordenada (respeta el orden en que se agregan)
		 *  - Se permite elementos duplicados
		 *  - Se basa en un array redimensionable que crece su tamaño,
		 *   según crece la colección de elementos.
		 *  - Esta colección es la mejor rendimiento tiene.
		 *  
		 *  Sintaxis:
		 *  ArrayList<object> varName = new ArrayList<>();
		 *  
		 * 
	 */
		
		
		// Definir una colección de datos numéricos
		// ArrayList< int > numeros; Se debe indicar una clase(whrapper para los primitivos)
		ArrayList< Integer > numeros;
		numeros = new ArrayList<>();
		
		// Definir una colección de Strings
		ArrayList<String> nombrePerfumes = new ArrayList<>();
		
		// Agregar un elemento con el método add()
		nombrePerfumes.add("Daisy");
		System.out.println( nombrePerfumes );
		
		// Agregar 4 elementos más:
		nombrePerfumes.add("Miss Dior");
        nombrePerfumes.add("Samsara de Guerlain");
        nombrePerfumes.add("Sauvage de Dior");
        nombrePerfumes.add("212 Heroes de Carolina Herrera");
        
        // Agregar un elemento duplicado
        nombrePerfumes.add("Miss Dior");
        
        System.out.println( nombrePerfumes );
        
        // Obtener el tamaño de una colección, size()
        System.out.println( nombrePerfumes.size() );
        
        // Mostrar un elemento en particular, get()
        // Indicar el número de índice.
        System.out.println("indice 1: " + nombrePerfumes.get(1) );
        
        // Remover un elemento, remove()
        System.out.println("Eliminado: " + nombrePerfumes.remove(1 ));
        
        System.out.println( nombrePerfumes );
        
        // Verificar si un elemento existe, contains()
        System.out.println("Existe Rayo McQueen: " + nombrePerfumes.contains("Rayo McQueen"));
        
        // Iterar los elementos de mi colección
        
        
        // Usando for loop enhanced
        for( String perfume : nombrePerfumes ) {
        	System.out.println("Tengo: " + perfume );
        }
        
        // Reemplazar un elemento, set()
        nombrePerfumes.set(0, "Bad boy");
        System.out.println( nombrePerfumes );
        
        /* Iterar la colección usando foor loop */
        for (int i = 0; i < nombrePerfumes.size(); i++) {
            System.out.println("Nombre de Perfume: " + nombrePerfumes.get(i));
        }
        
	}

}
