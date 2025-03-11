package org.generation;

public class ConditionalOperator {

	public static void main(String[] args) {
		/*
		 * Los operadores evaluan valores booleanos
		 * Tienen el comportamiento de corto circuito: El segundo operador
		 *  solo se evalua si es necesario
		 
		   && conditional AND
		   ||  conditonal OR
		 
		 */
		  int value1 = 1;
	      int value2 = 2;
	        
	      if((value1 == 1) && (value2 == 2))
	          System.out.println("value1 is 1 AND value2 is 2"); // se imprime
	      
	      if((value1 == 1) || (value2 == 1))
	            System.out.println("value1 is 1 OR value2 is 1"); // se imprime

	      
	      
	      int x = 10, y = 5, z = 20;
	      boolean resultado1 = (x > y) && (z > x); // true
	      boolean resultado2 = (x < y) && (z > x); // false
	      
	      boolean resultado3 = (x < y) || (z > x); // true
	      boolean resultado4 = (x < y) || (z < x); // false
	      
	      
	}

}
