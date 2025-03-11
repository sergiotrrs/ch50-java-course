package com.banregio;

/**
 *  Los pilares de OOP: encapsulación, herencia, polimorfismo, abstracción.
 *  
 *  Encapsulación: Principio de consiste en ocultar los detalles de como 
 *  funciona un objeto. Un aspecto importante de la encapsulación es el
 *  concepto de acceso controlado. Se puede establecer diferentes
 *  niveles de acceso para los atributos y métodos de un objeto.
 *  
 *  La encapsulación ofrece beneficios como:
 *  - Seguridad de datos: Ocultar los detalles internos o que los datos
 *  	sean modificados de manera incorrecta o no autorizada.
 *  - Modularidad: Se facilita la creacíón de componentes independientes
 *  	que pueden ser reutilizados.
 *  - Abstracción: Permite que los usuarios de un objeto se centren en
 *  	lo que hace el objeto en lugar de cómo lo hace.
 *  
 *  Niveles de acceso para la encapsulación:
 *  1.- Public: Son accesibles desde cualquier parte del código.
 *  2.- Protected: Son accesibles desde la misma clase, paquete y clases derivadas.
 *  3.- Default: Son accesibles dentro de la misma clase y del mismo paquete.
 *  4.- Private: Son accesibles dentro de la misma clase.
 * 
 */
public class Atm {
	
	private int serialNumber = 10;
	private double balance;
	private String model;
	
	// lleva la contabilidad del numero de objetos creados
	private static int counter;
	
	// bloque de inicializacion de atributos estaticos
	static {
		counter = 1000;
	}
	
	// bloque de inicializacion de atributos no estaticos
	{
		model = "---";
		serialNumber = counter++;
	}
	
	/* Métodos constructores
	 *  Un constructor es un tipo especial de método que se llama automáticamente
	 *  cuando se crea una instancia(objeto) de una clase. Su propósito principal
	 *  es inicializar el estado de un objeto recién creado.
	 *  
	 *  Reglas:
	 *  - El nombre del constructor debe ser el mismo que el de la clase.
	 *  - Un constructor no tiene retorno.
	 *  - Un constructor puede llamar a otro constructor de la misma clase usando
	 *  	la palabra this(). Esta llamada debe ser la primera instrucción del constructor.
	 *  - Es posible tener una sobrecar de constructores.
	 *  - Constructor por default: Si no se proporciona un constructor en la clase, Java
	 *  	proporciona un constructor por defecto sin parámetros.
	 */
	private Atm(){
	 	
	}
	
	public Atm(String model, double balance){
		// this.model = model.toUpperCase();
		setModel(model);
		this.balance = balance;
	}
	
	public Atm(double balance) {
		this("t-01", balance);
		System.out.println("Constructor con paramatro balance");
	}
	
	/**
	 *  factory method
	 *  https://refactoring.guru/es/design-patterns
	 *  Los patrones de diseño creacionales se utilizan para promover 
	 *  el código limpio, modular y fácil de mantener, así como para 
	 *  mejorar la flexibilidad y la reutilización del código.
	 *  
	 *  Patrón de diseño: Es una solución reutilizable y 
	 *  probada para problemas comunes en el desarrollo de software.
	 *  Anti-patrón: Es una práctica de diseño que parece 
	 *  útil pero que en realidad genera problemas de 
	 *  mantenimiento, rendimiento o escalabilidad.
	 */
	public static Atm createAirPortAtm() {
		return new Atm("T-2000", 900_000);
	}
	
	public String toString() {
		return serialNumber+ " " + model + " " + balance;
	}

	// Setter and Getter
	public void setModel(String model) {
		this.model = "ATM - " + model.toUpperCase();
	}
	
	public String getModel() {
		return this.model;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if( balance >= 0 ) {
			this.balance = balance;
		} else {
			throw new IllegalArgumentException("No se permiten valores negativos");
		}
		
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public static int getCounter() {
		return counter;
	}
	
	
	

}
