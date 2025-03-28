package org.generation.app.util;

public class Calculator {
	
    public int add(int num1, int num2 ){
        return num1 + num2;
    }

    public double add(double num1, double num2){
        return num1 + num2;
    }

    public int subtract(int num1, int num2){
        return num1 - num2;
    }

    public int multiply(int num1, int num2){
        return num1 * num2;
    }

    public int divide(int num1, int num2){
        if( num2 == 0 ){
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return num1 / num2;
    }
    
	public static int pow(int a, int b) {
		return (int) Math.pow(a, b);
	}
    

}
