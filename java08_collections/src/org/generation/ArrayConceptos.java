package org.generation;

public class ArrayConceptos {

	public static void main(String[] args) {
		/*
		 *  Las variables de tipo array se definen con corchetes []
		 *  Los corchetes pueden ir antes o después de la variable
		 *  ej. int[] myArray;
		 *      int myArray[];
		 *  
		 *  Para los array se debe asignar la cantidad de elementos
		 *  que contendrá.
		 *  Una vez definido, el arreglo no púede cambiar su tamaño
		 *      
		 *      
		 */
		// Definir un arreglo de 4 elementos de tipo int.
		// creando un objeto de tipo array de integers.
		int[] codigoColores = new int[4]; // [ 0 , 0  , 0 , 0 ]

		// Iniciar un arreglo.
		// String[] frutas = new String[3]; // [ null , null , null ]
		String[] frutas = {"Uva", "Fresa", "Manzana"};
		
		// Crear un arreglo que almacene 4 nombres de automóviles
		String[] autos = {"Porsche 911","Maserati MC20","BMW M2", "Honda Civic Type R"};
		
		autos[1] = "Vochito";
		System.out.println( autos );
		
		// iterando un arreglo usando for loop
		for(int i = 0; i < autos.length ; i++ ) {
			System.out.println("Nombre de Auto :" + autos[i]);
		}
		
		// for loop enhanced 
		for(String auto : autos) {
			System.out.println("Auto: " + auto);
		}
		
		// Generar un arreglo de 2 dimensiones
		String[][] participantes = new String[3][5]; // 3 filas, 5 columnas
				
		/* 
		 * [  
		 *    [null, , , , ] ,   
		 *    [ , , , ,    ] , 
		 *    [ , , , ,    ]  
		 * ] 
		 * 
		 * */
	}

}
