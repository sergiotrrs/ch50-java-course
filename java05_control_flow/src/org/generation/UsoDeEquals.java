package org.generation;

public class UsoDeEquals {

	public static void main(String[] args) {
		
		String identificacion = "Yoliz";
		String participante = "Jorge";
		identificacion = null;
		participante = "Yoliz";
		String name = new String("Yoliz");
		
		if( participante == "Yoliz") {
			System.out.println("Coincide el nombre");
		}
		
		if( participante == name) {
			System.out.println("Coincide el nombre");
		}
		
		if( participante.equals(name) ) {
			System.out.println("Coincide el nombre");
		}
		
	}

}
