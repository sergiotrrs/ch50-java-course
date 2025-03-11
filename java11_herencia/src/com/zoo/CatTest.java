package com.zoo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.roles.Pet;

/**
 *  Las pruebas unitarias son pruebas automatizadas 
 *  que verifican el comportamiento de unidades 
 *  individuales de código, como métodos o 
 *  funciones, de forma aislada. 
 *  
 *  Ventajas:
 *   - Detección temprana de errores
 *   - Facilita el mantenimiento y refactorización
 *   - Mejora la calidad del código
 *   - Permite ejecución rápida y automatizada
 *   
 *  Desventajas:
 *   - Tiempo de desarrollo adicional
 *   - No detecta errores de integración
 *   - Requiere mantenimiento de los tests
 */
class CatTest {

	//  indica que un método es una prueba unitaria
	@Test
	void catData() {
		Cat michi = new Cat(true, 5);
		// asercion en JUnit que verifica si dos valores
		// son iguales
		assertEquals( true , michi.isAlive(), "El gato debe estar vivo" );
	    assertEquals( true , michi.isDomestic(), "El gato debe ser domestico" );
	    assertEquals( true , michi.IS_PET, "El gato es una mascota");
	    assertEquals( true , michi.noise().length()>0, "Debe tener un sonido" );
	    assertEquals( 5 , michi.getAge(), "Debe tener 5 anios");
	    
	    // TODO crear metodo bithday
	    assertEquals( 6, michi.birthday(), "El gato debe aumentar la edad" );
	    assertEquals( 6 , michi.getAge(), "Debe tener 6 anios");
	    
	}
	
	@Test
	void CorroborarHerencia() {
		Cat michi = new Cat(true, 5);
		assertEquals(true, michi instanceof Cat );
		assertEquals(true, michi instanceof Feline );
		assertEquals(true, michi instanceof Animal );
		assertEquals(true, michi instanceof Pet );
		assertEquals(true, michi instanceof Object );
	}
	

}
