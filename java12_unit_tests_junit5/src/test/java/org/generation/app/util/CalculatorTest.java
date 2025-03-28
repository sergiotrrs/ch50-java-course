package org.generation.app.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.CsvSource;

@DisplayName("Pruebas unitarias de la clase Calculator del paquete util")
public class CalculatorTest {

    Calculator calculator= new Calculator();

    @Test
    @DisplayName("Sumatoria de números positivos")
    void addTest(){        
        assertEquals( 5 , calculator.add(2,3) );
        assertEquals( 50 , calculator.add(25,25) );
        assertEquals( 100 , calculator.add(70,30) );
    }

    @Test
    @DisplayName("Sumatoria de números negativos")
    void addNegativeNumbersTest(){
    	assertEquals( -8 , calculator.add(5,-13) );
    	assertEquals( -50 , calculator.add(-100,50) );
    }

    @Test
    @DisplayName("Sumatoria de números de punto flotante")
    void addDoubleTest(){
        double delta = .01;
        assertEquals( .1, calculator.add(0.05, 0.05), delta, "0.05 + 0.05=0.1");
        assertEquals( .2, calculator.add(0.1 , 0.1 ), delta, "0.1 + 0.1=0.2");
        assertEquals( .3, calculator.add(0.1 , 0.2 ), delta);
        assertEquals( .4, calculator.add(0.1 , 0.3 ), delta);
        assertEquals( .5, calculator.add(0.1 , 0.4 ), delta);
        assertEquals( .6, calculator.add(0.1 , 0.5 ), delta);
        assertEquals( .7, calculator.add(0.1 , 0.6 ), delta);
        assertEquals( .8, calculator.add(0.1 , 0.7 ), delta);
        assertEquals( .9, calculator.add(0.1 , 0.8 ), delta);
    }


    /**
     * @ParameterizedTest permite ejecutar una prueba unitaria varias
     * veces con diferentes parámetros. Es útil cuando se quiere
     * probar el mismo método con diferentes entradas y resultados
     * esperados, sin necesidad de escribir varias pruebas manualmente.
     *
     * @CsvSource es una anotación que se utiliza junto con ParameterizedTest
     * para proporcionar datos a la prueba. Los datos se suministran
     * en formato CSV (valores separados por comas) y se asignan a
     * los parámetros del método de prueba. Cada línea de datos
     * representa una ejecución del test con diferentes valores.
     *
     */
    @ParameterizedTest(name="Prueba resta de {0} - {1} = {2}")
    @CsvSource({
            "0, 10, -10",
            "10, 3, 7",
            "-6, -5, -1"
    })
    void subtractTest(int first, int second, int expectedResult){
        assertEquals(expectedResult, calculator.subtract(first, second));
    }

    @ParameterizedTest(name="Multiply {0} * {1} = {2}")
    @CsvSource({
            "2,4,8",
            "10,10,100",
            "5,3,15",
            "8,8,64",
            "7,5,30"
    })
    void multiplyTest (int first, int second, int expectedResult) {
        assertEquals(15, calculator.multiply(5, 3));
    }


    @ParameterizedTest(name="Divide {0} / {1} = {2}")
    @CsvSource({
            "100,2,50",
            "15,3,5",
            "22,2,11",
            "400,5,20",
            "1000,10,100"
    })
    void divideTest (int first, int second, int expectedResul) {
        assertEquals(2, calculator.divide(10, 5));
    }

    
    @Test
    @DisplayName("Divide by zero")
    void divideWithException(){
        assertThrows(IllegalArgumentException.class, ()-> calculator.divide(100,0));
    }
}
