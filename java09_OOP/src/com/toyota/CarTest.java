package com.toyota;

import java.util.ArrayList;

public class CarTest {

	public static void main(String[] args) {
		Car auto1 = new Car();
		auto1.modelo = "Hilux";
		auto1.tipoDeVehiculo = "camioneta";
		auto1.costo = 495_400;
		Car auto2 = new Car();
		auto2.modelo = "Highlander";
		auto2.tipoDeVehiculo = "Suv";
		auto2.costo = 887_700;
		Car auto3 = new Car();
		auto3.modelo = "Hilux";
		auto3.tipoDeVehiculo = "camioneta";
		auto3.costo = 495_400;
		Car auto4 = new Car();
		auto4.modelo = "Hilux";
		auto4.tipoDeVehiculo = "camioneta";
		auto4.costo = 495_400;
		Car auto5 = new Car();
		auto5.modelo = "Hilux";
		auto5.tipoDeVehiculo = "camioneta";
		auto5.costo = 495_400;

		ArrayList<Car> autos = new ArrayList<>();
		autos.add(auto1);
		autos.add(auto2);
		autos.add(auto3);
		autos.add(auto4);
		autos.add(auto5);

		mostrarAuto(autos);
	}

	static void mostrarAuto(ArrayList<Car> autos) {
		for (Car auto : autos) {
			System.out.println(auto.mostrarDetalles());

		}
	}

}
