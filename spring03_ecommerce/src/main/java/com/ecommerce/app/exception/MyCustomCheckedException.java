package com.ecommerce.app.exception;

/**
 *  Las excepciones personalizadas se utilizan para 
 *  representar errores específicos de una aplicación, 
 *  en lugar de depender solo de excepciones genéricas.
 *  
 *  Las excepciones personalizadas que heredan de Exception
 *  se usa cuando el error es esperado y el desarrollador 
 *  debe manejarlo obligatoriamente con try-catch o throws.
 *  
 *  Ideal para situaciones que requieren recuperación, 
 *  como errores en acceso a archivos, conexiones a BD o red.
 *  
 *  Casos comunes de Exception:
 *  > Errores de E/S (FileNotFoundException)
 *  > Problemas de red o BD (DatabaseConnectionException) 
 *  > Operaciones críticas que requieren recuperación (TransactionFailureException)
 *  
 *  Ventajas:
 *  - Permiten definir nombres específicos (FileNotFoundException, 
 *  facilitando la comprensión del error.
 *  
 *  - Pueden incluir información adicional como códigos de error o 
 *  detalles del contexto.
 *  
 *  Desventajas:
 *  - Crear demasiadas excepciones puede hacer que el código sea 
 *  más difícil de mantener.
 *  
 *  - Si no se documentan bien, los desarrolladores pueden usarlas 
 *  de forma incorrecta o ignorarlas.
 *  
 */
public class MyCustomCheckedException extends Exception  {

	// ID de versión para la serialización
	private static final long serialVersionUID = 1L;

	public MyCustomCheckedException(String message) {
		super(message);
	}		
	
}
