package org.generation;

import java.util.ArrayList;
import java.util.List;

import com.roles.Pet;
import com.zoo.*;

public class AnimalTest {

	public static void main(String[] args) {
		
		// new Animal(); no se puede instanciar una clase abstracta
		// new Feline(); no se puede instanciar una clase abstracta
		Cat michi = new Cat(true, 3);
		Feline esfir = new Cat(true, .6);
		Animal bebito = new Cat(true, 5);
		Animal polibio = new Cat(true, 8);
		polibio = new Leopard(8);

		System.out.println( michi.isAlive() );
		if( bebito instanceof Cat ) {
			System.out.println( ((Cat)bebito).isAlive() );
		}
		
		if( polibio instanceof Cat ) {
			System.out.println( ((Cat)polibio).isAlive() );
		} else {
			System.out.println("Polibio no es instancia de Cat");
		}
		
		List< Animal > animales = new ArrayList<>() ;
		animales.add(michi);
		animales.add(esfir);
		animales.add(bebito);
		animales.add(polibio);
			
		giveFood( animales );
		
	}
	
	static void giveFood( List<Animal> animales) {
		for(Animal animal : animales) {
			System.out.println(animal.getCommonName() + " - " + animal.eat("agua"));
			System.out.println(animal.getCommonName() + " - " + animal.noise() );
			
			// TODO hacer que hagan un truco 
			if( animal instanceof Pet ) {
				System.out.println( ((Pet)animal).trick() );
			}
		}
	}

}
