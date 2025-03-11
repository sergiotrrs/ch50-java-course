package org.generation;

import java.util.*;


public class HashSetConceptos {

	public static void main(String[] args) {
		/*
		 * Una colección de tipo set es una colección NO ordenada.
		 *  - No se permiten elementos duplicados
		 *  - cualquier elemento duplicado no se insertará
		 *  
		 *  Sintaxis:
		 *    HashSet<Object> varName = new HashSet<>();
		 */
		HashSet<String> pokemones = new HashSet<>();

		// agregar elementos con el método add()
		pokemones.add( "Meow" );
		// Agregar 4 elementos más a la colección.
		pokemones.add("Magikarp");
		pokemones.add("Pikachu");
		pokemones.add("Gengar");
		pokemones.add("Charmander");
		System.out.println(pokemones);
		
		// Agregar elementos que ya existen
		System.out.println("Agregado Pikachu? " + pokemones.add("Pikachu"));
		System.out.println(pokemones);
		
		// Obtener el tamaño de la colección, size() 
		System.out.println( pokemones.size() );
		
		// Saber si un elemento existe, contains()
		System.out.println("Pikachu? " + pokemones.contains("Pikachu"));
		System.out.println("Charizard? " + pokemones.contains("Charizard"));
		
		// Remover un elemento, remove()
		System.out.println("Remove Pikachu ? " + pokemones.remove("Pikachu"));
		
		// Iterar la colección:
		for (String pokemon : pokemones) {
			System.out.println("Quien es ese pokemon?: " + pokemon);
		}
		
		/*
		 *  Colección ArrayList con 6 elementos.
		 *  Debe haber 2 elementos duplicados.
		 *  
		 *  Colección de Nombres de la Ch50
		 */
        ArrayList<String> alumni = new ArrayList<>();
        alumni.add("Andrea");
		alumni.add("Jose");
		alumni.add("Alejandra");
		alumni.add("Alejandra");
		alumni.add("Fernado");
		alumni.add("Jose");
		
		
		System.out.println( "These are the classmates: \n" + alumni );
			
		//HashSet<String> nombresUnicos = new HashSet<>( alumni );
		// System.out.println( nombresUnicos );
		// HashSet<String> nombresUnicos = new HashSet<>( List.of("Cecilia") );
		LinkedHashSet<String> nombresUnicos = new LinkedHashSet<>( List.of("Cecilia") );
		
		nombresUnicos.addAll(alumni);
		System.out.println(nombresUnicos);
		
	}

}
