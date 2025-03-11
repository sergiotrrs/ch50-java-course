package com.toyota;

/**
 * Crear la clase Car con lo siguiente: - 3 atributos no estáticos - 1 atributo
 * estáticos - 2 métodos no estáticos - 1 métodos estáticos
 * 
 * Crear una clase de prueba CarTest - Instanciar 5 autos - Agregarlos a una
 * colección. - Imprimir en consola las características del auto - usar un
 * formato String.format
 */
public class Car {

	// atributo estatico
	static String marca;

	// atributos no estaticos
	int numeroDeRuedas;
	String modelo;
	String tipoDeVehiculo;
	double costo;

	// método estatico
	static void imprimirMarca() {

		System.out.println("La marca de autos es: " + Car.marca);
	}

	// método no estático
	double aplicardescuento(Car carro, double porcentajeDescuento) {
		double descuento = carro.costo * porcentajeDescuento / 100;
		double descuentoAplicado = carro.costo - descuento;
		return descuentoAplicado;
	}

	String mostrarDetalles() {

		return String.format("Modelo: %s, Tipo: %s, Costo: $%.2f", modelo, tipoDeVehiculo, costo);
	}

}
