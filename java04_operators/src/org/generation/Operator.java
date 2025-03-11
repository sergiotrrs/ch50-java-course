package org.generation;

public class Operator {

	public static void main(String[] args) {

		/* Arithmetic Operators
		  
		 	+	Additive operator (also used for String concatenation)
			-	Subtraction operator
		 	*	Multiplication operator
			/	Division operator
			%	Remainder operator
		 
		 Cuando se realizan operaciones entre tipo de datos diferentes
		 el resultado es promovido al de mayor jerarquía para evitar
		 pérdida de precisión.
		 
		 Ejemplo:   int * long = long
		 
		 *  1.- byte (8 bits)
		 *  2.- short (16 bits)
		 *  3.- int (32 bits)
		 *  4.- long (64 bits)
		 *  5.- float (32 bits)
		 *  6.- double (64 bits)
		 
		 */
		int opA = (int)5.2;
		int opB = 6;
		int suma = opA + opB;
		System.out.println( suma ); // 11
		
		int resta = opA - opB;
		System.out.println( resta ); // -1
		
		int multiplica = opA * (int)1.2; // 5
		int multiplica2 = (int)(opA * 1.2); // 6
		System.out.println(multiplica2); // 6
		
		double multiDouble = opA * 1.2;
		System.out.println( multiDouble); // 6.0
		System.out.println( multiDouble); // 6.0
		
		// double division = 456 / 0; 
		
		/*
		 * Java tiene varios tipos de datos numéricos para 
		 * optimizar el uso de memoria y mejorar el rendimiento, 
		 * ofreciendo flexibilidad para elegir el tipo adecuado 
		 * según el contexto y las necesidades del programa.
		 * 
		 * En ciclos o en bloques de código donde se realizan 
		 * muchas operaciones repetitivas, como iteraciones, 
		 * es recomendable usar tipos como int para evitar 
		 * conversiones innecesarias entre tipos y así 
		 * mejorar el rendimiento.
		 * 
		 */
		/*
		byte interes = 1;
		
		for (int i = 0; i < 1000; i++) {
			short resultado = (short)(50 * interes);			
		}*/
		int interes = 10;
		int resultado;
		for (int i = 0; i < 1000; i++) {
			resultado = 50 * interes;			
		}

	}

}
